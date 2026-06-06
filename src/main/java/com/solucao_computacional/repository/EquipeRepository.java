package com.solucao_computacional.repository;

import com.solucao_computacional.model.Equipe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EquipeRepository {

    private final List<Equipe> equipes = new ArrayList<>();

    public Equipe salvar(Equipe equipe) {
        equipes.add(equipe);
        return equipe;
    }

    public List<Equipe> listarTodos() {
        return equipes;
    }
}