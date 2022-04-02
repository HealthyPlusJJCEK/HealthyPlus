package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Consulta;
import com.ista.healthyplus.models.Enfermedad;
import com.ista.healthyplus.models.Tratamiento;
import com.ista.healthyplus.repository.IConsultaDAO;
import com.ista.healthyplus.repository.IEnfermedadDAO;
import com.ista.healthyplus.repository.ITratamientoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private IConsultaDAO iConsultaDAO;

    public List<Consulta> findAll(){
        try {
            return iConsultaDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoConsulta(Consulta consulta){
        try {
            iConsultaDAO.save(consulta);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarConsulta(Consulta consulta){
        try {
            iConsultaDAO.save(consulta);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarConsulta(Long id){
        try {
            iConsultaDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
