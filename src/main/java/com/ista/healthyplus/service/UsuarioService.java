package com.ista.healthyplus.service;

import com.ista.healthyplus.models.Usuario;
import com.ista.healthyplus.repository.IUsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioDAO iUsuarioDAO;

    public List<Usuario> findAll(){
        try {
            return iUsuarioDAO.findAll();
        }catch (Exception e){
            return null;
        }
    }

    public Boolean nuevoUsuario(Usuario usuario){
        try {
            iUsuarioDAO.insert(usuario);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean editarUsuario(Usuario usuario){
        try {
            iUsuarioDAO.save(usuario);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean eliminarUsuario(Long id){
        try {
            iUsuarioDAO.deleteAllById(Collections.singleton(id));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
