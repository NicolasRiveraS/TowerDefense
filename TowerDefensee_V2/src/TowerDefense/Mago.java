package TowerDefense;

class Mago extends Tropa {
    // Constructor
    public Mago() {
        super("Mago", 80, 20.0, "Caballero","Arquero");
    }

    // Métodos
    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDaño((int) daño);
    }
}


