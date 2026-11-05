package com.example.demo.repositorio;

import com.example.demo.entidade.EntitadeEvento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositorioEvento extends JpaRepository<EntitadeEvento, UUID> {
}
