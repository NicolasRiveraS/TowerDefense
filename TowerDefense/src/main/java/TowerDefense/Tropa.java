package TowerDefense;

public abstract class Tropa {
    protected Tipo tipo;      
    protected int vida;       
    protected double danio;   
    protected Tipo fortaleza;
    protected Tipo debilidad; 

    public Tropa(Tipo tipo, int vida, double danio, Tipo fortaleza, Tipo debilidad) {
        this.tipo = tipo;
        this.vida = vida;
        this.danio = danio;
        this.fortaleza = fortaleza;
        this.debilidad = debilidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public double getDanio() {
        return danio;
    }

    public Tipo getFortaleza() {
        return fortaleza;
    }

    public Tipo getDebilidad() {
        return debilidad;
    }

    public abstract void atacar(Castillo castilloEnemigo);
}

