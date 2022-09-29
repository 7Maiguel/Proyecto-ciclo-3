package com.usa.alquilerbicis.servicios;

import com.usa.alquilerbicis.repositorios.RpUsuarioAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuarioAdmin {
    @Autowired
    RpUsuarioAdmin rp;
}
