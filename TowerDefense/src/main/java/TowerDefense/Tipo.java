package TowerDefense;

public class Tipo {
    private String nombre;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tipo tipo = (Tipo) obj;
        return nombre.equals(tipo.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}


