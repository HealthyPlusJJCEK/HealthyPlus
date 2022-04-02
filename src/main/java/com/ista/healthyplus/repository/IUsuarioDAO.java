package com.ista.healthyplus.repository;

import com.ista.healthyplus.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUsuarioDAO extends MongoRepository<Usuario,Long> {

}
