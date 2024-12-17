package TowerDefense;

class Jugador {
    // Atributos
    protected Castillo castillo;
    protected ColaTropas colaTropas;
    protected int cantidadTropas = 0;

    // Constructor
    public Jugador() {
        this.castillo = new Castillo();
        this.colaTropas = new ColaTropas();
    }

    // Método para seleccionar tropas
    public void seleccionTropas(int numeroRonda) {
        SeleccionTropas seleccionTropas = new SeleccionTropas(numeroRonda);
        seleccionTropas.setVisible(true);

        // Espera hasta que el usuario termine de seleccionar
        while (seleccionTropas.isVisible()) {
            try {
                Thread.sleep(100); 
            } 
            catch (InterruptedException e) {
            }
        }

        int arqueros = seleccionTropas.getCantidadArqueros();
        int caballeros = seleccionTropas.getCantidadCaballeros();
        int magos = seleccionTropas.getCantidadMagos();

        for (int i = 0; i < arqueros; i++) {
            Arquero a = new Arquero();
            a.setIconoDesplegado(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arquero_aliado.png")));
            colaTropas.encolar(a);
            cantidadTropas++;
        }
        for (int i = 0; i < caballeros; i++) {
            Caballero c = new Caballero();
            c.setIconoDesplegado(new javax.swing.ImageIcon(getClass().getResource("/Iconos/caballero_aliado.png")));
            colaTropas.encolar(c);
            cantidadTropas++;
        }
        for (int i = 0; i < magos; i++) {
            Mago m = new Mago();
            m.setIconoDesplegado(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mago_aliado.png")));
            colaTropas.encolar(m);
            cantidadTropas++;
        }
    }

    // Método para obtener el castillo del jugador
    public Castillo getCastillo() {
        return castillo;
    }

    // Método para obtener la cola de tropas enviadas
    public ColaTropas getTropasAlmacenadas() {
        return colaTropas;
    }
    
    // Método para obtener cantidad de tropas
    public int getCantidadTropas() {
        return cantidadTropas;
    }
    
    public void tropaUtilizada () {
        this.cantidadTropas--;
    }
}