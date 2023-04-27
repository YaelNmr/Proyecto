package com.portfolioyael.Proyecto.service;

import com.portfolioyael.Proyecto.entity.Habilidad;
import com.portfolioyael.Proyecto.repository.RHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHabilidad {
    
    @Autowired
    public RHabilidad habRepo;
    
    public List<Habilidad> verHabilidad(){
         return habRepo.findAll();
    }
    
    public void crearHabilidad(Habilidad hab){
        habRepo.save(hab);
    }
    
     public void borrarHabilidad(int id) {
        habRepo.deleteById(id);
    }

    public Habilidad buscarHabilidad(int id) {
        return habRepo.findById(id).orElse(null); 
    }
    
    public void editarHabilidad(Habilidad hab){
        habRepo.save(hab);
    }
}
