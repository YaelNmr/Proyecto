package com.portfolioyael.Proyecto.service;

import com.portfolioyael.Proyecto.entity.Proyecto;
import com.portfolioyael.Proyecto.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyecto {
    
    @Autowired
    public RProyecto proyeRepo;
    
    public List<Proyecto> verProyecto(){
         return proyeRepo.findAll();
    }
    
    public void crearProyecto(Proyecto pro){
        proyeRepo.save(pro);
    }
    
     public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }

    public Proyecto buscarProyecto(int id) {
        return proyeRepo.findById(id).orElse(null); 
    }
    
    public void editarProyecto(Proyecto pro){
        proyeRepo.save(pro);
    }
}
