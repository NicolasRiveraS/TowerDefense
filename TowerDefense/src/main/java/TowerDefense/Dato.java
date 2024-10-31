package TowerDefense;

public class Dato {
    private String nombre;
    private int valor;

    // Constructor vacío
    public Dato() {
    }

    // Constructor que recibe nombre y valor
    public Dato(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el valor
    public int getValor() {
        return valor;
    }

    // Método para establecer el valor
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dato{" + "nombre='" + nombre + '\'' + ", valor=" + valor + '}';
    }
}
