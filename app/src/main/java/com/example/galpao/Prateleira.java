package com.example.galpao;

public class Prateleira {
    private Lado ladoA;
    private Lado ladoB;

    public Prateleira() {
        this.ladoA = new Lado();
        this.ladoB = new Lado();
    }

    public Lado getLadoA() {
        return ladoA;
    }

    public Lado getLadoB() {
        return ladoB;
    }
}