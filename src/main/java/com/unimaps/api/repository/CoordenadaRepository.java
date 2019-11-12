package com.unimaps.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unimaps.api.entities.Coordenada;

public interface CoordenadaRepository extends MongoRepository<Coordenada, String>{

}
