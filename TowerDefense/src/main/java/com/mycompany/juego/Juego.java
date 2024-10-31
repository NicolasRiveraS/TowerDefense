package com.mycompany.juego;

public class Juego {

    
    public static void main(String[] args) {
         Jugador jugador = new Jugador();
        CPU cpu = new CPU();

        
        jugador.seleccionarTropas(new Arquero()); // Suponiendo una subclase `Arquero` de `Tropa`
        cpu.seleccionarTropasAleatoriamente();

        
        while (jugador.getCastillo().getPuntosVida() > 0 && cpu.getCastillo().getPuntosVida() > 0) {
            
            jugador.enviarTropas();
            cpu.enviarTropas();

            
            iniciarBatalla(jugador, cpu);
        }

        
        if (cpu.getCastillo().getPuntosVida() <= 0) {
            System.out.println("¡El jugador ha ganado!");
        } else {
            System.out.println("¡El CPU ha ganado!");
        }
    }

    private static void iniciarBatalla(Jugador jugador, CPU cpu) {
        
        while (!jugador.getTropasEnviadas().estaVacia() && !cpu.getTropasEnviadas().estaVacia()) {
            Tropa tropaJugador = jugador.getTropasEnviadas().desencolar();
            Tropa tropaCPU = cpu.getTropasEnviadas().desencolar();

            
            if (tropaJugador.getFortaleza().equals(tropaCPU.getTipo())) {

                cpu.getCastillo().recibirDanio((int) tropaJugador.getDanio());
            } else if (tropaCPU.getFortaleza().equals(tropaJugador.getTipo())) {
                
                jugador.getCastillo().recibirDanio((int) tropaCPU.getDanio());
            }
        }
    }
}

