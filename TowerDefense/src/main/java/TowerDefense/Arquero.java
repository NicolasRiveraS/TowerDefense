package TowerDefense;

class Arquero extends Tropa {
    public Arquero() {
        super(new Tipo("Arquero"), 1, 1, new Tipo("Caballero"), new Tipo("Mago"));
    }

    @Override
    public void atacar(Castillo castilloEnemigo) {
        castilloEnemigo.recibirDanio((int) danio);
    }
}


    

