package com.usa.alquilerbicis.servicios;

import com.usa.alquilerbicis.repositorios.RpReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioReserva {
    @Autowired
    RpReserva rp;
}
