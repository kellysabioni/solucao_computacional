package com.solucao_computacional.controller;

import com.solucao_computacional.dto.ProjetoRequest;
import com.solucao_computacional.model.Projeto;
import com.solucao_computacional.service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @PostMapping
    public Projeto cadastrar(@RequestBody ProjetoRequest request) {
        return projetoService.cadastrar(request);
    }

    @GetMapping
    public List<Projeto> listarTodos() {
        return projetoService.listarTodos();
    }
}