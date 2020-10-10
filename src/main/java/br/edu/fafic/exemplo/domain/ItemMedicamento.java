package br.edu.fafic.exemplo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class ItemMedicamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Medicamento medicamento;
	
	private Integer quantidade;
	
	@Transient
	private Double subTotal;
	
	public ItemMedicamento() {
		
	}

	public ItemMedicamento(Medicamento medicamento, Integer quantidade) {
		this.medicamento = medicamento;
		this.quantidade = quantidade;
		
	}
	
	public Long getId() {
		return id;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getSubTotal() {
	 subTotal = medicamento.getPreco() * quantidade;	
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	

	@Override
	public String toString() {
		return "ItemMedicamento [id=" + id + ", medicamento=" + medicamento + ", quantidade=" + quantidade
				+ ", subTotal=" + getSubTotal() + "]";
	}

	
	

}
