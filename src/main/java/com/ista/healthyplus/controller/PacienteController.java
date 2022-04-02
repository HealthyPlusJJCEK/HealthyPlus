package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Paciente;
import com.ista.healthyplus.models.Usuario;
import com.ista.healthyplus.service.PacienteService;
import com.ista.healthyplus.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> readAll(){
        return new ResponseEntity<List<Paciente>>(pacienteService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Paciente paciente){
        if(pacienteService.nuevoPaciente(paciente)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Paciente paciente){
        if(pacienteService.editarPaciente(paciente)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(pacienteService.eliminarPaciente(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
