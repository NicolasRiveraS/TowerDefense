package TowerDefense;

public class ListaSRanking {

    private NodoRanking cabeza;

    public ListaSRanking() {
        this.cabeza = null;
    }

    public void insertar(int nivel, int puntos) {
        NodoRanking nuevoNodo = new NodoRanking(nivel, puntos);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoRanking actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public String obtenerRanking() {
        if (cabeza == null) {
            return "El ranking está vacío.";
        }
        StringBuilder sb = new StringBuilder("Ranking de Niveles:\n");
        NodoRanking actual = cabeza;
        while (actual != null) {
            sb.append(actual).append("\n");
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }

    public int obtenerPuntosUltimoNivel() {
        if (cabeza == null) {
            return 0;
        }
        NodoRanking actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual.getPuntos();
    }

    
    public boolean estaVacia() {
        return cabeza == null;
    }
}    

