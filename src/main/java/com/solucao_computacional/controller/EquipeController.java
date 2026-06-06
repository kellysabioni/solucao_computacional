package com.solucao_computacional.controller;

import com.solucao_computacional.dto.EquipeRequest;
import com.solucao_computacional.model.Equipe;
import com.solucao_computacional.service.EquipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipes")
public class EquipeController {

    private final EquipeService equipeService;

    public EquipeController(EquipeService equipeService) {
        this.equipeService = equipeService;
    }

    @PostMapping
    public Equipe cadastrar(@RequestBody EquipeRequest request) {
        return equipeService.cadastrar(request);
    }

    @GetMapping
    public List<Equipe> listarTodos() {
        return equipeService.listarTodos();
    }
}