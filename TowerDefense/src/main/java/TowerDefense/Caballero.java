package TowerDefense;

// Clase Caballero
class Caballero extends Tropa {
    public Caballero() {
        super(new Tipo("Caballero"), 1, 2.0, new Tipo("Mago"), new Tipo("Arquero"));
    }

    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDanio((int) danio);
    }
}

    

