package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Enfermedad;
import com.ista.healthyplus.models.Tratamiento;
import com.ista.healthyplus.repository.IEnfermedadDAO;
import com.ista.healthyplus.repository.ITratamientoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TratamientoService {

    @Autowired
    private ITratamientoDAO iTratamientoDAO;

    public List<Tratamiento> findAll(){
        try {
            return iTratamientoDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoTratamiento(Tratamiento tratamiento){
        try {
            iTratamientoDAO.save(tratamiento);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarTratamiento(Tratamiento tratamiento){
        try {
            iTratamientoDAO.save(tratamiento);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarTratamiento(Long id){
        try {
            iTratamientoDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
