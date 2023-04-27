package com.portfolioyael.Proyecto.service;

import com.portfolioyael.Proyecto.entity.Experiencia;
import com.portfolioyael.Proyecto.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia {
    
    @Autowired
    public RExperiencia expRepo;
    
    public List<Experiencia> verExperiencia(){
         return expRepo.findAll();
    }
    
    public void crearExperiencia(Experiencia exp){
        expRepo.save(exp);
    }
    
     public void borrarExperiencia(int id) {
        expRepo.deleteById(id);
    }

    public Experiencia buscarExperiencia(int id) {
        return expRepo.findById(id).orElse(null); 
    }
    
    public void editarExperiencia(Experiencia exp){
        expRepo.save(exp);
    }   
}
