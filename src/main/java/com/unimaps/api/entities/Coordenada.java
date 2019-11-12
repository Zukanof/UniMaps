package com.unimaps.api.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "coordenadas")
public class Coordenada {

	private String id;
	
	public Coordenada() {
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
