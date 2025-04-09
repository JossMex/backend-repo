package com.example.personaBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personaBack.models.Estado;

public interface  EstadoRepository extends JpaRepository<Estado, Integer> {
    
}
