/* Todas las utilizaciones de Consola para desplegar la información 
son temporales en en desarrollo, el producto final no utilizará este 
sistema */

package TowerDefense;

public class MainJuego {

    public static void main(String[] args) {
        // Inicializa el número de rival
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

        // Ciclo Principal de Juego (Tres Rivales)
        do {
            // Una vez iniciada la partida, se crea un jugador
            Jugador jugador = new Jugador();
            
            // Crea un nuevo oponente CPU
            CPU cpu = new CPU();
            
            // Se muestra el progreso de la invasión
            
            // Se muestra el rival con el que se combatirá
            RivalPorCombatir pantallaRival = new RivalPorCombatir(rival);
            pantallaRival.setVisible(true);
            
            while (pantallaRival.isVisible()) {
                try {
                    Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
                } 
                catch (InterruptedException e) {
                }
            }
            
            // Se inicializa el número de ronda
            int numeroRonda = 1;
            
            // Ciclo de Rondas por Rival
            while (jugador.getCastillo().getPuntosVida() > 0 && cpu.getCastillo().getPuntosVida() > 0) {
                
                // Selección de tropas del CPU
                cpu.seleccionTropas(numeroRonda);

                // Selección de tropas del jugador
                jugador.seleccionTropas(numeroRonda);

                // Iniciar batalla
                Batalla batalla = new Batalla(rival, jugador, cpu, numeroRonda);
                batalla.iniciarBatalla();

                // Almacena los resultados de la ronda
                rival = batalla.getRival();
                jugador = batalla.getJugador();
                cpu = batalla.getCpu();
                numeroRonda = batalla.getNumeroRonda();
                
                // Incrementar el número de ronda
                numeroRonda++;
            }

            // Mostrar resultado del combate con el rival
            ResultadoRival resultadoRival = new ResultadoRival(rival, jugador, cpu, numeroRonda);
            resultadoRival.setVisible(true);
            
            while (resultadoRival.isVisible()) {
                try {
                    Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
                } 
                catch (InterruptedException e) {
                }
            }
            
            // Siguiente rival (incrementa el número de rival)
            rival++;

        } while (rival < 4); // Para que sean únicamente 3 rivales
    }
}
