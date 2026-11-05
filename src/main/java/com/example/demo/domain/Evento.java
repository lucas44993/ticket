package com.example.demo.domain;

import com.example.demo.enums.EstadoEvento;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter

public class Evento {

    private UUID id;

    private String nome;

    private String local;

    private Integer capacidade;

    private Integer dataInicio;

    private EstadoEvento estadoEvento;

    @CreationTimestamp
    private LocalDateTime dataDecriacao;

    public Evento (String nome,String local,Integer capacidade,Integer dataInicio){
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.local = local;
        this.capacidade =  capacidade;
        this.dataInicio = dataInicio;
        this.estadoEvento = EstadoEvento.rascunho;

    }

}
