/* Todas las utilizaciones de Consola para desplegar la información 
son temporales en en desarrollo, el producto final no utilizará este 
sistema */

package TowerDefense;

public class MainJuego {

    public static void main(String[] args) {
        int rival = 1;
        
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
        // Una vez iniciada la partida, se crea un jugador
        Jugador jugador = new Jugador();

        // Ciclo Principal de Juego (Tres Rivales)
        do {
            // Crea un nuevo oponente CPU
            CPU cpu = new CPU();
            
            int numeroRonda = 5; /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Ciclo de Rondas por Rival
            while (jugador.getCastillo().getPuntosVida() > 0 && cpu.getCastillo().getPuntosVida() > 0) {
                // Ronda (temporal)
                System.out.println("Ronda " + numeroRonda);
                
                // Selección de tropas del CPU
                cpu.seleccionTropas(numeroRonda);

                // Selección de tropas del jugador
                jugador.seleccionTropas(numeroRonda);

                // Iniciar batalla
                Batalla batalla = new Batalla(rival, jugador, cpu, numeroRonda);
                batalla.iniciarBatalla();

                // Mostrar resultados de la ronda (temporal)
                System.out.println("Puntos de vida del castillo del jugador: " + jugador.getCastillo().getPuntosVida());
                System.out.println("Puntos de vida del castillo de la CPU: " + cpu.getCastillo().getPuntosVida());

                // Incrementar el número de ronda
                numeroRonda++;
            }

            if (cpu.getCastillo().getPuntosVida() <= 0) {
                System.out.println("¡El jugador ha ganado la ronda!");
            } 
            else {
                System.out.println("¡El CPU ha ganado la ronda!");
            }
            
            // Siguiente rival (incrementa el número de rival)
            rival++;

        } while (rival < 4); // Para que sean únicamente 3 rivales
    }
    
//    private static void iniciarBatalla(Jugador jugador, CPU cpu) {
//    while (!cpu.getTropasAlmacenadas().estaVacia() && !jugador.getTropasAlmacenadas().estaVacia()) {
//        Tropa tropaJugador = jugador.getTropasAlmacenadas().desencolar();
//        Tropa tropaCPU = cpu.getTropasAlmacenadas().desencolar();
//
//        // Validar que las tropas existen
//        if (tropaJugador == null || tropaCPU == null) {
//            System.out.println("Error: Tropas nulas durante la batalla.");
//            continue;
//        }
//
//        System.out.println("Combate entre " + tropaJugador.getTipo() + " y " + tropaCPU.getTipo());
//
//        // Resolver combate basado en fortaleza (temporal, le falta desarrollo)
//        if (tropaJugador.getFortaleza().equals(tropaCPU.getTipo())) {
//            cpu.getCastillo().recibirDaño((int) tropaJugador.getDaño());
//            System.out.println("El castillo de la CPU recibe " + tropaJugador.getDaño() + " de daño.");
//        } else if (tropaCPU.getFortaleza().equals(tropaJugador.getTipo())) {
//            jugador.getCastillo().recibirDaño((int) tropaCPU.getDaño());
//            System.out.println("El castillo del jugador recibe " + tropaCPU.getDaño() + " de daño.");
//        } else {
//            System.out.println("Ambas tropas fallan en causar daño.");
//        }
//    }
//
//    // Verificar tropas restantes
//    if (jugador.getTropasAlmacenadas().estaVacia()) {
//        System.out.println("El jugador se quedó sin tropas.");
//    }
//    if (cpu.getTropasAlmacenadas().estaVacia()) {
//        System.out.println("La CPU se quedó sin tropas.");
//    }
//}

}
