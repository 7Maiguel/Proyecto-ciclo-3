package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RpBicicleta extends JpaRepository<Bicicleta, Integer> {
}
