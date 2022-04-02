package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.models.Paciente;
import com.ista.healthyplus.repository.IEspecialidadDAO;
import com.ista.healthyplus.repository.IPacienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EspeciliadadService {

    @Autowired
    private IEspecialidadDAO iEspecialidadDAO;

    public List<Especialidad> findAll(){
        try {
            return iEspecialidadDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoEspecialidad(Especialidad especialidad){
        try {
            iEspecialidadDAO.save(especialidad);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarEspecialidad(Especialidad especialidad){
        try {
            iEspecialidadDAO.save(especialidad);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarEspecialidad(Long id){
        try {
            iEspecialidadDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
