package TowerDefense;

class Caballero extends Tropa {
    // Constructor
    public Caballero() {
        super("Caballero", 1, 2.0, "Mago", "Arquero");
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}

    

