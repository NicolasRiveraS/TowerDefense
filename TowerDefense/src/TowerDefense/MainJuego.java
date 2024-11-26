package TowerDefense;

public class MainJuego {

    public static void main(String[] args) {
        int numeroRonda = 1;
        
        MenuPrincipal.main(args);                                               // Crea la interfaz del menú principal y la hace visible con el aspecto establecido
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        
        while (menu.isEnabled()) {                                              // Mientras se esté en el menú principal, permance en el ciclo
            try {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) {
            }
        }
        
        Jugador jugador = new Jugador();                                        // Una vez iniciada la partida, se crea un jugador
        
        jugador.seleccionTropas(numeroRonda);                                   // Así, se ejecuata el método para la selección de las tropas

        CPU cpu = new CPU();                                                    // Crea un nuevo oponente CPU

//        cpu.seleccionarTropasAleatoriamente();
//
//        
//        while (jugador.getCastillo().getPuntosVida() > 0 && cpu.getCastillo().getPuntosVida() > 0) {
//            
//            jugador.enviarTropas();
//            cpu.enviarTropas();
//
//            
//            iniciarBatalla(jugador, cpu);
//        }
//
//        
//        if (cpu.getCastillo().getPuntosVida() <= 0) {
//            System.out.println("¡El jugador ha ganado!");
//        } else {
//            System.out.println("¡El CPU ha ganado!");
//        }
    }

        
//    private static void iniciarBatalla(Jugador jugador, CPU cpu) {
//        
//        while (!jugador.getTropasEnviadas().estaVacia() && !cpu.getTropasEnviadas().estaVacia()) {
//            Tropa tropaJugador = jugador.getTropasEnviadas().desencolar();
//            Tropa tropaCPU = cpu.getTropasEnviadas().desencolar();
//
//            
//            if (tropaJugador.getFortaleza().equals(tropaCPU.getTipo())) {
//
//                cpu.getCastillo().recibirDaño((int) tropaJugador.getDaño());
//            } else if (tropaCPU.getFortaleza().equals(tropaJugador.getTipo())) {
//                
//                jugador.getCastillo().recibirDaño((int) tropaCPU.getDaño());
//            }
//        }
//    }
}
