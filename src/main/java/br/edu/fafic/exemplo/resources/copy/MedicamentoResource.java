package br.edu.fafic.exemplo.resources.copy;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fafic.exemplo.domain.Medicamento;
import br.edu.fafic.exemplo.service.MedicamentoService;

@RestController
@RequestMapping(value = "/medicamento")
public class MedicamentoResource {
	
	@Autowired
	private MedicamentoService ms;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Medicamento> save(@RequestBody Medicamento m){
		ms.save(m);
		return ResponseEntity.ok().body(m);
	}


}
