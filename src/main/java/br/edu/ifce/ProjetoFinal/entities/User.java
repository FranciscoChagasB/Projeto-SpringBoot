package br.edu.ifce.ProjetoFinal.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public User() {
		
	}

	public User(Long id, String nome, String email, String telefone, String senha) {
		super();
		this.id = id;
		this.name = nome;
		this.email = email;
		this.phone = telefone;
		this.password = senha;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return name;
	}


	public void setNome(String nome) {
		this.name = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return phone;
	}


	public void setTelefone(String telefone) {
		this.phone = telefone;
	}
	

	public String getSenha() {
		return password;
	}


	public void setSenha(String senha) {
		this.password = senha;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
