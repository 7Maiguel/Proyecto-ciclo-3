package com.reto_3.controller;

import com.reto_3.entity.Score;
import com.reto_3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public Score postScore(@RequestBody Score data){
        return scoreService.save(data);
    }

}
