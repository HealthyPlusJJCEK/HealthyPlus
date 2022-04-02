package com.ista.healthyplus.service;

import com.ista.healthyplus.models.Enfermedad;
import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.repository.IEnfermedadDAO;
import com.ista.healthyplus.repository.IEspecialidadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EnfermedadService {

    @Autowired
    private IEnfermedadDAO iEnfermedadDAO;

    public List<Enfermedad> findAll(){
        try {
            return iEnfermedadDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoEnfermedad(Enfermedad enfermedad){
        try {
            iEnfermedadDAO.save(enfermedad);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarEnfermedad(Enfermedad enfermedad){
        try {
            iEnfermedadDAO.save(enfermedad);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarEnfermedad(Long id){
        try {
            iEnfermedadDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
