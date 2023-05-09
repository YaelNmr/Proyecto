package com.portfolioyael.Proyecto.controller;

import com.portfolioyael.Proyecto.entity.Persona;
import com.portfolioyael.Proyecto.service.SPersona;
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
@RequestMapping("persona")  //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    
    @Autowired
    private SPersona persoServ;
    
    @GetMapping("/lista") //método Get "dame datos"
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersona();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping("/crear")  //método Post "agregame datos"
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }

    @DeleteMapping("/borrar/{id}")  //métedo Delete "borrame esta id"
    public void eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
    }
     
    @PutMapping("/actualizar/{id}")   //al tener solo el @RequestBody para actualizar datos en postman hay que agregar todos los datos en el json incluido el id 
    public void updatePersona(@PathVariable("id") int id, @RequestBody Persona pers){  
        persoServ.editarPersona(pers);
    }
}
