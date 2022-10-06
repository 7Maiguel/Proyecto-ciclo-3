package com.reto3.controllers;

import com.reto3.entities.UsuaryAdmin;
import com.reto3.services.UsuaryAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class UsuaryAdminController {

    @Autowired
    private UsuaryAdminService usuaryAdminService;

    @GetMapping("/all")
    public List<UsuaryAdmin> getAdmins(){
        return usuaryAdminService.getAll();
    }

    @PostMapping("/save")
    public UsuaryAdmin postAdmin(@RequestBody UsuaryAdmin usuaryAdmin){
        return usuaryAdminService.save(usuaryAdmin);
    }
}
