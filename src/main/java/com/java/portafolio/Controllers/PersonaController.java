/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.portafolio.Controllers;

import com.java.portafolio.Service.IpersonaService;
import com.java.portafolio.models.Persona;
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
public class PersonaController {
    @Autowired
    private IpersonaService persoService;
    
    @PostMapping("/new/persona")
    public String agregarPersona(@RequestBody Persona per){
       persoService.crearPersona(per);
       return "La persona se creó correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deletePersona(@PathVariable Long id){
        persoService.borrarPersona(id);
        return "La persona se eliminó correctamente";
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> traerPersonas(){
       return persoService.verPersonas();
    }
    
    @GetMapping("/personas/{id}")
	public Persona traerPersona(@PathVariable Long id) {
		Persona p = persoService.buscarPersona(id);
		return p;
}
        
}
