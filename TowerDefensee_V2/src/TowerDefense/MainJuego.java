/* Todas las utilizaciones de Consola para desplegar la información 
son temporales en en desarrollo, el producto final no utilizará este 
sistema */

package TowerDefense;

public class MainJuego {

    public static void main(String[] args) {
        int numeroRonda = 1;
        
        // Crea la interfaz del menú principal y la hace visible con el aspecto establecido
        MenuPrincipal.main(args);                                               
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        
        // Mientras se esté en el menú principal, permance en el ciclo
        while (menu.isEnabled()) {                                              
            try {
                Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
            } 
            catch (InterruptedException e) {
            }
        }
        
        Jugador jugador = new Jugador();                                        // Una vez iniciada la partida, se crea un jugador      
        CPU cpu = new CPU();                                                    // Crea un nuevo oponente CPU      

        // Ciclo principal del juego (por rondas)
        while (jugador.getCastillo().getPuntosVida() > 0 && cpu.getCastillo().getPuntosVida() > 0) {
            // Comprobación temporal de la ronda
            System.out.println("Ronda " + numeroRonda);

            // Manejar la invasión (agrega enemigos a la CPU antes de la batalla)
            manejarInvasion(cpu);

            // Selección de tropas del jugador
            jugador.seleccionTropas(numeroRonda);

            // Selección de tropas de la CPU
            cpu.seleccionarTropasAleatoriamente();

            // Iniciar batalla
            iniciarBatalla(jugador, cpu);

            // Mostrar resultados de la ronda (temporal)
            System.out.println("Puntos de vida del castillo del jugador: " + jugador.getCastillo().getPuntosVida());
            System.out.println("Puntos de vida del castillo de la CPU: " + cpu.getCastillo().getPuntosVida());

            // Incrementar el número de ronda
            numeroRonda++;
        }


        if (cpu.getCastillo().getPuntosVida() <= 0) {
            System.out.println("¡El jugador ha ganado!");
        } else {
            System.out.println("¡El CPU ha ganado!");
        }
    }


    public static void manejarInvasion(CPU cpu) {
        Invasion invasion = new Invasion();


        invasion.agregarEnemigo(new Caballero());
        invasion.agregarEnemigo(new Mago());

 
        while (invasion.hayEnemigos()) {
            Tropa enemigo = invasion.obtenerSiguienteEnemigo();
            cpu.agregarTropa(enemigo);
        }

        System.out.println("Enemigos agregados al CPU desde la invasión.");
    }

    
    private static void iniciarBatalla(Jugador jugador, CPU cpu) {
    while (!cpu.getTropasEnviadas().estaVacia() && !jugador.getTropasEnviadas().estaVacia()) {
        Tropa tropaJugador = jugador.getTropasEnviadas().desencolar();
        Tropa tropaCPU = cpu.getTropasEnviadas().desencolar();

        // Validar que las tropas existen
        if (tropaJugador == null || tropaCPU == null) {
            System.out.println("Error: Tropas nulas durante la batalla.");
            continue;
        }

        System.out.println("Combate entre " + tropaJugador.getTipo() + " y " + tropaCPU.getTipo());

        // Resolver combate basado en fortaleza (temporal, le falta desarrollo)
        if (tropaJugador.getFortaleza().equals(tropaCPU.getTipo())) {
            cpu.getCastillo().recibirDaño((int) tropaJugador.getDaño());
            System.out.println("El castillo de la CPU recibe " + tropaJugador.getDaño() + " de daño.");
        } else if (tropaCPU.getFortaleza().equals(tropaJugador.getTipo())) {
            jugador.getCastillo().recibirDaño((int) tropaCPU.getDaño());
            System.out.println("El castillo del jugador recibe " + tropaCPU.getDaño() + " de daño.");
        } else {
            System.out.println("Ambas tropas fallan en causar daño.");
        }
    }

    // Verificar tropas restantes
    if (jugador.getTropasEnviadas().estaVacia()) {
        System.out.println("El jugador se quedó sin tropas.");
    }
    if (cpu.getTropasEnviadas().estaVacia()) {
        System.out.println("La CPU se quedó sin tropas.");
    }
}

}
