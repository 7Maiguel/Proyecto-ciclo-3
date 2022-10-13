package com.reto_3.controller;


import com.reto_3.entity.Bike;
import com.reto_3.entity.Client;
import com.reto_3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public Client postClient(@RequestBody Client client){
        return clientService.save(client);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client postClient2(@RequestBody Client client){
        return clientService.save(client);
    }

    @PutMapping("/update")
    public Client putClient(@RequestBody Client client){
        return clientService.update(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@RequestBody Client client){
        clientService.delete(client.getIdClient());
    }

}
