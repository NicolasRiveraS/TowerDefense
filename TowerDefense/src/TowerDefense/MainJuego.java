package TowerDefense;

public class MainJuego {

    public static void main(String[] args) {
        // Inicializa el número de rival (variable contadora) y la posición del primer rival
        int numRival = 1;
        int posicionRival;
        
        // Inicializa variables relevates para la invasión
        String rival2Ganador1 = "", rival2Ganador2 = "";
        
        // Inicializa la lista que contiene los nombres de los rivales y sus posiciones
        ListaDCRivales l = new ListaDCRivales();
        l.inserta(new Rival("Ragnar", 1));
        l.inserta(new Rival("Cedric", 3));
        l.inserta(new Rival("Godfrey", 5));
        l.inserta(new Rival("Baldric", 7));
        l.inserta(new Rival("Alaric", 9));
        l.inserta(new Rival("Edric", 11));
        l.inserta(new Rival("Wulfric", 13));

        // Inicializa el árbol binario que contiene el progreso de la invasión
        ArbolInvasion a = new ArbolInvasion();
        a.inserta(new Rival("", 8));
        a.inserta(new Rival("", 4));
        a.inserta(new Rival("", 12));
        a.inserta(new Rival("", 2));
        a.inserta(new Rival("", 6));
        a.inserta(new Rival("", 10));
        a.inserta(new Rival("", 14));
        a.inserta(new Rival ("Jugador (Tú)", 15));
        
        for (int i = 0; i < 7; i++) {
            a.inserta(l.getRival(i));
        }
        
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
            Invasion progresoInvasion = new Invasion(a, numRival);
            if (numRival != 3) {
                progresoInvasion.setVisible(true);
                
                while (progresoInvasion.isVisible()) {
                    try {
                        Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
                    } 
                    catch (InterruptedException e) {
                    }
                }
                
                // Re-asigna la posición del siguiente rival
                posicionRival = progresoInvasion.getPosicionSiguienteRival();
            }
            else {
                progresoInvasion.dispose();
                Invasion progresoInvasion2 = new Invasion(a, numRival, rival2Ganador1, rival2Ganador2);
                progresoInvasion2.setVisible(true);
                
                while (progresoInvasion2.isVisible()) {
                    try {
                        Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
                    } 
                    catch (InterruptedException e) {
                    }
                }
                
                posicionRival = progresoInvasion2.getPosicionSiguienteRival();

            }
            
            // Almacena los resultados de las batallas del CPU del segundo nivel
            if (numRival == 2) {
                rival2Ganador1 = progresoInvasion.getRival2Ganador1();
                rival2Ganador2 = progresoInvasion.getRival2Ganador2();
            }
            
            
            // Se muestra el rival con el que se combatirá
            RivalPorCombatir pantallaRival = new RivalPorCombatir(a.getNombre(posicionRival));
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
                Batalla batalla = new Batalla(numRival, jugador, cpu, numeroRonda);
                batalla.iniciarBatalla();

                // Almacena los resultados de la ronda
                numRival = batalla.getRival();
                jugador = batalla.getJugador();
                cpu = batalla.getCpu();
                numeroRonda = batalla.getNumeroRonda();
                
                // Incrementar el número de ronda
                numeroRonda++;
            }

            // Mostrar resultado del combate con el rival
            ResultadoRival resultadoRival = new ResultadoRival(a.getNombre(posicionRival), jugador, cpu, numeroRonda);
            resultadoRival.setVisible(true);
            
            while (resultadoRival.isVisible()) {
                try {
                    Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
                } 
                catch (InterruptedException e) {
                }
            }
            
            if (jugador.getCastillo().getPuntosVida() <= 0) {
                DerrotaFinal d = new DerrotaFinal();
                d.setVisible(true);
                
                while (d.isVisible()) {
                    try {
                        Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
                    } 
                    catch (InterruptedException e) {
                    }
                }
            }
            
            // Siguiente numRival (incrementa el número de rival)
            numRival++;

        } while (numRival < 4); // Para que sean únicamente 3 rivales
        
        Invasion invasion = new Invasion(a, 100);
        invasion.setVisible(true);
        
        while (invasion.isVisible()) {
            try {
                Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
            } 
            catch (InterruptedException e) {
            }
        }
        
        VictoriaFinal v = new VictoriaFinal();
        v.setVisible(true);
    }
}
