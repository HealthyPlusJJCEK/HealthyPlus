package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Horarios;
import com.ista.healthyplus.models.Medico;
import com.ista.healthyplus.service.HorariosService;
import com.ista.healthyplus.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/horarios")
public class HorariosController {

    @Autowired
    private HorariosService horariosService;

    @GetMapping
    public ResponseEntity<List<Horarios>> readAll(){
        return new ResponseEntity<List<Horarios>>(horariosService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Horarios horarios){
        if(horariosService.nuevoHorarios(horarios)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Horarios horarios){
        if(horariosService.editarHorarios(horarios)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(horariosService.eliminarHorarios(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
