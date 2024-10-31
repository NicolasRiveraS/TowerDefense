package TowerDefense;

    
    
class Jugador {
    private Castillo castillo;
    private Pila tropasSeleccionadas; 
    private Cola tropasEnviadas; 

    public Jugador() {
        this.castillo = new Castillo();
        this.tropasSeleccionadas = new Pila(); 
        this.tropasEnviadas = new Cola(); 
    }

   
    public void seleccionarTropas(Tropa tropa) {
        tropasSeleccionadas.apilar(tropa);
    }

    
    public void enviarTropas() {
        while (!tropasSeleccionadas.estaVacia()) {
            Tropa tropa = tropasSeleccionadas.desapilar();
            tropasEnviadas.encolar(tropa);
        }
    }

    public Castillo getCastillo() {
        return castillo;
    }

    public Cola getTropasEnviadas() {
        return tropasEnviadas;
    }

}
    

