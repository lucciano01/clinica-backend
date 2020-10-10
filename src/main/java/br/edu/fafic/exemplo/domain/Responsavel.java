package br.edu.fafic.exemplo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Responsavel extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "responsavel_animal", 
		joinColumns = {
		@JoinColumn(name = "responsavel_id")},
		inverseJoinColumns = {
		@JoinColumn(name = "animal_id")})
		
		private List<Animal> animais;
	
	public Responsavel() {
		
	}

	public Responsavel(List<Animal> animais) {
		this.animais = animais;
	}

	public List<Animal> getAnimais() {
	 if(animais == null) {
		 animais = new ArrayList<Animal>();	
	 }
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	@Override
	public String toString() {
		return "Responsavel - Nome: " + super.getNome() + " - animais=" + animais + "]";
	}
	
	
	
	
	

}
