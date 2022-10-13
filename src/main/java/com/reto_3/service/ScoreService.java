package com.reto_3.service;

import com.reto_3.entity.Bike;
import com.reto_3.entity.Score;
import com.reto_3.repository.ScoreRepository;
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
        if(score.getScores() >= 0 && score.getScores() <= 5){
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
    public Score update(Score data){
        if(data.getId()!=null){
            Optional<Score> q = scoreRepository.getScore(data.getId());
            if(q.isPresent()){
                q.get().setScores(data.getScores());
                if(data.getMessage()!=null){
                    q.get().setMessage(data.getMessage());
                }
                scoreRepository.save(q.get());
                return q.get();

            }else {
                return data;
            }

        }else {
            return data;
        }
    }


    public boolean delete(int id){
        Boolean flag=false;
        Optional<Score> score=scoreRepository.getScore(id);
        if(score.isPresent()){
            scoreRepository.deleteScore(score.get().getId());
            flag=true;
        }
        return flag;
    }
}
