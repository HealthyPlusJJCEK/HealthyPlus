package com.ista.healthyplus.models;


import lombok.Data;
import org.apache.tomcat.jni.Time;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;


@Data
@Table(name = "horarios")
@Entity
public class Horarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dia;

    private String hora_inico;

    private String hora_final;
}
