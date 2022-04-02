package com.ista.healthyplus.service;

import com.ista.healthyplus.models.Paciente;
import com.ista.healthyplus.models.Sucursal;
import com.ista.healthyplus.repository.IPacienteDAO;
import com.ista.healthyplus.repository.ISucursalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SucursalService {

    @Autowired
    private ISucursalDAO iSucursalDAO;

    public List<Sucursal> findAll(){
        try {
            return iSucursalDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoSucarsal(Sucursal sucursal){
        try {
            iSucursalDAO.save(sucursal);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarSucarsal(Sucursal sucursal){
        try {
            iSucursalDAO.save(sucursal);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarSucarsal(Long id){
        try {
            iSucursalDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
