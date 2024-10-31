/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TowerDefense;

/**
 *
 * @author greye
 */
public class Pila {
    private Nodo cima;

    private static class Nodo {
        Tropa dato;
        Nodo siguiente;

        Nodo(Tropa dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public void apilar(Tropa dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public Tropa desapilar() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        Tropa dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}
