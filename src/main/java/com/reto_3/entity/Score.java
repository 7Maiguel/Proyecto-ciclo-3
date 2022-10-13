package com.reto_3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "score")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int scores;
    private String message;

    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;

    public Score(){}

    public Score(Integer scores, String message, Reservation reservation) {
        this.scores = scores;
        this.message = message;
        this.reservation = reservation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(Integer score) {
        this.scores = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
