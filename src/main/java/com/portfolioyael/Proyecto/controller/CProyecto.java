package com.portfolioyael.Proyecto.controller;

import com.portfolioyael.Proyecto.entity.Proyecto;
import com.portfolioyael.Proyecto.service.SProyecto;
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
@RequestMapping("proyecto")  //localhost:8080/proyecto
@CrossOrigin(origins = {"https://portfolio-frontend-yael.web.app/"})  //localhost:4200
public class CProyecto {
    
    @Autowired
    private SProyecto proyeServ;
     
    @GetMapping("/lista") 
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyeServ.verProyecto();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyeServ.buscarProyecto(id);
    }
    
    @PostMapping("/crear")  
    public void agregarProyecto(@RequestBody Proyecto pro){
        proyeServ.crearProyecto(pro);
    }
    
    @DeleteMapping("/borrar/{id}")  
    public void eliminarProyecto(@PathVariable int id){
        proyeServ.borrarProyecto(id);
    }
     
    @PutMapping("/actualizar/{id}")   
    public void updateProyecto(@PathVariable("id") int id, @RequestBody Proyecto pro){  
        proyeServ.editarProyecto(pro);
    } 
}
