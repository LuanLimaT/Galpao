package com.example.galpao;

import java.util.ArrayList;
import java.util.List;

public class Galpao {
    private Prateleira[] prateleiras;

    public Galpao(int quantidadePrateleiras) {
        this.prateleiras = new Prateleira[quantidadePrateleiras];
        for (int i = 0; i < quantidadePrateleiras; i++) {
            this.prateleiras[i] = new Prateleira();
        }
    }

    public Prateleira getPrateleira(int numeroPrateleira) {
        if (numeroPrateleira >= 0 && numeroPrateleira < prateleiras.length) {
            return prateleiras[numeroPrateleira];
        }
        return null; // Prateleira inválida
    }

    public List<Container> buscarContainers(String tipoProjeto, int ano) {
        List<Container> resultados = new ArrayList<>();
        for (Prateleira prateleira : prateleiras) {
            for (Container container : prateleira.getLadoA().getContainers()) {
                if (container.getTipoProjeto().equalsIgnoreCase(tipoProjeto) && container.getAno() == ano) {
                    resultados.add(container);
                }
            }
            for (Container container : prateleira.getLadoB().getContainers()) {
                if (container.getTipoProjeto().equalsIgnoreCase(tipoProjeto) && container.getAno() == ano) {
                    resultados.add(container);
                }
            }
        }
        return resultados;
    }
}