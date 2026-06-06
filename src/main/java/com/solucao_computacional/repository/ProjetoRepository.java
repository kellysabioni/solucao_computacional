package com.solucao_computacional.repository;

import com.solucao_computacional.model.Projeto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjetoRepository {

    private final List<Projeto> projetos = new ArrayList<>();

    public Projeto salvar(Projeto projeto) {
        projetos.add(projeto);
        return projeto;
    }

    public List<Projeto> listarTodos() {
        return projetos;
    }

    public Optional<Projeto> buscarPorNome(String nome) {
        return projetos.stream()
                .filter(projeto -> projeto.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }
}