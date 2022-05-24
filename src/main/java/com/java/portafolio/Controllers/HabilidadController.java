/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.portafolio.Controllers;

import com.java.portafolio.Service.IhabilidadService;
import com.java.portafolio.models.Habilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HabilidadController {
    @Autowired
    private IhabilidadService habService;
    
    @PostMapping("/new/habilidad")
    public String agregarHabilidad(@RequestBody Habilidad hab){
        habService.crearHabilidad(hab);
        return "La habilidad se creó correctamente";
    }
    
    @DeleteMapping("/delete/habilidad/{id}")
    public String borrarHabilidad(@PathVariable Long id){
        habService.borrarHabilidad(id);
        return "La habilidad se eliminó correctamente";
        
    }
    
    @GetMapping("/ver/habilidad")
    @ResponseBody
    public List<Habilidad> traerHabilidad(){
        return habService.verHabilidad();
    }
    
    @GetMapping("/buscar/habilidad/{id}")
        public Habilidad traerHabilidad(@PathVariable Long id){
            Habilidad h = habService.buscarHabilidad(id);
            return h;
        }
}
