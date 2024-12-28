package me.felipedev.sishelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.felipedev.sishelpdesk.bean.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
