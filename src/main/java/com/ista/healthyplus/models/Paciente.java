package com.ista.healthyplus.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name="paciente")
@Entity
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo_sangre;

    private String ocupacion;

    private String estado_civil;

    private Long id_usuario;

}
