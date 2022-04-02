package com.ista.healthyplus.repository;


import com.ista.healthyplus.models.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISucursalDAO extends JpaRepository<Sucursal,Long> {
}
