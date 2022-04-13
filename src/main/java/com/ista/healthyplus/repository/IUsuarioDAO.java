package com.ista.healthyplus.repository;

import com.ista.healthyplus.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IUsuarioDAO extends MongoRepository<Usuario,Long> {

    Optional<Usuario> findByCorreo(String correo);
}
