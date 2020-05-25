package com.bubbledev.eventapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.bubbledev.eventapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

}
