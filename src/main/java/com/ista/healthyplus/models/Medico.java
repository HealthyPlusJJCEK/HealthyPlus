package com.ista.healthyplus.models;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Table(name = "medico")
@Entity
public class Medico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String foto;

    private Long id_usuario;


    @ManyToMany
    @JoinTable(name = "medico_sucursal",
            joinColumns=@JoinColumn(name = "id_medico"),
            inverseJoinColumns = @JoinColumn(name = "id_sucursal"))
    private Set<Sucursal> sucursal;


    @ManyToMany
    @JoinTable(name = "medico_especialidad",
            joinColumns=@JoinColumn(name = "id_medico"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad"))
    private Set<Especialidad> especialidad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "titulo_id",referencedColumnName = "id")
    private Titulo titulo;

    @ManyToMany
    @JoinTable(name = "medico_horarios",
            joinColumns=@JoinColumn(name = "id_medico"),
            inverseJoinColumns = @JoinColumn(name = "id_horario"))
    private Set<Horarios> horarios;
}
