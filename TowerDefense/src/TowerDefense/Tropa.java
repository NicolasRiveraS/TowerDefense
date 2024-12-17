package TowerDefense;

import javax.swing.Icon;

public abstract class Tropa {
    // Atributos
    protected String tipo;      
    protected int puntosVida;       
    protected double daño;
    protected String fortaleza;
    protected String debilidad;
    protected Icon iconoDesplegado;
    protected Icon iconoDisponible;
    
    // Atributo implementado para conocer la posición de la tropa en el tablero
    protected int posicionTablero;
    /* Interpretación:
    
       Caminos Tablero
     Izq             Der
    
            | 4 |
    | -3 |          | 3 |
    | -2 |          | 2 |
    | -1 |          | 1 |
            | 0 |
    
    */

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

    public int getPosicionTablero() {
        return posicionTablero;
    }

    public void setPosicionTablero(int posicionTablero) {
        this.posicionTablero = posicionTablero;
    }

    public void setIconoDesplegado(Icon iconoDesplegado) {
        this.iconoDesplegado = iconoDesplegado;
    }

    @Override
    public String toString() {
        return "Tropa{" + "tipo=" + tipo + ", punstosVida=" + puntosVida + ", daño=" + daño + ", fortaleza=" + fortaleza + ", debilidad=" + debilidad + '}';
    }
}

