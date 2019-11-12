package com.unimaps.api.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "coordenadas")
public class Coordenada {

	private String id;
	private double lat;
	private double lng;
	
	public Coordenada() {
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
