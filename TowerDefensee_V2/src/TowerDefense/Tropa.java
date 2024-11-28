package TowerDefense;

public abstract class Tropa {
    // Atributos
    protected String tipo;      
    protected int puntosVida;       
    protected double daño;
    protected String fortaleza;
    protected String debilidad; 

    // Constructor
    public Tropa(String tipo, int vida, double daño, String fortaleza, String debilidad) {
        this.tipo = tipo;
        this.puntosVida = vida;
        this.daño = daño;
        this.fortaleza = fortaleza;
        this.debilidad = debilidad;
    }

    // Métodos
    public String getTipo() {
        return tipo;
    }
    public int puntosVida() {
      return puntosVida;  
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
        return "Tropa{" + "tipo=" + tipo + ", punstosVida=" + puntosVida + ", daño=" + daño + ", fortaleza=" + fortaleza + ", debilidad=" + debilidad + '}';
    }
    
    
}

