package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.models.Titulo;
import com.ista.healthyplus.repository.IEspecialidadDAO;
import com.ista.healthyplus.repository.ITItuloDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TituloService {

    @Autowired
    private ITItuloDAO itItuloDAO;

    public List<Titulo> findAll(){
        try {
            return itItuloDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoTitulo(Titulo titulo){
        try {
            itItuloDAO.save(titulo);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarTitulo(Titulo titulo){
        try {
            itItuloDAO.save(titulo);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarTitulo(Long id){
        try {
            itItuloDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
