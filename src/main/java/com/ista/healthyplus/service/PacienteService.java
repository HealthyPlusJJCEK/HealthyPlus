package com.ista.healthyplus.service;

import com.ista.healthyplus.models.Paciente;
import com.ista.healthyplus.models.Usuario;
import com.ista.healthyplus.repository.IPacienteDAO;
import com.ista.healthyplus.repository.IUsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private IPacienteDAO iPacienteDAO;

    public List<Paciente> findAll(){
        try {
            return iPacienteDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoPaciente(Paciente paciente){
        try {
            iPacienteDAO.save(paciente);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarPaciente(Paciente paciente){
        try {
            iPacienteDAO.save(paciente);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarPaciente(Long id){
        try {
            iPacienteDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
