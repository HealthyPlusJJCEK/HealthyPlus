package com.ista.healthyplus.repository;

import com.ista.healthyplus.models.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEspecialidadDAO extends JpaRepository<Especialidad,Long> {
}
