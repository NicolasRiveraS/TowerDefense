package TowerDefense;

class Mago extends Tropa {
    // Constructor
    public Mago() {
        super("Mago", 1, 1.5, "Arquero", "Caballero");
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}


