package com.ista.healthyplus.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Data
@Table(name = "cita")
@Entity
public class Cita implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado;

    @ManyToMany
    @JoinTable(name = "cita_medico",
            joinColumns=@JoinColumn(name = "id_cita"),
            inverseJoinColumns = @JoinColumn(name = "id_medico"))
    private Set<Medico> medico;

   @ManyToMany
   @JoinTable(name = "cita_paciente",
           joinColumns=@JoinColumn(name = "id_cita"),
           inverseJoinColumns = @JoinColumn(name = "id_paciente"))
   private Set<Paciente> paciente;


    @ManyToMany
    @JoinTable(name = "cita_horarios",
            joinColumns=@JoinColumn(name = "id_cita"),
            inverseJoinColumns = @JoinColumn(name = "id_horario"))
   private Set<Horarios> horarios;
}
