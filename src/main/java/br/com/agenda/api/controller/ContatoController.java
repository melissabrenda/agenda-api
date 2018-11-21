/**
 * 
 */
package br.com.agenda.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.api.model.Contato;
import br.com.agenda.api.repository.ContatoRepository;
import br.com.agenda.api.service.ContatoService;
import lombok.Delegate;

/**
 * @author carlosbarbosagomesfilho
 *
 */
@RestController
@RequestMapping("/api")
//@CrossOrigin(origins="localhost:8080/api/contatos")
public class ContatoController {

	@Autowired
	private ContatoService service;
	
	@GetMapping("/contatos")
	public List<Contato> list(){
		List<Contato> contatos = this.service.listContatos();
		return contatos;
	}
	
	@PostMapping("/contatos")
	public void save(@Valid @RequestBody Contato contato, HttpServletResponse response) {
		this.service.save(contato);
	}
	
	@DeleteMapping("/contatos")
	public void remove(@RequestBody Contato contato) {
		this.service.removeContato(contato);
	}
	
	
}
