package com.unimaps.api.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import com.unimaps.api.dto.LocalizacaoDTO;

@Document(collection = "localizacoes")
public class Localizacao extends Vertice {

	private static final long serialVersionUID = -3875643192854418511L;

	private String nome;

	public Localizacao() {
	}

	public Localizacao(LocalizacaoDTO localizacaoDto) {
		localizacaoDto.getId().ifPresent(id -> {
            super.id = id;
        });
        
        Coordenada coord = new Coordenada();
        coord.setLat(localizacaoDto.getLat());
        coord.setLng(localizacaoDto.getLng());
        super.setCoordenada(coord);
        
        this.nome = localizacaoDto.getNome();
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
