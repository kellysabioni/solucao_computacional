package com.solucao_computacional.dto;

import java.util.List;

public class EquipeRequest {

    private String nome;
    private String descricao;
    private List<String> loginsMembros;
    private List<String> nomesProjetos;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getLoginsMembros() {
        return loginsMembros;
    }

    public List<String> getNomesProjetos() {
        return nomesProjetos;
    }
}