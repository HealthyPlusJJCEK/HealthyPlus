package com.ista.healthyplus.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;
import java.util.Date;

@Data
@Document("usuarios")
public class Usuario {

    private Long id;
    private String cedula;
    private String nombres_completos;
    private String direccion;
    private String sexo;
    private String telefono;
    private Date fecha_nacimiento;
    private String correo;
    private String clave;
    private String rol;
    private String token;
}
