package me.felipedev.sishelpdesk.domain;

import java.util.ArrayList;
import java.util.List;

import me.felipedev.sishelpdesk.Chamado;

public class Cliente extends Pessoa {
	
	private List<Chamado> chamados = new ArrayList<>();

	public Cliente() {
		super();
		
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		
	}

	

}
