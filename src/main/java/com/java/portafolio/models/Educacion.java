/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.portafolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String institucion;
    private String carrera;
    private int anioEntrada;
    private int anioSalida;

    public Educacion() {
    }

    public Educacion(long id, String institucion, String carrera, int anioEntrada, int anioSalida) {
        this.id = id;
        this.institucion = institucion;
        this.carrera = carrera;
        this.anioEntrada = anioEntrada;
        this.anioSalida = anioSalida;
    }
    
    
}
