package TowerDefense;

class Castillo {
    // Atributos
    private double puntosVida;

    // Constructor
    public Castillo() {
        this.puntosVida = 10.0;
    }

    // Métodos
    public void recibirDaño(double cantidad) {
        this.puntosVida -= cantidad;
    }

    public double getPuntosVida() {
        return puntosVida;
    }
}

