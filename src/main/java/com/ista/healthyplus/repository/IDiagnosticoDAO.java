package com.ista.healthyplus.repository;


import com.ista.healthyplus.models.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDiagnosticoDAO extends JpaRepository<Diagnostico,Long> {
}
