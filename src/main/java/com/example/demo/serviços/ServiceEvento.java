package com.example.demo.serviços;
import com.example.demo.domain.Evento;
import com.example.demo.dtos.EventoDto;
import com.example.demo.entidade.EntitadeEvento;
import com.example.demo.repositorio.RepositorioEvento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEvento {


    private final RepositorioEvento repoEvento;

    public ServiceEvento(RepositorioEvento repoEvento) {
        this.repoEvento = repoEvento;
    }

    public void criarEvento(EventoDto eventoDto){

        Evento novoEvento = new Evento(eventoDto.nome(),eventoDto.local(),eventoDto.capacidade(),eventoDto.dataInicio());

        EntitadeEvento entitadeEvento = new EntitadeEvento(novoEvento);


        repoEvento.save(entitadeEvento);

    }



    public List<EntitadeEvento> pegarTodosEventos(){
        return repoEvento.findAll();
    }
}
