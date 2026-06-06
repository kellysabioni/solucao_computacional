package com.solucao_computacional.dto;

import com.solucao_computacional.model.StatusProjeto;

import java.time.LocalDate;

public class ProjetoRequest {

    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private StatusProjeto status;
    private String loginGerente;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTerminoPrevista() {
        return dataTerminoPrevista;
    }

    public StatusProjeto getStatus() {
        return status;
    }

    public String getLoginGerente() {
        return loginGerente;
    }
}