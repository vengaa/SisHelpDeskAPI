package me.felipedev.sishelpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.felipedev.sishelpdesk.domain.Tecnico;
import me.felipedev.sishelpdesk.repositories.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = tecnicoRepository.findById(id);
		return obj.orElse(null);
	}

}
