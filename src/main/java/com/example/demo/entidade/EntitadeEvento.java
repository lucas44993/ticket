package com.example.demo.entidade;


import com.example.demo.domain.Evento;
import com.example.demo.enums.EstadoEvento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table (name = "Eventos")
@NoArgsConstructor
@Getter
public class EntitadeEvento {

    @Id
    UUID id;

    @Column(nullable = false , length = 100, unique = false)
    String nome;

    @Column(nullable = false, length = 100, unique = false)
    String local;

    @Column(nullable = false, length = 40, unique = false)
    Integer capacidade;

    @Column(nullable = false, length = 15 , unique = false)
    Integer dataInicio;

    @Column(nullable = false, length = 15 , unique = false)
    EstadoEvento estadoEvento;

    @CreationTimestamp
    private LocalDateTime dataDecriacao;

    public EntitadeEvento(Evento eventoDomain){
        this.id = eventoDomain.getId();
        this.nome = eventoDomain.getNome();
        this.local = eventoDomain.getLocal();
        this.capacidade = eventoDomain.getCapacidade();
        this.dataInicio = eventoDomain.getDataInicio();
        this.estadoEvento = eventoDomain.getEstadoEvento();
    }

}
