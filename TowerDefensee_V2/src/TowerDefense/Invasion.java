package TowerDefense;
public class Invasion {
 
    private Nodo enemigoActual;

    public Invasion() {
        this.enemigoActual = null;
    }

    public void agregarEnemigo(Tropa tropa) {
        Nodo nuevoNodo = new Nodo(tropa);
        if (enemigoActual == null) {
            enemigoActual = nuevoNodo;
        } else {
            Nodo temp = enemigoActual;
            while (temp.getNext()!= null) {
                temp = temp.getNext();
            }
            temp.setNext(nuevoNodo);
        }
    }

    public Tropa obtenerSiguienteEnemigo() {
        if (enemigoActual == null) {
            return null; // No hay más enemigos
        }
        Tropa enemigo = enemigoActual.getTropa();
        enemigoActual = enemigoActual.getNext();
        return enemigo;
    }

    public boolean hayEnemigos() {
        return enemigoActual != null;
    }
}

