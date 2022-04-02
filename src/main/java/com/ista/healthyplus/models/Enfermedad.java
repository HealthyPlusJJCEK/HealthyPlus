package com.ista.healthyplus.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "enfermedad")
@Entity
public class Enfermedad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
