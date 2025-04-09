package com.example.personaBack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personaBack.models.Pais;
import com.example.personaBack.services.PaisService;


@RestController
@RequestMapping("/pais")
public class PaisRest {

    @Autowired
    private PaisService paisService;
    
    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises(){

        return ResponseEntity.ok(paisService.findAll());
    }
    
}
