/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.java.portafolio.Service;

import com.java.portafolio.models.Habilidad;
import java.util.List;



public interface IhabilidadService  {
    public List<Habilidad> verHabilidad();
    public void crearHabilidad(Habilidad hab);
    public void borrarHabilidad(Long id);
    public Habilidad buscarHabilidad(Long id);
    
            
}
