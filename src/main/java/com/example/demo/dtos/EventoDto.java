package com.example.demo.dtos;

public record EventoDto(
        String nome,
        String local,
        Integer capacidade,
        Integer dataInicio
) {
}
