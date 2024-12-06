package TowerDefense;

class Mago extends Tropa {
    // Constructor
    public Mago() {
        super("Mago", 1, 2.0, "Caballero", "Arquero");
        this.icono = new javax.swing.ImageIcon(getClass().getResource("/Iconos/mago.png"));
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}


