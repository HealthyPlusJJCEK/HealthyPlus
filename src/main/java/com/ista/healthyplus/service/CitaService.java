package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Cita;
import com.ista.healthyplus.models.Especialidad;
import com.ista.healthyplus.repository.ICitaDAO;
import com.ista.healthyplus.repository.IEspecialidadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private ICitaDAO iCitaDAO;

    public List<Cita> findAll(){
        try {
            return iCitaDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoCita(Cita cita){
        try {
            iCitaDAO.save(cita);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarCita(Cita cita){
        try {
            iCitaDAO.save(cita);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarCita(Long id){
        try {
            iCitaDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
