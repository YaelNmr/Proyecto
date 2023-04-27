package com.portfolioyael.Proyecto.repository;

import com.portfolioyael.Proyecto.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer> {
    
}
