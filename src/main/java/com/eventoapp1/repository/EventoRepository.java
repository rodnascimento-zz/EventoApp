package com.eventoapp1.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp1.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
