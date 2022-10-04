package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.UsuarioAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RpUsuarioAdmin extends JpaRepository<UsuarioAdmin, Integer> {
}
