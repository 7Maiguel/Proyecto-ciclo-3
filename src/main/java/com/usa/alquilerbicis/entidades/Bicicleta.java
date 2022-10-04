package com.usa.alquilerbicis.entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
public class Bicicleta {

    @Id
    @Column(name = "id")
    private int id;

    @Column(nullable = false,length = 45)
    private String brand;
    @Column(nullable = false, length = 4)
    private int model;
    @Column(nullable = false)
    private int category;
    @Column(nullable = false, length = 45)
    private String name;
    @Column(length =250)
    private String description;

    public Bicicleta(int id, String brand, int model, int category, String name, String description) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.category= category;
        this.name = name;
        this.description = description;
    }

    public Bicicleta() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
