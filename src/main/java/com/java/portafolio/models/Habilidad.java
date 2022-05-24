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
public class Habilidad {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String url_foto;
    private String lenguaje;

    public Habilidad() {
    }

    public Habilidad(long id, String url_foto, String lenguaje) {
        this.id = id;
        this.url_foto = url_foto;
        this.lenguaje = lenguaje;
    }
    
    
}
