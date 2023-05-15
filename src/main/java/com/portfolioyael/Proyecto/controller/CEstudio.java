package com.portfolioyael.Proyecto.controller;

import com.portfolioyael.Proyecto.entity.Estudio;
import com.portfolioyael.Proyecto.service.SEstudio;
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
@RequestMapping("estudio")  //localhost:8080/estudio
@CrossOrigin(origins = "https://portfolio-frontend-yael.web.app/") //localhost:4200
public class CEstudio {
    
    @Autowired
    private SEstudio estServ;
    
    @GetMapping("/lista") 
    @ResponseBody
    public List<Estudio> verEstudio(){
        return estServ.verEstudio();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio verEstudio(@PathVariable int id){
        return estServ.buscarEstudio(id);
    }
    
    @PostMapping("/crear")  
    public void agregarEstudio(@RequestBody Estudio est){
        estServ.crearEstudio(est);
    }
    
     @DeleteMapping("/borrar/{id}")  
    public void eliminarEstudio(@PathVariable int id){
        estServ.borrarEstudio(id);
    }
    
    @PutMapping("/actualizar/{id}") 
    public void updateEstudio(@PathVariable("id") int id, @RequestBody Estudio est){  
        estServ.editarEstudio(est);
    }        
}
