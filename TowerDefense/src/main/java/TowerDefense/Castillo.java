package TowerDefense;

    
    // Clase Castillo
class Castillo {
    private int puntosVida;

    public Castillo() {
        this.puntosVida = 10;
    }

    public void recibirDanio(int cantidad) {
        this.puntosVida -= cantidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
}

