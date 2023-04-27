package com.portfolioyael.Proyecto.repository;

import com.portfolioyael.Proyecto.entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository <Estudio, Integer> {
    
}
