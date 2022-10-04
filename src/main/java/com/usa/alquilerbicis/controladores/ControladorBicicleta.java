package com.usa.alquilerbicis.controladores;

import com.usa.alquilerbicis.entidades.Bicicleta;
import com.usa.alquilerbicis.servicios.ServicioBicicleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class ControladorBicicleta {

    @Autowired
    private ServicioBicicleta bikeService;

    @GetMapping
    public List<Bicicleta> listInfoBike(){
        return bikeService.listarBike();
    }

    @PostMapping
    public Bicicleta insertBike(@RequestBody Bicicleta bike ){
        return bikeService.guardarBike(bike);
    }
    @PutMapping
    public Bicicleta updateBike(@RequestBody Bicicleta bike){
        return bikeService.actualizarBike(bike);
    }

    @DeleteMapping
    public void deleteBike(@RequestBody Bicicleta bike){
        bikeService.eliminarBike(bike);
    }
}
