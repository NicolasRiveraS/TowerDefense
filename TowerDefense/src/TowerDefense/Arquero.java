package TowerDefense;

class Arquero extends Tropa {
    // Constructor
    public Arquero() {
        super("Arquero", 1, 1, "Caballero", "Mago");
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}


    

