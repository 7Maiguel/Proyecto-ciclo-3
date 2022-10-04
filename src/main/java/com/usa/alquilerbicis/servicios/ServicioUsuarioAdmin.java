package com.usa.alquilerbicis.servicios;

import com.usa.alquilerbicis.entidades.UsuarioAdmin;
import com.usa.alquilerbicis.repositorios.RpUsuarioAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUsuarioAdmin {
    @Autowired
    private RpUsuarioAdmin rpAdmoUser ;

    public List<UsuarioAdmin> listarAdmoUser(){
        return rpAdmoUser.findAll();
    }

    public UsuarioAdmin actualizarAdmoUser(UsuarioAdmin admoUser){
        return rpAdmoUser.save(admoUser);
    }
    public UsuarioAdmin guardarAdmoUser(UsuarioAdmin admoUser){
        return rpAdmoUser.save(admoUser);
    }
    public void eliminarAdmoUser(UsuarioAdmin admoUser){
        rpAdmoUser.delete(admoUser);
    }
}
