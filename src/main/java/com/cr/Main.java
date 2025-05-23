package com.cr;

import com.cr.model.Arbol.ArbolBinario;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);
        arbol.insertar(3);
        arbol.insertar(7);

        int altura = arbol.obtenerAlturaMaxima();
        System.out.println("Altura máxima del árbol: " + altura);
    }
}
