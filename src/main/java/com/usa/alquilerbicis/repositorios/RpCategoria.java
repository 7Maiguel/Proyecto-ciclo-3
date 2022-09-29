package com.usa.alquilerbicis.repositorios;

import com.usa.alquilerbicis.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RpCategoria extends JpaRepository<Categoria, Integer> {
}
