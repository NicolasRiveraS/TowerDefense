package TowerDefense;


class Mago extends Tropa {
    public Mago() {
        super(new Tipo("Mago"), 1, 1.5, new Tipo("Arquero"), new Tipo("Caballero"));
    }

    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDanio((int) danio);
    }
}


