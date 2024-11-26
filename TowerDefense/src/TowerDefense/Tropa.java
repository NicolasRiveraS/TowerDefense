package TowerDefense;

public abstract class Tropa {
    // Atributos
    protected String tipo;      
    protected int vida;       
    protected double daño;
    protected String fortaleza;
    protected String debilidad; 

    // Constructor
    public Tropa(String tipo, int vida, double daño, String fortaleza, String debilidad) {
        this.tipo = tipo;
        this.vida = vida;
        this.daño = daño;
        this.fortaleza = fortaleza;
        this.debilidad = debilidad;
    }

    // Métodos
    public String getTipo() {
        return tipo;
    }

    public double getDaño() {
        return daño;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public abstract void atacar(Castillo castilloEnemigo);

    @Override
    public String toString() {
        return "Tropa{" + "tipo=" + tipo + ", vida=" + vida + ", daño=" + daño + ", fortaleza=" + fortaleza + ", debilidad=" + debilidad + '}';
    }
    
    
}

