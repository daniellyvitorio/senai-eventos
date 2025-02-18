package com.evento.services;

import com.evento.dtos.EventoDTO;
import com.evento.dtos.UsuarioDTO;
import com.evento.models.Evento;
import com.evento.models.Usuario;
import com.evento.repositories.EventoRepository;
import com.evento.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    EventoRepository eventoRepository;

//    public EventoDTO cadastrarEvento(EventoDTO eventoDTO){
//        Evento evento = converterEventoDTOParaEvento(eventoDTO);
//        evento = eventoRepository.save(evento);
//        return converterEventoParaEventoDTO(evento);
//    }
}

