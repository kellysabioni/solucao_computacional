package com.solucao_computacional.service;

import com.solucao_computacional.dto.EquipeRequest;
import com.solucao_computacional.model.Equipe;
import com.solucao_computacional.model.Projeto;
import com.solucao_computacional.model.Usuario;
import com.solucao_computacional.repository.EquipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipeService {

    private final EquipeRepository equipeRepository;
    private final UsuarioService usuarioService;
    private final ProjetoService projetoService;

    public EquipeService(EquipeRepository equipeRepository,
                         UsuarioService usuarioService,
                         ProjetoService projetoService) {
        this.equipeRepository = equipeRepository;
        this.usuarioService = usuarioService;
        this.projetoService = projetoService;
    }

    public Equipe cadastrar(EquipeRequest request) {
        List<Usuario> membros = request.getLoginsMembros()
                .stream()
                .map(usuarioService::buscarPorLogin)
                .collect(Collectors.toList());

        List<Projeto> projetos = request.getNomesProjetos()
                .stream()
                .map(projetoService::buscarPorNome)
                .collect(Collectors.toList());

        Equipe equipe = new Equipe(
                request.getNome(),
                request.getDescricao(),
                membros,
                projetos
        );

        return equipeRepository.salvar(equipe);
    }

    public List<Equipe> listarTodos() {
        return equipeRepository.listarTodos();
    }
}