package com.eventoapp1.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp1.models.Convidado;
import com.eventoapp1.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
