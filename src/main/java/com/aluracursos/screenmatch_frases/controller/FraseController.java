package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.model.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseService serrvicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return serrvicio.obternerFraseAleatoria();
    }
}
