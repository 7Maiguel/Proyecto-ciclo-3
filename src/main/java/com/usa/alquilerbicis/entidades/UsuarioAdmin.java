package com.usa.alquilerbicis.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdmoUser")
public class UsuarioAdmin {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(nullable = false, length = 250)
    private String name;

    @Column(nullable = false, length = 45)
    private String email;

    @Column(nullable = false,length = 45)
    private String password;

    public UsuarioAdmin(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UsuarioAdmin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

