package br.edu.fafic.exemplo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prescricao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String indicacao;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<ItemMedicamento> medicamentos;
	
	public Prescricao() {
		
	}

	public Prescricao(String indicacao, List<ItemMedicamento> medicamentos) {
		super();
		this.indicacao = indicacao;
		this.medicamentos = medicamentos;
	}

	public Long getId() {
		return id;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public List<ItemMedicamento> getMedicamentos() {
     if(medicamentos == null) {
    	 medicamentos = new ArrayList<ItemMedicamento>();
     }
		return medicamentos;
	}

	public void setMedicamentos(List<ItemMedicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	@Override
	public String toString() {
		return "Prescricao [id=" + id + ", indicacao=" + indicacao + ", medicamentos=" + medicamentos + "]";
	}
	
	

}
