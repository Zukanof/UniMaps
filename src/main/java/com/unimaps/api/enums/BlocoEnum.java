package com.unimaps.api.enums;

public enum BlocoEnum {

	A(0), B(1), C(2), D(3), E(4), F(5);
	
	private int bloco;
	
	BlocoEnum(int bloco) {
		this.bloco = bloco;
	}
	
	public int getBloco() {
		return this.bloco;
	}
}
