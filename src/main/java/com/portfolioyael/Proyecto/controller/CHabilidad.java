package com.portfolioyael.Proyecto.controller;

import com.portfolioyael.Proyecto.entity.Habilidad;
import com.portfolioyael.Proyecto.service.SHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidad")  //localhost:8080/habilidad
@CrossOrigin(origins = {"https://portfolio-frontend-yael.web.app/"})  //localhost:4200
public class CHabilidad {
    
    @Autowired
    private SHabilidad habServ;
    
    @GetMapping("/lista") 
    @ResponseBody
    public List<Habilidad> verHabilidad(){
        return habServ.verHabilidad();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id){
        return habServ.buscarHabilidad(id);
    }
    
    @PostMapping("/crear")  
    public void agregarHabilidad(@RequestBody Habilidad hab){
        habServ.crearHabilidad(hab);
    }
    
    @DeleteMapping("/borrar/{id}")  
    public void eliminarHabilidad(@PathVariable int id){
        habServ.borrarHabilidad(id);
    }
     
    @PutMapping("/actualizar/{id}")   
    public void updateHabilidad(@PathVariable("id") int id, @RequestBody Habilidad hab){  
        habServ.editarHabilidad(hab);
    }
}
