package com.evento.resources;

import com.evento.dtos.EventoDTO;
import com.evento.dtos.UsuarioDTO;
import com.evento.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/eventos")
public class EventoResource {

    @Autowired
    private EventoService eventoService;

    @GetMapping()
    public String buscarEventos(){
        return "Buscando eventos";
    }
//    @PostMapping()
//    public ResponseEntity<EventoDTO> cadastrarEvento(@RequestBody EventoDTO eventoDTO){
//        EventoDTO evento = eventoService.cadastrarEvento(eventoDTO);
//        return ResponseEntity.ok(evento);
//    }
}
