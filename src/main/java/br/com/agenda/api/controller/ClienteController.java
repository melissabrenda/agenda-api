package br.com.agenda.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.agenda.api.model.Cliente;
import br.com.agenda.api.service.ClienteService;


public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/Clientes")
	public List<Cliente> list() {
		List<Cliente> cliente = this.service.listClientes();
		return cliente;
	}

	@PostMapping("/clientes")
	public void save(@Valid @RequestBody Cliente cliente, HttpServletResponse response) {
		this.service.save(cliente);
	}

	@DeleteMapping("/clientes")
	public void remove(@RequestBody Cliente cliente) {
		this.service.deleteCliente(cliente);
	}

	@DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id) {
		Cliente cliente = service.buscaPorId(id);
		if(cliente != null) {
			service.deletarPorId(id);
		}
	}
	
	@PutMapping("/clientes")
	public void update(@RequestBody Cliente cliente) {
		this.service.update(cliente);
	}
	
	@GetMapping("/clientes/buscaPorNome/{nome}")
	public Cliente buscaPorNome(@PathVariable String nome) {
		Cliente cliente = this.service.buscarPorNome(nome);
		return cliente;
	}
	

	@GetMapping("/buscarPorEmail/{email}")
	public Cliente buscaPorEmail(@PathVariable String email) {
		Cliente cliente = this.service.buscarPorEmail(email);
		return cliente;
}
}