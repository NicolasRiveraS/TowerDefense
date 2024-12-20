package TowerDefense;

public class Rival {
    // Atributos
    private String nombre;
    private int id;
    
    // Constructor
    public Rival (String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    // Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
