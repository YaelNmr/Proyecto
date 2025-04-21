package com.portfolioyael.Proyecto.controller;

import com.portfolioyael.Proyecto.entity.Experiencia;
import com.portfolioyael.Proyecto.service.SExperiencia;
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
@RequestMapping("/experiencia")  //localhost:8080/experiencia
@CrossOrigin(origins = {"https://portfolio-yael.web.app"})   //localhost:4200
public class CExperiencia {
    
    @Autowired
    private SExperiencia expServ;
    
    @GetMapping("/lista") 
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expServ.verExperiencia();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id){
        return expServ.buscarExperiencia(id);
    }
    
    @PostMapping("/crear")  
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
     @DeleteMapping("/borrar/{id}")  
    public void eliminarExperiencia(@PathVariable int id){
        expServ.borrarExperiencia(id);
    }
    
    @PutMapping("/actualizar/{id}") 
    public void updateExperiencia(@PathVariable("id") int id, @RequestBody Experiencia exp){  
        expServ.editarExperiencia(exp);
    }  
}
