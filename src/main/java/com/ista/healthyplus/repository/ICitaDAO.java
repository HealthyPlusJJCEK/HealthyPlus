package com.ista.healthyplus.repository;


import com.ista.healthyplus.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaDAO extends JpaRepository<Cita,Long> {
}
