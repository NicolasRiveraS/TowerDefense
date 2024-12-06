package TowerDefense;

class Arquero extends Tropa {
    // Constructor
    public Arquero() {
        super("Arquero", 1, 1.0, "Mago", "Caballero");
        this.icono = new javax.swing.ImageIcon(getClass().getResource("/Iconos/arquero.png"));
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}


    

