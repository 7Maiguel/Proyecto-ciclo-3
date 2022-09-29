package com.usa.alquilerbicis.servicios;

import com.usa.alquilerbicis.repositorios.RpMensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMensaje {
    @Autowired
    RpMensaje rp;
}
