package TowerDefense;

public class Nodo {
    // Atributos
    private Tropa tropa;
    private Nodo next;
    private Nodo back;
    private Rival rival;
    private Nodo hijoIzq;
    private Nodo hijoDer;
    
    // Constructores
    public Nodo (Tropa tropa) {
        this.tropa = tropa;
    }
    public Nodo (Rival rival) {
        this.rival = rival;
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
    public Rival getRival() {
        return rival;
    }
    public void setRival(Rival rival) {
        this.rival = rival;
    }
    public Nodo getHijoIzq() {
        return hijoIzq;
    }
    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }
    public Nodo getHijoDer() {
        return hijoDer;
    }
    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }
}