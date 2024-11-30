package TowerDefense;

import java.util.Random;

class CPU extends Jugador {
    // Atributos
    private Random r;
    
    // Constructor
    public CPU () {
        super();
        this.r = new Random();
    }
    
    // Métodos
    
    // Selecciona tropas aleatoriamente
    private Tropa seleccionarTropasAleatoriamente () {
        int seleccion = r.nextInt(1, 4);
        
        switch (seleccion) {
            case 1:
                return new Arquero();
                
            case 2:
                return new Caballero();
                
            case 3:
                return new Mago();
                
            default:
                throw new AssertionError();
        }
    }
    
    // Agrega tropas a la cola del CPU
    @Override
    public void seleccionTropas (int numeroRonda) {
        for (int i = 0; i < numeroRonda; i++) {
            colaTropas.encolar(seleccionarTropasAleatoriamente());
        }
    }
}