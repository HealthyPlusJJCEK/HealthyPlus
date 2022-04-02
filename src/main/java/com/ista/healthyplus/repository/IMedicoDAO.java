package com.ista.healthyplus.repository;

import com.ista.healthyplus.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoDAO extends JpaRepository<Medico,Long> {
}
