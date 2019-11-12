package com.unimaps.api.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "localizacoes")
public class Localizacao extends Vertice {

	private static final long serialVersionUID = -3875643192854418511L;

	private String nome;

	public Localizacao() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Localizacao [nome=" + nome + ", id=" + id + ", coordenada=" + coordenada + "]";
	}
}
