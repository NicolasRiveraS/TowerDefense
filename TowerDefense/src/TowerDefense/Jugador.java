package TowerDefense;

class Jugador {
    // Atributos
    protected Castillo castillo;
    private ListaCDTropas listaTropas;

    // Constructor
    public Jugador() {
        this.castillo = new Castillo();
        this.listaTropas = new ListaCDTropas();
    }

    // Métodos
    public void seleccionTropas(int numeroRonda) {
        SeleccionTropas seleccionTropas = new SeleccionTropas(numeroRonda);
        seleccionTropas.setVisible(true);

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
            listaTropas.inserta(new Arquero());
        }
        for (int i = 0; i < caballeros; i++) {
            listaTropas.inserta(new Caballero());
        }
        for (int i = 0; i < magos; i++) {
            listaTropas.inserta(new Mago());
        }
        
        // Comprobación de funcionalidad
        System.out.println(listaTropas);
        // Fin comprobación
    }
    
    public Castillo getCastillo() {
        return castillo;
    }

}
    

