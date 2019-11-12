package com.unimaps.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "caminhos")
public class Aresta implements Serializable{

	protected static final long serialVersionUID = -2830096149683462556L;

	@Id
	private String id;
	private Vertice origem;
	private Vertice destino;
	private List<Coordenada> coordenadas;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

	public List<Coordenada> getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(List<Coordenada> coordenadas) {
		this.coordenadas = coordenadas;
	}

	

}
