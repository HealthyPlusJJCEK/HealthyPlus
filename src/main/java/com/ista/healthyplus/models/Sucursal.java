package com.ista.healthyplus.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "sucursal")
@Entity
public class Sucursal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String direccion;

    private String telefono;
}
