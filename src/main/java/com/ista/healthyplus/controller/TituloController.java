package com.ista.healthyplus.controller;


import com.ista.healthyplus.models.Sucursal;
import com.ista.healthyplus.models.Titulo;
import com.ista.healthyplus.service.SucursalService;
import com.ista.healthyplus.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("api/titulo")
public class TituloController {

    @Autowired
    private TituloService tituloService;

    @GetMapping
    public ResponseEntity<List<Titulo>> readAll(){
        return new ResponseEntity<List<Titulo>>(tituloService.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody Titulo titulo){
        if(tituloService.nuevoTitulo(titulo)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody Titulo titulo){
        if(tituloService.editarTitulo(titulo)){
            return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        if(tituloService.eliminarTitulo(id)){
            return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
        }else {
            return new ResponseEntity<Boolean>(false,HttpStatus.FOUND);
        }
    }
}
