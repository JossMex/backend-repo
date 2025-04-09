package com.example.personaBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personaBack.models.Pais;

public interface  PaisRepository extends JpaRepository<Pais, Integer> {
    
}
