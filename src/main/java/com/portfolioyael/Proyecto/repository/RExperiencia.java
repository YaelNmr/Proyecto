package com.portfolioyael.Proyecto.repository;

import com.portfolioyael.Proyecto.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer> {
    
}
