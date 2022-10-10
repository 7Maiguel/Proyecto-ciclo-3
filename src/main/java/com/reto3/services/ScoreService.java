package com.reto3.services;

import com.reto3.entities.Score;
import com.reto3.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreRepository.getAll();
    }

    public Optional<Score> getScore(int idScore){return scoreRepository.getScore(idScore);}

    public Score save(Score score){
        if(score.getScore() >= 0 && score.getScore() <= 5){
            if(score.getId() == null){
                return scoreRepository.save(score);
            } else {
                Optional<Score> e = scoreRepository.getScore(score.getId());

                if(e.isEmpty()){
                    return scoreRepository.save(score);
                }
            }
        }
        return score;
    }
}