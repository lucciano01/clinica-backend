package br.edu.fafic.exemplo.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date dataDaConsulta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Veterinario veterinario;
	
	@OneToOne
	private Animal animal;
	
	@OneToOne(cascade= CascadeType.ALL)
	private Prescricao prescricao;
	
	private Double valorTotal;
	
	public Consulta() {
		
	}
	
	public Consulta(Date dataDaConsulta, Veterinario veterinario, Double valorTotal, Prescricao prescricao, Animal animal) {
		this.dataDaConsulta = dataDaConsulta;
		this.veterinario = veterinario;
		this.valorTotal = valorTotal;
		this.prescricao = prescricao;
		this.animal = animal;
	}
	
	public Long getId() {
		return id;
	}

	public Date getDataDaConsulta() {
		return dataDaConsulta;
	}

	public void setDataDaConsulta(Date dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Prescricao getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(Prescricao prescricao) {
		this.prescricao = prescricao;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", dataDaConsulta=" + dataDaConsulta
				+ ", animal=" + animal + ", prescricao=" + prescricao + ", valorTotal=" + valorTotal + "]";
	}

	
	

}
