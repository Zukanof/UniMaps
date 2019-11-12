package com.unimaps.api.entities;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.unimaps.api.enums.BlocoEnum;

@Document(collection = "pavilhoes")
public class Pavilhao extends Vertice {

	private static final long serialVersionUID = -2700997597662020704L;

	private String nome;
	private List<Localizacao> salas;
	private BlocoEnum bloco;

	public Pavilhao() {
		super();
	}

	public Pavilhao(String nome, BlocoEnum bloco) {
		super();
		this.nome = nome;
		this.bloco = bloco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Localizacao> getSalas() {
		return salas;
	}

	public void setSalas(List<Localizacao> salas) {
		this.salas = salas;
	}

	@Field("bloco")
	@Enumerated(EnumType.STRING)
	public BlocoEnum getBloco() {
		return bloco;
	}
	
	public void setBloco(BlocoEnum setor) {
		this.bloco = setor;
	}

	@Override
	public String toString() {
		return "Pavilhao [nome=" + nome + ", id=" + id + ", coordenada=" + coordenada + "]";
	}
}
