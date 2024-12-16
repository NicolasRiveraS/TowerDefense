package TowerDefense;

public class Batalla {
    // Atributos
    private int rival;
    private Jugador jugador;
    private CPU cpu;
    private int numeroRonda;

    // Constructor
    public Batalla(int rival, Jugador jugador, CPU cpu, int numeroRonda) {
        this.rival = rival;
        this.jugador = jugador;
        this.cpu = cpu;
        this.numeroRonda = numeroRonda;
    }

    // Métodos
    
    // Inicio de la batalla
    public void iniciarBatalla () {
        TableroBatalla t = new TableroBatalla(rival, jugador, cpu, numeroRonda);
        t.setVisible(true);
        
        while (t.isEnabled()) {
            try {
                Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
            } 
            catch (InterruptedException e) {
            }
        }
        
        
    }
}
