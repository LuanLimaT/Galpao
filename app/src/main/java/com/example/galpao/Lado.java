package com.example.galpao;

import java.util.ArrayList;
import java.util.List;

public class Lado {
    private List<Container> containers;

    public Lado() {
        this.containers = new ArrayList<>();
    }

    public void adicionarContainer(Container container) {
        this.containers.add(container);
    }

    public List<Container> getContainers() {
        return containers;
    }
}