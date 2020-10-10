package br.edu.fafic.exemplo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.exemplo.domain.Medicamento;
import br.edu.fafic.exemplo.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
	
	@Autowired
	private MedicamentoRepository mr;
	
	public void save(Medicamento m) {
		mr.save(m);
	}

}
