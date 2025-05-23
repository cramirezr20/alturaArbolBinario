package com.cr.model.Nodo;

public class NodoAB {
    public int valor;
    public NodoAB izquierdo;
    public NodoAB derecho;

    public NodoAB(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
