package me.felipedev.sishelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.felipedev.sishelpdesk.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
