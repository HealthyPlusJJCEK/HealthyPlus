package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.models.Paciente;
import com.ista.healthyplus.service.EspeciliadadService;
import com.ista.healthyplus.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/especiliades")
public class EspecialidadController {


    @Autowired
    private EspeciliadadService especiliadadService;

    @GetMapping
    public ResponseEntity<List<Especialidad>> readAll(){
        return new ResponseEntity<List<Especialidad>>(especiliadadService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Especialidad especialidad){
        if(especiliadadService.nuevoEspecialidad(especialidad)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Especialidad especialidad){
        if(especiliadadService.editarEspecialidad(especialidad)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(especiliadadService.eliminarEspecialidad(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
