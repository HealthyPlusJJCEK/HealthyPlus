package com.ista.healthyplus.repository;


import com.ista.healthyplus.models.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IConsultaDAO extends JpaRepository<Consulta,Long> {
}
