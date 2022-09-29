package com.usa.alquilerbicis.servicios;

import com.usa.alquilerbicis.repositorios.RpCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCliente {
    @Autowired
    RpCliente rp;
}
