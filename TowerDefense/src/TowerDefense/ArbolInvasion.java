package TowerDefense;

public class ArbolInvasion {
    // Atributos
    private Nodo raiz;
    
    // Constructor
    public ArbolInvasion () {}
    
    // Métodos
    public void inserta(Rival rival) {
        if (raiz == null) {
            raiz = new Nodo(rival);
        }
        else {
            insertaR(raiz, rival);
        }
    }

    private void insertaR(Nodo n, Rival r) {
        if (r.getId() <= n.getRival().getId()) {
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new Nodo(r));
            }
            else {
                insertaR(n.getHijoIzq(), r);
            }
        }
        else {
            if (n.getHijoDer() == null) {
                n.setHijoDer(new Nodo(r));
            } 
            else {
                insertaR(n.getHijoDer(), r);
            }
        }
    }
    
    public String getNombre(int posicion) {
        if (raiz != null) {
            ListaDCRivales lista = new ListaDCRivales();
            inOrdenNombresR (raiz, lista);
            return lista.getRival(posicion).getNombre();
        }
        else {
            return "";
        }
    }
    
    private void inOrdenNombresR (Nodo n, ListaDCRivales l) {
        if (n != null) {
            inOrdenNombresR(n.getHijoIzq(), l);
            l.inserta(n.getRival());
            inOrdenNombresR(n.getHijoDer(), l);
        }
    }
}
