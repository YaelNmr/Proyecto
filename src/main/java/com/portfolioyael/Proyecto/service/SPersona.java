package com.portfolioyael.Proyecto.service;

import com.portfolioyael.Proyecto.entity.Persona;
import com.portfolioyael.Proyecto.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPersona {
    
    @Autowired
    public RPersona persoRepo;
    
    public List<Persona> verPersona(){
         return persoRepo.findAll();
    }
    
    public void crearPersona(Persona per){
        persoRepo.save(per);
    }
    
     public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }

    public Persona buscarPersona(int id) {
        return persoRepo.findById(id).orElse(null); 
    }
    
    public void editarPersona(Persona per){
        persoRepo.save(per);
    }
}
