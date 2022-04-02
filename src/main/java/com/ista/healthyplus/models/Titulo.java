package com.ista.healthyplus.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "titulo")
@Entity
public class Titulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_titulo;
}
