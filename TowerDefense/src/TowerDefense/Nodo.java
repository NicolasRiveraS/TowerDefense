package TowerDefense;

public class Nodo {
    // Atributos
    private Tropa tropa;
    private Nodo next;
    private Nodo back;
    
    // Constructor
    public Nodo (Tropa tropa) {
        this.tropa = tropa;
    }
    
    // Métodos
    public Tropa getTropa() {
        return tropa;
    }
    public void setTropa(Tropa tropa) {
        this.tropa = tropa;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Nodo getBack() {
        return back;
    }
    public void setBack(Nodo back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Nodo{" + "tropa=" + tropa + '}';
    }
}