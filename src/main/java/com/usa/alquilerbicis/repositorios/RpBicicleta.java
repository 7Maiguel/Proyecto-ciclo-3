package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RpBicicleta extends JpaRepository<Bicicleta, Integer> {
}
