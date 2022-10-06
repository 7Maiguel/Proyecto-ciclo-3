package com.reto3.repositories.crudRepositories;

import com.reto3.entities.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeCrudRepository extends CrudRepository<Bike, Integer> {}

