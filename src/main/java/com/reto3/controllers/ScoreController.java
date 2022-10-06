package com.reto3.controllers;

import com.reto3.entities.Score;
import com.reto3.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/save")
    public Score postScore(@RequestBody Score data){
        return scoreService.save(data);
    }
}
