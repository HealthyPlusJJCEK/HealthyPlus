package com.ista.healthyplus.repository;

import com.ista.healthyplus.models.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITItuloDAO extends JpaRepository<Titulo,Long> {
}
