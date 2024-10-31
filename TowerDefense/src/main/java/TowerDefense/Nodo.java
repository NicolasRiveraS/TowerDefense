package TowerDefense;

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
        if (elemento != null) {
            return elemento.getNombre();
        } else {
            return dato;
        }
    }
}
