/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.portafolio.Service;

import com.java.portafolio.Repository.HabilidadRepository;
import com.java.portafolio.models.Habilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HabilidadService implements IhabilidadService {
    
    @Autowired
    HabilidadRepository habRepo;
    
    @Override
    public List<Habilidad> verHabilidad() {
        return habRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
      habRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
       return habRepo.findById(id).orElse(null);
    }
    
}
