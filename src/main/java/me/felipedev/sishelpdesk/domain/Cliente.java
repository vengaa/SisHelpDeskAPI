package me.felipedev.sishelpdesk.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import me.felipedev.sishelpdesk.Chamado;

@Entity
public class Cliente extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "cliente")
	private List<Chamado> chamados = new ArrayList<>();

	public Cliente() {
		super();
		
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		
	}

	

}
