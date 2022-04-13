package com.ista.healthyplus.service;


import com.ista.healthyplus.models.Medico;
import com.ista.healthyplus.repository.IMedicoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoService {

    @Autowired
    private IMedicoDAO iMedicoDAO;
    @Autowired
    private S3Service s3Service;

    public List<Medico> findAll(){
        try {
            return iMedicoDAO.findAll()
                    .stream()
                    .peek(medico -> medico.setUrlfoto(s3Service.getObjectUrl(medico.getFoto())))
                    .collect(Collectors.toList());
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
