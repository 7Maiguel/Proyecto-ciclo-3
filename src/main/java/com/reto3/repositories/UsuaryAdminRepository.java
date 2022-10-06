package com.reto3.repositories;

import com.reto3.entities.UsuaryAdmin;
import com.reto3.repositories.crudRepositories.UsuaryAdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuaryAdminRepository {
    @Autowired
    private UsuaryAdminCrudRepository usuaryAdminCrudRepository;

    public List<UsuaryAdmin> getAll(){
        return (List<UsuaryAdmin>) usuaryAdminCrudRepository.findAll();
    }

    public UsuaryAdmin save(UsuaryAdmin usuaryAdmin){
        return usuaryAdminCrudRepository.save(usuaryAdmin);
    }

    public Optional<UsuaryAdmin> getUsuaryAdmin(Integer id){
        return usuaryAdminCrudRepository.findById(id);
    }

    /*public void delete(UsuaryAdmin usuaryAdmin){
        usuaryAdminCrudRepository.delete(usuaryAdmin);
    }*/
}
