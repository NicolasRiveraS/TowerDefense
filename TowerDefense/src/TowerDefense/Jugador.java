package TowerDefense;

class Jugador {
    // Atributos
    protected Castillo castillo;
    protected ColaTropas colaTropas;

    // Constructor
    public Jugador() {
        this.castillo = new Castillo();
        this.colaTropas = new ColaTropas();
    }

    // Método para atacar al CPU
//    public void atacar(CPU cpu) {
//        // Procesar el ataque de las tropas del jugador al castillo del CPU
//        while (!listaTropas.estaVacia()) {
//            Tropa tropa = listaTropas.desencolar();
//            System.out.println("Tropa " + tropa.getTipo() + " ataca al castillo del CPU.");
//            cpu.getCastillo().recibirDaño((int) tropa.getDaño());
//        }
//    }

    // Método para seleccionar tropas
    public void seleccionTropas(int numeroRonda) {
        SeleccionTropas seleccionTropas = new SeleccionTropas(numeroRonda);
        seleccionTropas.setVisible(true);

        // Espera hasta que el usuario termine de seleccionar
        while (seleccionTropas.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
            }
        }

        int arqueros = seleccionTropas.getCantidadArqueros();
        int caballeros = seleccionTropas.getCantidadCaballeros();
        int magos = seleccionTropas.getCantidadMagos();

        for (int i = 0; i < arqueros; i++) {
            colaTropas.encolar(new Arquero());
        }
        for (int i = 0; i < caballeros; i++) {
            colaTropas.encolar(new Caballero());
        }
        for (int i = 0; i < magos; i++) {
            colaTropas.encolar(new Mago());
        }

        System.out.println("Tropas seleccionadas y agregadas a la cola:");
        System.out.println(colaTropas);
    }

    // Método para obtener el castillo del jugador
    public Castillo getCastillo() {
        return castillo;
    }

    // Método para obtener la lista de tropas enviadas
    public ColaTropas getTropasEnviadas() {
        return colaTropas;
    }
}

    

