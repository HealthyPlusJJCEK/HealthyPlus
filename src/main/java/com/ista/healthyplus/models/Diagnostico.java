package com.ista.healthyplus.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "diagnostico")
@Entity
public class Diagnostico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
}
