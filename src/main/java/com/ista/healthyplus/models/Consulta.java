package com.ista.healthyplus.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Table(name = "consulta")
@Entity
public class Consulta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;

    private String motivo;

    private String presion_arterial;

    private String frecuencia_cardaica;

    private String temperatura;

    private String talla;

    private String peso;

    private String conclusion;

    @ManyToMany
    @JoinTable(name = "consulta_paciente",
            joinColumns=@JoinColumn(name = "id_consulta"),
            inverseJoinColumns = @JoinColumn(name = "id_paciente") )
    private Set<Paciente> pacienteSet;
    @ManyToMany
    @JoinTable(name = "consulta_medico",
            joinColumns=@JoinColumn(name = "id_consulta"),
            inverseJoinColumns = @JoinColumn(name = "id_medico") )
    private Set<Medico> medicoSet;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "diagnostico_id",referencedColumnName = "id")
    private Diagnostico diagnostico;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tratamiento_id",referencedColumnName = "id")
    private Tratamiento tratamiento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enfermedad_id",referencedColumnName = "id")
    private Enfermedad enfermedad;

}
