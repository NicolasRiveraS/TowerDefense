package TowerDefense;

    
    // Clase Castillo
class Castillo {
    private int puntosVida;

    public Castillo() {
        this.puntosVida = 10; // Puntos de vida inicial del castillo
    }

    public void recibirDanio(int cantidad) {
        this.puntosVida -= cantidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
}

