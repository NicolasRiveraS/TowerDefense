/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author greye
 */
public class Nodo {
    private Dato elemento; 
    private String dato;   
    private Nodo siguiente;
    private Nodo atras;

    
    public Nodo() {
        this.siguiente = null;
        this.atras = null;
    }

    
    public Nodo(Dato elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.atras = null;
    }

    // Constructor para elemento de tipo String
    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
        this.atras = null;
    }

    // Métodos de acceso y modificación para elemento de tipo Dato
    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    // Métodos de acceso y modificación para elemento de tipo String
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    // Métodos para manejar las referencias siguiente y atras
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        // Mostrar `elemento` si es de tipo Dato o `dato` si es de tipo String
        if (elemento != null) {
            return elemento.getNombre(); // Asumiendo que Dato tiene un método getNombre()
        } else {
            return dato;
        }
    }
}
