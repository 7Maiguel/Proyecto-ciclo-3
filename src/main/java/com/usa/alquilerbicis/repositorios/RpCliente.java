package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RpCliente extends JpaRepository<Cliente, Integer> {
}
