package com.ista.healthyplus.repository;


import com.ista.healthyplus.models.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ITratamientoDAO extends JpaRepository<Tratamiento,Long> {
}
