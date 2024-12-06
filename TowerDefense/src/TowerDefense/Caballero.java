package TowerDefense;

class Caballero extends Tropa {
    // Constructor
    public Caballero() {
        super("Caballero", 1, 1.5, "Arquero", "Mago");
        this.icono = new javax.swing.ImageIcon(getClass().getResource("/Iconos/caballero.png"));
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}

    

