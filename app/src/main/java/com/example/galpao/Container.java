package com.example.galpao;

public class Container {
    private String tipoProjeto;
    private int ano;
    private String descricao; // Nova descrição

    public Container(String tipoProjeto, int ano, String descricao) {
        this.tipoProjeto = tipoProjeto;
        this.ano = ano;
        this.descricao = descricao;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public int getAno() {
        return ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Projeto: " + tipoProjeto + ", Ano: " + ano + ", Descrição: " + descricao;
    }
}