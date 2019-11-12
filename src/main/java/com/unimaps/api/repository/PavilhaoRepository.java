package com.unimaps.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.unimaps.api.entities.Pavilhao;
import com.unimaps.api.enums.BlocoEnum;

public interface PavilhaoRepository extends MongoRepository<Pavilhao, String> {

	@Query("{ 'bloco' : ?0 } ")
	List<Pavilhao> findByBloco(BlocoEnum bloco);
}
