package com.ista.healthyplus.service;

import com.ista.healthyplus.models.Diagnostico;
import com.ista.healthyplus.models.Enfermedad;
import com.ista.healthyplus.repository.IDiagnosticoDAO;
import com.ista.healthyplus.repository.IEnfermedadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DiagnosticoService {

    @Autowired
    private IDiagnosticoDAO iDiagnosticoDAO;

    public List<Diagnostico> findAll(){
        try {
            return iDiagnosticoDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoDiagnostico(Diagnostico diagnostico){
        try {
            iDiagnosticoDAO.save(diagnostico);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarDiagnostico(Diagnostico diagnostico){
        try {
            iDiagnosticoDAO.save(diagnostico);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarDiagnostico(Long id){
        try {
            iDiagnosticoDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
