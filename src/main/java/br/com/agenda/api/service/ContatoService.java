/**
 * 
 */
package br.com.agenda.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.api.model.Contato;
import br.com.agenda.api.repository.ContatoRepository;

/**
 * @author carlosbarbosagomesfilho
 *
 */

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository repository;
	
	public void save(Contato contato) {
		this.repository.save(contato);
	}
	
	public List<Contato> listContatos(){
		return this.repository.findAll();
	}
	
	public void removeContato(Contato contato) {
		this.repository.delete(contato);
	}
	
	public void removeContatoById(Long id) {
		this.repository.deleteById(id);
	}
	
	public void updateContato(Contato contato) {
		this.repository.saveAndFlush(contato);
	}
}
