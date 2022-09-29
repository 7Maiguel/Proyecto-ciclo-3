package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RpMensaje extends JpaRepository<Mensaje, Integer> {
}
