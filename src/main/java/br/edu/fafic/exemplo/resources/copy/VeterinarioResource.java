package br.edu.fafic.exemplo.resources.copy;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.exemplo.domain.Veterinario;
import br.edu.fafic.exemplo.repository.VeterinarioRepository;
import br.edu.fafic.exemplo.service.VeterinarioService;

@RestController
@RequestMapping(value = "/veterinario")
public class VeterinarioResource {
	
	@Autowired
	private VeterinarioService vs;
	
	@Autowired
	VeterinarioRepository vr;
	
	@RequestMapping(value = "/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<Veterinario> veterinarioByCpf(@PathVariable String cpf){
		Veterinario v = vs.veterinarioByCpf(cpf);
		System.out.println(v.toString());
		return ResponseEntity.ok().body(v);
	}
	
	@RequestMapping(value = "/busca/{id}", method = RequestMethod.GET)
	public Optional<Veterinario> vetById(@PathVariable Long id){
		return vr.findById(id);
	}

	
	

}
