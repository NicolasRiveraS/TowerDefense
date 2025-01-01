package TowerDefense;

public class Batalla {
    // Atributos
    private int rival;
    private Jugador jugador;
    private CPU cpu;
    private int numeroRonda;
    private String nombRival;

    // Constructor
    public Batalla(int rival, Jugador jugador, CPU cpu, int numeroRonda, String nombRival) {
        this.rival = rival;
        this.jugador = jugador;
        this.cpu = cpu;
        this.numeroRonda = numeroRonda;
        this.nombRival = nombRival;
    }

    // Métodos
    
    // Inicio de la batalla (rondas)
    public void iniciarBatalla () {
        TableroBatalla t = new TableroBatalla(rival, jugador, cpu, numeroRonda, nombRival);
        t.setVisible(true);
        
        while (t.isVisible()) {
            try {
                Thread.sleep(100); // Pequeña pausa para no saturar el hilo principal
            } 
            catch (InterruptedException e) {
            }
        }
        
        this.rival = t.getRival();
        this.jugador = t.getJugador();
        this.cpu = t.getCpu();
        this.numeroRonda = t.getNumeroRonda();
    
        t.dispose();
    }
    
    // Getters para obtener el resultado de la ronda
    public int getRival() {
        return this.rival;
    }
    public Jugador getJugador() {
        return this.jugador;
    }
    public CPU getCpu() {
        return this.cpu;
    }
    public int getNumeroRonda() {
        return this.numeroRonda;
    }
}
