package com.unimaps.api.dto;

import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.unimaps.api.enums.BlocoEnum;

public class PavilhaoDTO {

	private Optional<String> id = Optional.empty();
	private String nome;
	private BlocoEnum bloco;

	public Optional<String> getId() {
		return id;
	}
	public void setId(Optional<String> id) {
		this.id = id;
	}

	@NotEmpty
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotBlank
	public BlocoEnum getBloco() {
		return bloco;
	}
	public void setBloco(BlocoEnum bloco) {
		this.bloco = bloco;
	}

	
}
