package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.models.Tratamiento;
import com.ista.healthyplus.service.EspeciliadadService;
import com.ista.healthyplus.service.TratamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/tratamientos")
public class TratamientoController {

    @Autowired
    private TratamientoService tratamientoService;

    @GetMapping
    public ResponseEntity<List<Tratamiento>> readAll(){
        return new ResponseEntity<List<Tratamiento>>(tratamientoService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Tratamiento tratamiento){
        if(tratamientoService.nuevoTratamiento(tratamiento)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Tratamiento tratamiento){
        if(tratamientoService.editarTratamiento(tratamiento)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(tratamientoService.eliminarTratamiento(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
