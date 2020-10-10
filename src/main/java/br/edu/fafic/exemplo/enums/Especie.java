package br.edu.fafic.exemplo.enums;

public enum Especie {
	
	CANINO(1, "Canino"),
	FELINO(2, "Felino");
	
	private Integer codigo;
	private String valor;
		
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	private Especie(Integer codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public static Enum toEnum(Integer codigo) {
		for(Especie e : Especie.values()) {
			if(codigo.equals(e.codigo)) {
				return e;
			}
		}
		
		return null;
	}
	
	
	

}
