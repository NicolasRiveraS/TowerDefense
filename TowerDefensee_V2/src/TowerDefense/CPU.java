package TowerDefense;

class CPU extends Jugador {
    // Atributos

    // Constructor
    public void agregarTropa(Tropa tropa) {
        getTropasEnviadas().encolar(tropa); // Usar la lista de tropas heredada del jugador
    }

    public void seleccionarTropasAleatoriamente() {
        // Implementación para seleccionar tropas aleatorias
        // Implementar hilos para la selección aleatoria
    }

    public void atacar(Jugador jugador) {
        // Implementación del ataque al jugador
    }
}