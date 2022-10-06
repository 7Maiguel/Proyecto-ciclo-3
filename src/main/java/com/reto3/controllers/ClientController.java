package com.reto3.controllers;

import com.reto3.entities.Client;
import com.reto3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getClients(){
        return clientService.getAll();
    }

    @PostMapping("/save")
    public Client postClient(@RequestBody Client client){
        return clientService.save(client);
    }
}
