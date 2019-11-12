package com.unimaps.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unimaps.api.entities.Localizacao;

public interface LocalizacaoRepository extends MongoRepository<Localizacao, String> {

}
