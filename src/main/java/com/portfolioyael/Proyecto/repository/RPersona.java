package com.portfolioyael.Proyecto.repository;

import com.portfolioyael.Proyecto.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona  extends JpaRepository <Persona, Integer> {
    
}
