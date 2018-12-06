package br.com.agenda.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {

	
	private static final long SerialVersionUID = 1L;
		
		@Id
		@GeneratedValue  (strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column
		private String nome;
		
		@Column
		private String telefone;
		
		@Column
		private String cnpj; 
		
		@Column
		private String email;
		
		@Column
		private String razaosocial;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRazaosocial() {
			return razaosocial;
		}

		public void setRazaosocial(String razaosocial) {
			this.razaosocial = razaosocial;
		}

		public static long getSerialversionuid() {
			return SerialVersionUID;
		}
		
		
	}