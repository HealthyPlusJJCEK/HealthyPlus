package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Cita;
import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.service.CitaService;
import com.ista.healthyplus.service.EspeciliadadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    public ResponseEntity<List<Cita>> readAll(){
        return new ResponseEntity<List<Cita>>(citaService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Cita cita){
        if(citaService.nuevoCita(cita)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Cita cita){
        if(citaService.editarCita(cita)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(citaService.eliminarCita(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
