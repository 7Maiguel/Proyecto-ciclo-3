package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RpReserva extends JpaRepository<Reserva, Integer> {
}
