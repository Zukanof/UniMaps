package com.unimaps.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

public abstract class Vertice implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String id;
	protected List<Vertice> vizinhos;
	protected List<Aresta> arestas;
	protected Coordenada coordenada;

	public Vertice() {
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Vertice> getVertices() {
		return vizinhos;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vizinhos = vertices;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
}
