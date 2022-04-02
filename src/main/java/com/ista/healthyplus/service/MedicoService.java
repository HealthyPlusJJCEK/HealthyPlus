package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Medico;
import com.ista.healthyplus.repository.IMedicoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private IMedicoDAO iMedicoDAO;

    public List<Medico> findAll(){
        try {
            return iMedicoDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoMedico(Medico medico){
        try {
            iMedicoDAO.save(medico);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarMedico(Medico medico){
        try {
            iMedicoDAO.save(medico);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarMedico(Long id){
        try {
            iMedicoDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
