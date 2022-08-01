/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.portafolio.Controllers;

import com.java.portafolio.Service.IeducacionService;
import com.java.portafolio.models.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
public class EducacionController {
    @Autowired
    private IeducacionService eduService;
    
    @PostMapping("/new/educacion")
    public String agregarEducacion(@RequestBody Educacion edu){
        eduService.crearEducacion(edu);
        return "Educacion creada correctamente";
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    public String borrarEducacion(@PathVariable Long id){
        eduService.borrarEducacion(id);
        return "Educacion eliminada correctamente";
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduService.verEducacion();
    }
    
    @GetMapping("/educacion/{id}")
    public Educacion traerEducacion(@PathVariable Long id) {
		Educacion e = eduService.buscarEducacion(id);
		return e;
    }
}
