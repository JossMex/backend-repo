package com.example.personaBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personaBack.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    
}
