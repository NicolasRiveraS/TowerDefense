package TowerDefense;
public class NodoRanking {
    
        private int nivel;
    private int puntos;
    private NodoRanking siguiente;

    public NodoRanking(int nivel, int puntos) {
        this.nivel = nivel;
        this.puntos = puntos;
        this.siguiente = null;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public NodoRanking getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRanking siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nivel: " + nivel + ", Puntos: " + puntos;
    }
}

