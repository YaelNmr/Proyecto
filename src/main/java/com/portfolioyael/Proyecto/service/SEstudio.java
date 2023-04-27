package com.portfolioyael.Proyecto.service;

import com.portfolioyael.Proyecto.entity.Estudio;
import com.portfolioyael.Proyecto.repository.REstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEstudio {
    
    @Autowired
    public REstudio estRepo;
    
    public List<Estudio> verEstudio(){
         return estRepo.findAll();
    }
    
    public void crearEstudio(Estudio est){
        estRepo.save(est);
    }
    
     public void borrarEstudio(int id) {
        estRepo.deleteById(id);
    }

    public Estudio buscarEstudio(int id) {
        return estRepo.findById(id).orElse(null); 
    }
    
    public void editarEstudio(Estudio est){
        estRepo.save(est);
    }   
}
