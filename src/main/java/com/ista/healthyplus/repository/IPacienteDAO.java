package com.ista.healthyplus.repository;

import com.ista.healthyplus.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteDAO extends JpaRepository<Paciente,Long> {
}
