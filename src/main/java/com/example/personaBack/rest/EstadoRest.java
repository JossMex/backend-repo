package com.example.personaBack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personaBack.services.EstadoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.personaBack.models.Estado;


@RestController
@RequestMapping("/estado")
public class EstadoRest {

    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("{Id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable("Id") int paisId){
        return ResponseEntity.ok(estadoService.findAllByCountry(paisId));

    }
    
}
