package com.unimaps.api.dto;

import java.util.Optional;

public class LocalizacaoDTO {

	private Optional<String> id = Optional.empty();
	private String nome;
	private double lat;
	private double lng;

	public LocalizacaoDTO() {
	}

	public Optional<String> getId() {
		return id;
	}

	public void setId(Optional<String> id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
}
