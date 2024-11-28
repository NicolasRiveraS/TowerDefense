package TowerDefense;
public class Batalla {
  
    private Jugador jugador;
    private CPU cpu;
    private int turnos;

    public Batalla(Jugador jugador, CPU cpu) {
        this.jugador = jugador;
        this.cpu = cpu;
        this.turnos = 0;
    }

    public void iniciarBatalla() {
        while (jugador.getCastillo().getPuntosVida()> 0 && cpu.getCastillo().getPuntosVida() > 0) {
            System.out.println("Turno " + (++turnos));
            ejecutarTurnoJugador();
            if (cpu.getCastillo().getPuntosVida() > 0) {
                ejecutarTurnoCPU();
            }
        }

        if (jugador.getCastillo().getPuntosVida() <= 0) {
            System.out.println("¡Has perdido!");
        } else {
            System.out.println("¡Has ganado!");
        }
    }

    private void ejecutarTurnoJugador() {
    // Validar que el jugador y sus tropas puedan atacar
    if (jugador == null || cpu == null) {
        System.out.println("Error: Jugador o CPU no están inicializados.");
        return;
    }

    System.out.println("Turno del jugador.");
    try {
        jugador.atacar(cpu);
    } catch (Exception e) {
        System.out.println("Ocurrió un error durante el turno del jugador: " + e.getMessage());
    }
}


    private void ejecutarTurnoCPU() {
        // Gestión del ataque de la CPU al castillo del jugador
        System.out.println("Turno del CPU.");
        cpu.atacar(jugador);
    }
}

