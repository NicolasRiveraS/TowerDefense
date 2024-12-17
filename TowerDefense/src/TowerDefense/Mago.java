package TowerDefense;

class Mago extends Tropa {
    // Constructor
    public Mago() {
        super("Mago", 1, 2.0, "Caballero", "Arquero");
        this.iconoDisponible = new javax.swing.ImageIcon(getClass().getResource("/Iconos/mago.png"));
    }
}


