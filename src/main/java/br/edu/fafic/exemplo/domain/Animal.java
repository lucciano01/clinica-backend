package br.edu.fafic.exemplo.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import br.edu.fafic.exemplo.enums.Especie;

@Entity
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Enumerated(EnumType.ORDINAL)
	private Especie especie;
	
	@ManyToMany(mappedBy = "animais")
	private List<Responsavel> responsaveis;
	
	public Animal() {
		
	}

	public Animal(Especie especie, List<Responsavel> responsaveis) {
		this.especie = especie;
		this.responsaveis = responsaveis;
	}
	
	public Long getId() {
		return id;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public List<Responsavel> getResponsaveis() {
		return responsaveis;
	}

	public void setResponsaveis(List<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal:" + nome + ", especie=" + especie ;
	}
	
	
	
	

}
