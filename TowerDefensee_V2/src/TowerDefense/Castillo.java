package TowerDefense;

class Castillo {
    // Atributos
    private int puntosVida;

    // Constructor
    public Castillo() {
        this.puntosVida = 10;
    }

    // Métodos
    public void recibirDaño(int cantidad) {
        this.puntosVida -= cantidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
}

