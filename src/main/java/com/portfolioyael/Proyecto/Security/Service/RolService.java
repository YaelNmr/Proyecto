package com.portfolioyael.Proyecto.Security.Service;

import com.portfolioyael.Proyecto.Security.Entity.Rol;
import com.portfolioyael.Proyecto.Security.Enums.RolNombre;
import com.portfolioyael.Proyecto.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
