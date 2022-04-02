package com.ista.healthyplus.repository;


import com.ista.healthyplus.models.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHorarioDAO extends JpaRepository<Horarios,Long> {
}
