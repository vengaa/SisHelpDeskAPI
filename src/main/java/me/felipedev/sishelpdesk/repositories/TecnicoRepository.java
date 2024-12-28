package me.felipedev.sishelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.felipedev.sishelpdesk.bean.entity.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
