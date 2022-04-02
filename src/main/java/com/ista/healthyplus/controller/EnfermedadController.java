package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Enfermedad;
import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.service.EnfermedadService;
import com.ista.healthyplus.service.EspeciliadadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/enfermedades")
public class EnfermedadController {

    @Autowired
    private EnfermedadService enfermedadService;

    @GetMapping
    public ResponseEntity<List<Enfermedad>> readAll(){
        return new ResponseEntity<List<Enfermedad>>(enfermedadService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Enfermedad especialidad){
        if(enfermedadService.nuevoEnfermedad(especialidad)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Enfermedad enfermedad){
        if(enfermedadService.editarEnfermedad(enfermedad)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(enfermedadService.eliminarEnfermedad(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
