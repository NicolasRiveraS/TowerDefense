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
                Arquero a = new Arquero();
                a.setIconoDesplegado(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arquero_enemigo.png")));
                return a;
                
            case 2:
                Caballero c = new Caballero();
                c.setIconoDesplegado(new javax.swing.ImageIcon(getClass().getResource("/Iconos/caballero_enemigo.png")));
                return c;
                
            case 3:
                Mago m = new Mago();
                m.setIconoDesplegado(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mago_enemigo.png")));
                return m;
                
            default:
                throw new AssertionError();
        }
    }
    
    // Selecciona el camino por el cual envía sus tropas
    public int seleccionarCaminoTablero () {
        int seleccion = r.nextInt(1, 3);
        return seleccion;
    }
    
    // Agrega tropas a la cola del CPU
    @Override
    public void seleccionTropas (int numeroRonda) {
        for (int i = 0; i < numeroRonda; i++) {
            colaTropas.encolar(seleccionarTropasAleatoriamente());
            cantidadTropas++;
        }
    }
}