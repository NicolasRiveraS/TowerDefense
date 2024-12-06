package TowerDefense;

public class ColaTropas {
    // Atributos
    private Nodo frente;
    private Nodo ultimo;

    // Constructor
    public ColaTropas() {}

    // Métodos
    
    // Método para encolar una tropa
    public void encolar(Tropa t) {
        if (frente == null) {
            frente = new Nodo (t);
            ultimo = frente;
        } 
        else {
            Nodo aux = new Nodo (t);
            ultimo.setBack(aux);
            ultimo = aux;
        }
    }

    // Método para desencolar una tropa
    public Tropa desencolar() {
        Nodo aux = frente;
        
        if (aux != null) {
            frente = frente.getBack();
            aux.setBack(null);
            
            return aux.getTropa();
        }
        else {
            return null;
        }
    }
    
    // Método para mostrar elementos de la cola (sin desencolar las tropas)
    public Tropa mostrar (int itera) {
        Nodo aux = frente;

        if (aux != null) {
            for (int j = 0; j < itera; j++) {
                aux = aux.getBack();
            }
            return aux.getTropa();
        }
        else {
            return null;
        }
    }
    
    @Override
    public String toString() {
        String s = "Cola de Tropas:\n";
        Nodo aux = frente;
        
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getBack();
        }
        
        return s; 
    }
}
