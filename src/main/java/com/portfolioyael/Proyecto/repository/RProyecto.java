package com.portfolioyael.Proyecto.repository;

import com.portfolioyael.Proyecto.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer> {
    
}
