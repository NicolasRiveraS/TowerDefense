package TowerDefense;

public class Batalla {
    // Atributos
    private Jugador jugador;
    private CPU cpu;
    private int numeroRonda;

    // Constructor
    public Batalla(Jugador jugador, CPU cpu, int numeroRonda) {
        this.jugador = jugador;
        this.cpu = cpu;
        this.numeroRonda = numeroRonda;
    }

    // Métodos
    
    // Inicio de la batalla
    public void iniciarBatalla () {
        TableroBatalla t = new TableroBatalla(numeroRonda);
        t.setVisible(true);
        
    }
    
//    public void iniciarBatalla() {
//        while (jugador.getCastillo().getPuntosVida() > 0 && cpu.getCastillo().getPuntosVida() > 0) {
//            System.out.println("Turno " + (++turnos));
//            ejecutarTurnoJugador();
//            if (cpu.getCastillo().getPuntosVida() > 0) {
//                ejecutarTurnoCPU();
//            }
//        }
//
//        if (jugador.getCastillo().getPuntosVida() <= 0) {
//            System.out.println("¡Has perdido!");
//        } else {
//            System.out.println("¡Has ganado!");
//        }
//    }
//
//    private void ejecutarTurnoJugador() {
//        // Validar que el jugador y sus tropas puedan atacar
//        if (jugador == null || cpu == null) {
//            System.out.println("Error: Jugador o CPU no están inicializados.");
//            return;
//        }
//
//        System.out.println("Turno del jugador.");
//        try {
//            jugador.atacar(cpu);
//        } catch (Exception e) {
//            System.out.println("Ocurrió un error durante el turno del jugador: " + e.getMessage());
//        }
//    }
//
//    private void ejecutarTurnoCPU() {
//        // Gestión del ataque de la CPU al castillo del jugador
//        System.out.println("Turno del CPU.");
//        cpu.atacar(jugador);
//    }
}
