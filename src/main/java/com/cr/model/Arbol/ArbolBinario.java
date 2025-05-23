package com.cr.model.Arbol;

import com.cr.model.Nodo.NodoAB;

public class ArbolBinario {
    NodoAB raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private NodoAB insertarRecursivo(NodoAB nodo, int valor) {
        if (nodo == null) {
            return new NodoAB(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }

        return nodo;
    }

    // Método para calcular la altura máxima
    public int obtenerAlturaMaxima() {
        return altura(raiz);
    }

    private int altura(NodoAB nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = altura(nodo.izquierdo);
        int alturaDerecha = altura(nodo.derecho);

        return 1 + Math.max(alturaIzquierda, alturaDerecha);
    }
}

