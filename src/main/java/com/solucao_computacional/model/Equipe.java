package com.solucao_computacional.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String nome;
    private String descricao;
    private List<Usuario> membros = new ArrayList<>();
    private List<Projeto> projetos = new ArrayList<>();

    public Equipe() {
    }

    public Equipe(String nome, String descricao, List<Usuario> membros, List<Projeto> projetos) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = membros;
        this.projetos = projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public List<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(List<Usuario> membros) {
        this.membros = membros;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
}