package br.edu.fafic.exemplo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorColumn(name = "idPessoa")
public class Veterinario extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private List<Consulta> consultas;
		
	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Veterinario() {
		
	}

	public Veterinario(List<Consulta> consultas) {
		super();
		this.consultas = consultas;
	}

	@Override
	public String toString() {
		return "Veterinario: " +super.getNome() +  "Consultas: " + consultas.toString();
	}
	
	

}
