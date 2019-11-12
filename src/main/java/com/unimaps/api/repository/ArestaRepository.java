package com.unimaps.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unimaps.api.entities.Aresta;

public interface ArestaRepository extends MongoRepository<Aresta, String> {

}
