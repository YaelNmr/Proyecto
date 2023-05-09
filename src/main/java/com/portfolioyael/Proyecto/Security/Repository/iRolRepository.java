package com.portfolioyael.Proyecto.Security.Repository;

import com.portfolioyael.Proyecto.Security.Entity.Rol;
import com.portfolioyael.Proyecto.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
