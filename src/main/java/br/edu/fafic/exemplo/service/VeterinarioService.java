package br.edu.fafic.exemplo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fafic.exceptions.ObjectNaoEncontradoException;
import br.edu.fafic.exemplo.domain.Veterinario;
import br.edu.fafic.exemplo.repository.VeterinarioRepository;


@Service
public class VeterinarioService {
	
	@Autowired
	private VeterinarioRepository veterinarioRepository;
	
	public Veterinario veterinarioById(Long id) {
		Optional<Veterinario> vet = veterinarioRepository.findById(id);
		return vet.orElseThrow(()
				-> new ObjectNaoEncontradoException("Objeto nao localizado no banco de dados"));
	}
	
	public Veterinario veterinarioByCpf(String cpf) {
		return veterinarioRepository.findByCpf(cpf);
	}


	
}	
