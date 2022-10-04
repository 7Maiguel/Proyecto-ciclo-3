package com.usa.alquilerbicis.controladores;


import com.usa.alquilerbicis.entidades.UsuarioAdmin;
import com.usa.alquilerbicis.servicios.ServicioUsuarioAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class ControladorUsuarioAdmin {

    @Autowired
    private ServicioUsuarioAdmin admoUserService;

    @GetMapping
    public List<UsuarioAdmin> listInfoAdmoUser(){
        return admoUserService.listarAdmoUser();
    }

    @PostMapping
    public UsuarioAdmin insertAdmoUser(@RequestBody UsuarioAdmin admoUser){
        return admoUserService.guardarAdmoUser(admoUser);
    }

    @PutMapping
    public UsuarioAdmin updateAdmoUser(@RequestBody UsuarioAdmin admoUser){
        return admoUserService.actualizarAdmoUser(admoUser);
    }

    @DeleteMapping
    public void deleteAdmoUser(@RequestBody UsuarioAdmin admoUser){
        admoUserService.eliminarAdmoUser(admoUser);
    }
}

