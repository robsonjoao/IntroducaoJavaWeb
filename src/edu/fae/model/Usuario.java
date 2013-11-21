package edu.fae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;

/**
 * 
 * @author Robson J. P.
 *
 */
@Entity
public class Usuario {
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	@NotEmpty(message="Nome obrigatório")
	public String getNome() {
		return nome;
	}
	
	@Email
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
