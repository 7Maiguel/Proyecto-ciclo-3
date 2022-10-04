package com.usa.alquilerbicis.servicios;

import com.usa.alquilerbicis.entidades.Bicicleta;
import com.usa.alquilerbicis.repositorios.RpBicicleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioBicicleta {
    @Autowired
    private RpBicicleta rpBike;

    public List<Bicicleta>listarBike(){
        return rpBike.findAll();
    }

    public Bicicleta actualizarBike(Bicicleta bike){
        return rpBike.save(bike);
    }

    public Bicicleta guardarBike(Bicicleta bike){
        return rpBike.save(bike);
    }

    public void eliminarBike(Bicicleta bike){
        rpBike.delete(bike);
    }
}
