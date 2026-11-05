package com.example.demo.controllers;



import com.example.demo.dtos.EventoDto;
import com.example.demo.entidade.EntitadeEvento;
import com.example.demo.serviços.ServiceEvento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerEvento {



    private final ServiceEvento serviceEvento;

    public ControllerEvento(ServiceEvento serviceEvento) {
        this.serviceEvento = serviceEvento;
    }


    @PostMapping
    public ResponseEntity<String> criarEvento(@RequestBody EventoDto eventoDto) {

        serviceEvento.criarEvento(eventoDto);

        return ResponseEntity.status(HttpStatus.CREATED).body("Cliente recebido com sucesso!");
    }


    @GetMapping
    public ResponseEntity<List<EntitadeEvento>> Listareventos(){


        List<EntitadeEvento> listaEventos = serviceEvento.pegarTodosEventos();

        return ResponseEntity.ok(listaEventos);
    }
}
