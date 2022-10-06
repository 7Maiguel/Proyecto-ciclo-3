package com.reto3.controllers;

import com.reto3.entities.Bike;
import com.reto3.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Bike")
public class BikeController {
    @Autowired
    private BikeService bikeService;

    @GetMapping("/all")
    public List<Bike> getBikes(){
        return bikeService.getAll();
    }

    @PostMapping("/save")
    public Bike postBike(@RequestBody Bike bike){
        return bikeService.save(bike);
    }
}
