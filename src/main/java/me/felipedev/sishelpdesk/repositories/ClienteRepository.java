package me.felipedev.sishelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.felipedev.sishelpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}