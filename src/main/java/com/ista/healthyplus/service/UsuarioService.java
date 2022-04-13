package com.ista.healthyplus.service;

import com.ista.healthyplus.models.Usuario;
import com.ista.healthyplus.repository.IUsuarioDAO;
import com.ista.healthyplus.security.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private IUsuarioDAO iUsuarioDAO;
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    public List<Usuario> findAll(){
        try {
            return iUsuarioDAO.findAll()
                    .stream()
                    .peek(usuario -> {
                        try {
                            usuario.setToken(generateTokenLogin(usuario));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    })
                    .collect(Collectors.toList());
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

    public String generateTokenLogin(Usuario usuario) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(usuario.getCorreo(), usuario.getCorreo())
            );
        } catch (Exception ex) {
            throw new Exception("INAVALID");
        }
        return jwtUtil.generateToken(usuario.getCorreo());
    }
    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Optional<Usuario> usuario = iUsuarioDAO.findByCorreo(correo);
        return new org.springframework.security.core.userdetails.User(usuario.get().getCorreo(), usuario.get().getCorreo(), new ArrayList<>());
    }
}
