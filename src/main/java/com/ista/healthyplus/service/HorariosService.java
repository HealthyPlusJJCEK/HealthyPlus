package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Horarios;
import com.ista.healthyplus.models.Medico;
import com.ista.healthyplus.repository.IHorarioDAO;
import com.ista.healthyplus.repository.IMedicoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class HorariosService {

    @Autowired
    private IHorarioDAO iHorarioDAO;

    public List<Horarios> findAll(){
        try {
            return iHorarioDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoHorarios(Horarios horarios){
        try {
            iHorarioDAO.save(horarios);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarHorarios(Horarios horarios){
        try {
            iHorarioDAO.save(horarios);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarHorarios(Long id){
        try {
            iHorarioDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
