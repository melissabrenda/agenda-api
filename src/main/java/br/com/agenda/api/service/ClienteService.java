package br.com.agenda.api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.agenda.api.model.Cliente;
import br.com.agenda.api.repository.ClienteRepository;

/**
 * 
 *  
 * 
 */ 

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Transactional
	public void save(Cliente cliente) {
		this.repository.save(cliente);
	}
	
	@Transactional (readOnly=true)
	public List<Cliente> listClientes(){
		return this.repository.findAll();
	}


	public void deleteCliente(Cliente cliente) {
		this.repository.delete(cliente);
	}

	@Transactional
	public void deletarPorId (Long id) {
		this.repository.deleteById(id);
	}
	
	@Transactional
	public void update (Cliente cliente) {
		this.repository.saveAndFlush(cliente);
	}
	
	
	@Transactional(readOnly=true)
	public Cliente buscarPorNome (String nome) {
		return this.repository.findByNome(nome);
	}
	
	@Transactional(readOnly=true)
	public Cliente buscarPorEmail (String email) {
		return this.repository.findByEmail(email);
	}
	
	@Transactional(readOnly=true)
	public Cliente buscaPorId (Long id) {
		return this.repository.getOne(id);
	}
}
