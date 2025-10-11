package com.cursosdedesarrollo;

public class Calculadora {
    private int valor;

    public Calculadora() {
        this.valor = 0;
    }

    public void setValor(int valor) {   // 👈 acepta int, no Integer
        this.valor = valor;
    }

    public void sumar(int n) {          // 👈 acepta int
        this.valor += n;
    }

    public void restar(int n) {
        this.valor -= n;
    }

    public void multiplicar(int n) {
        this.valor *= n;
    }

    public int getValor() {             // 👈 devuelve int
        return valor;
    }

    public void limpiar() {
        this.valor = 0;
    }
}
