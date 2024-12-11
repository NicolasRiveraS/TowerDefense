package TowerDefense;

import javax.swing.*;

public class TableroBatalla extends javax.swing.JFrame {
    // Atributos
    private static int rival;
    private static Jugador jugador;
    private static CPU cpu;
    private static int numeroRonda;
    private boolean auxTropasVisibles;
    private ColaTropas colaTropasVisiblesJugador;  // Cola en la cual se almacenan únicamente las tropas del jugador visibles en el tablero
    private ColaTropas colaTropasVisiblesCPU;      // Cola en la cual se almacenan únicamente las tropas del CPU visibles en el tablero
    private Tropa tropaActivaJugador;
    private Tropa tropaActivaCPU;
    
    // Constructor
    public TableroBatalla(int rival, Jugador jugador, CPU cpu, int numeroRonda) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.continuarBoton.setEnabled(false);
        this.rival = rival;
        this.jugador = jugador;
        this.cpu = cpu;
        this.numeroRonda = numeroRonda;
        this.auxTropasVisibles = true;
        this.colaTropasVisiblesJugador = new ColaTropas();
        this.colaTropasVisiblesCPU = new ColaTropas();
        setTitle("RONDA " + this.numeroRonda);
        ronda.setText("RONDA " + this.numeroRonda);
        tropasRestantesCPU.setText("Tropas restantes: " + cpu.getCantidadTropas());
        tropasRestantesJugador.setText("Tropas restantes: " + jugador.getCantidadTropas());
        setImagenCastillo();
        barraSalud();
        setTropasVisibles();
    }

    // Métodos
    
    // Establece la imagen del castillo por cada rival
    public void setImagenCastillo () {
        switch (rival) {
            case 1:
                castilloJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 1.png")));
                castilloRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 2.png")));
                break;
                
            case 2:
                castilloJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 2.png")));
                castilloRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 3.png")));
                break;
                
            case 3:
                castilloJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 3.png")));
                castilloRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 4.png")));
                break;
                
            default:
                throw new AssertionError();
        }
    }
    
    // Encola las tropas a las colas respectivas para las tropas visibles en el tablero y asigna los íconos por cada tropa
    public void setTropasVisibles () {
        // Caso inicial en el cual se necesitan colocar las primeras 3 tropas
        if (auxTropasVisibles) {
            // Jugador
            for (int i = 0; i < jugador.getCantidadTropas(); i++) {
                if (tropaJugador1.getIcon() == null) {
                    colaTropasVisiblesJugador.encolar(jugador.colaTropas.desencolar());
                    tropaJugador1.setIcon(colaTropasVisiblesJugador.mostrar(i).icono);
                } else if (tropaJugador2.getIcon() == null) {
                    colaTropasVisiblesJugador.encolar(jugador.colaTropas.desencolar());
                    tropaJugador2.setIcon(colaTropasVisiblesJugador.mostrar(i).icono);
                } else if (tropaJugador3.getIcon() == null) {
                    colaTropasVisiblesJugador.encolar(jugador.colaTropas.desencolar());
                    tropaJugador3.setIcon(colaTropasVisiblesJugador.mostrar(i).icono);
                } else {
                    break;
                }
            }

            // CPU
            for (int i = 0; i < cpu.getCantidadTropas(); i++) {
                if (tropaRival1.getIcon() == null) {
                    colaTropasVisiblesCPU.encolar(cpu.colaTropas.desencolar());
                    tropaRival1.setIcon(colaTropasVisiblesCPU.mostrar(i).icono);
                } else if (tropaRival2.getIcon() == null) {
                    colaTropasVisiblesCPU.encolar(cpu.colaTropas.desencolar());
                    tropaRival2.setIcon(colaTropasVisiblesCPU.mostrar(i).icono);
                } else if (tropaRival3.getIcon() == null) {
                    colaTropasVisiblesCPU.encolar(cpu.colaTropas.desencolar());
                    tropaRival3.setIcon(colaTropasVisiblesCPU.mostrar(i).icono);
                } else {
                    break;
                }
            }
            
            this.auxTropasVisibles = false;
        }
        
        // Caso "in-game" para actualización de las tropas disponibles
        else {
            // Jugador
            if (jugador.getCantidadTropas() >= 3) {
                colaTropasVisiblesJugador.encolar(jugador.colaTropas.desencolar());
                tropaJugador1.setIcon(tropaJugador2.getIcon());
                tropaJugador2.setIcon(tropaJugador3.getIcon());
                tropaJugador3.setIcon(colaTropasVisiblesJugador.mostrar(2).icono);
            }
            else if (jugador.getCantidadTropas() == 2) {
                tropaJugador1.setIcon(tropaJugador2.getIcon());
                tropaJugador2.setIcon(tropaJugador3.getIcon());
                tropaJugador3.setIcon(null);
            }
            else if (jugador.getCantidadTropas() == 1) {
                tropaJugador1.setIcon(tropaJugador2.getIcon());
                tropaJugador2.setIcon(null);
                tropaJugador3.setIcon(null);
            }
            else if (jugador.getCantidadTropas() == 0) {
                tropaJugador1.setIcon(null);
                tropaJugador2.setIcon(null);
                tropaJugador3.setIcon(null);
            }
            
            // Cpu
            if (cpu.getCantidadTropas() >= 3) {
                colaTropasVisiblesCPU.encolar(cpu.colaTropas.desencolar());
                tropaRival1.setIcon(tropaRival2.getIcon());
                tropaRival2.setIcon(tropaRival3.getIcon());
                tropaRival3.setIcon(colaTropasVisiblesCPU.mostrar(2).icono);
            }
            else if (cpu.getCantidadTropas() == 2) {
                tropaRival1.setIcon(tropaRival2.getIcon());
                tropaRival2.setIcon(tropaRival3.getIcon());
                tropaRival3.setIcon(null);
            }
            else if (cpu.getCantidadTropas() == 1) {
                tropaRival1.setIcon(tropaRival2.getIcon());
                tropaRival2.setIcon(null);
                tropaRival3.setIcon(null);
            }
            else if (cpu.getCantidadTropas() == 0) {
                tropaRival1.setIcon(null);
                tropaRival2.setIcon(null);
                tropaRival3.setIcon(null);
            }
        }
    }
    
    // Método del Jugador para moverse por el camino derecho del tablero
    public void caminoDerecho () {
        continuarBoton.setEnabled(true);
        caminoDerechoSeleccion.setEnabled(false);
        caminoIzquierdoSeleccion.setEnabled(false);
        
        // Si no hay tropas activas en el tablero
        if (tropaActivaJugador == null) {
            tropaActivaJugador = colaTropasVisiblesJugador.desencolar();
            casillaInferiorDerecha.setIcon(tropaActivaJugador.icono);
            tropaActivaJugador.setPosicionTablero(1);

            jugador.tropaUtilizada();
            tropasRestantesJugador.setText("Tropas restantes: " + jugador.getCantidadTropas());
            
            caminosCPU();

            setTropasVisibles();
        }
        // Si existe una tropa activa en el tablero
        else if (tropaActivaJugador != null) {
            switch (tropaActivaJugador.getPosicionTablero()) {
                // Si está en la casilla de abajo
                case 1:
                    casillaInferiorDerecha.setIcon(null);
                    tropaActivaJugador.setPosicionTablero(2);
                    caminosCPU();
                    if (tropaActivaJugador.icono != null) {
                        casillaMedioDerecha.setIcon(tropaActivaJugador.icono);
                    }
                    break;
                // Si está en la casilla del medio
                case 2:
                    casillaMedioDerecha.setIcon(null);
                    casillaSuperiorDerecha.setIcon(tropaActivaJugador.icono);
                    tropaActivaJugador.setPosicionTablero(3);
                    caminosCPU();
                    break;
                // Si está en la casilla de arriba
                case 3:
                    casillaSuperiorDerecha.setIcon(null);
                    casillaCastilloSuperior.setIcon(tropaActivaJugador.icono);
                    tropaActivaJugador.setPosicionTablero(4);
                    caminosCPU();
                    break;
                // Si está en la casilla del castillo enemigo
                case 4:
                    casillaCastilloSuperior.setIcon(null);
                    caminosCPU();
                    continuarBoton.setEnabled(false);
                    
                    dañoCastillos();
                    System.out.println("Jugador: " + jugador.castillo.getPuntosVida() + "\nCPU: " + cpu.castillo.getPuntosVida() + "\n");

                    tropaActivaJugador = null;
                    tropaActivaCPU = null;
                    
                    if (jugador.getCantidadTropas() > 0) {
                        caminoDerechoSeleccion.setEnabled(true);
                        caminoIzquierdoSeleccion.setEnabled(true);
                    }   break;
                default:
                    break;
            }
        }
    }
    
    // Método del Jugador para moverse por el camino derecho del tablero
    public void caminoIzquierdo() {
        continuarBoton.setEnabled(true);
        caminoDerechoSeleccion.setEnabled(false);
        caminoIzquierdoSeleccion.setEnabled(false);
        
        // Si no hay tropas activas en el tablero
        if (tropaActivaJugador == null) {
            tropaActivaJugador = colaTropasVisiblesJugador.desencolar();
            casillaInferiorIzquierda.setIcon(tropaActivaJugador.icono);
            tropaActivaJugador.setPosicionTablero(-1);

            jugador.tropaUtilizada();
            tropasRestantesJugador.setText("Tropas restantes: " + jugador.getCantidadTropas());
            
            caminosCPU();

            setTropasVisibles();
        } 
        // Si existe una tropa activa en el tablero
        else if (tropaActivaJugador != null) {
            switch (tropaActivaJugador.getPosicionTablero()) {
                // Si está en la casilla de abajo
                case -1:
                    casillaInferiorIzquierda.setIcon(null);
                    tropaActivaJugador.setPosicionTablero(-2);
                    caminosCPU();
                    if (tropaActivaJugador.icono != null) { 
                        casillaMedioIzquierda.setIcon(tropaActivaJugador.icono);
                    }
                    break;
                // Si está en la casilla del medio
                case -2:
                    casillaMedioIzquierda.setIcon(null);
                    casillaSuperiorIzquierda.setIcon(tropaActivaJugador.icono);
                    tropaActivaJugador.setPosicionTablero(-3);
                    caminosCPU();
                    break;
                // Si está en la casilla de arriba
                case -3:
                    casillaSuperiorIzquierda.setIcon(null);
                    casillaCastilloSuperior.setIcon(tropaActivaJugador.icono);
                    tropaActivaJugador.setPosicionTablero(4);
                    caminosCPU();
                    break;
                // Si está en la casilla del castillo enemigo
                case 4:
                    casillaCastilloSuperior.setIcon(null);
                    caminosCPU();
                    continuarBoton.setEnabled(false);
                    
                    dañoCastillos();
                    System.out.println("Jugador: " + jugador.castillo.getPuntosVida() + "\nCPU: " + cpu.castillo.getPuntosVida() + "\n");
                    
                    tropaActivaJugador = null;
                    tropaActivaCPU = null;
                    
                    if (jugador.getCantidadTropas() > 0) {
                        caminoDerechoSeleccion.setEnabled(true);
                        caminoIzquierdoSeleccion.setEnabled(true);
                    }   break;
                default:
                    break;
            }
        }
    }
    
    // Método del CPU para moverse por el tablero
    public void caminosCPU() {
        try {
            // Si no hay tropas activas en el tablero
            if (tropaActivaCPU == null) {
                tropaActivaCPU = colaTropasVisiblesCPU.desencolar();

                // Selecciona el camino aleatoriamente
                int camino = cpu.seleccionarCaminoTablero();
                switch (camino) {
                    // Camino derecho
                    case 1:
                        casillaSuperiorDerecha.setIcon(tropaActivaCPU.icono);
                        tropaActivaCPU.setPosicionTablero(3);
                        break;

                    // Camino izquierdo
                    case 2:
                        casillaSuperiorIzquierda.setIcon(tropaActivaCPU.icono);
                        tropaActivaCPU.setPosicionTablero(-3);
                        break;

                    default:
                        throw new AssertionError();
                }

                cpu.tropaUtilizada();
                tropasRestantesCPU.setText("Tropas restantes: " + cpu.getCantidadTropas());
            }

            // Si existe una tropa activa en el tablero
            else if (tropaActivaCPU != null) {
                switch (tropaActivaCPU.getPosicionTablero()) {
                // Camino Izquierdo
                    // Si está en la casilla de arriba
                    case -3:
                        casillaSuperiorIzquierda.setIcon(null);
                        tropaActivaCPU.setPosicionTablero(-2);
                        combateTropas();
                        casillaMedioIzquierda.setIcon(tropaActivaCPU.icono);
                        break;
                    // Si está en la casilla del medio
                    case -2:
                        casillaMedioIzquierda.setIcon(null);
                        casillaInferiorIzquierda.setIcon(tropaActivaCPU.icono);
                        tropaActivaCPU.setPosicionTablero(-1);
                        break;
                    // Si está en la casilla de abajo
                    case -1:
                        casillaInferiorIzquierda.setIcon(null);
                        casillaCastilloInferior.setIcon(tropaActivaCPU.icono);
                        tropaActivaCPU.setPosicionTablero(0);
                        break;

                // Camino Izquierdo
                    // Si está en la casilla de arriba
                    case 3:
                        casillaSuperiorDerecha.setIcon(null);
                        tropaActivaCPU.setPosicionTablero(2);
                        combateTropas();
                        casillaMedioDerecha.setIcon(tropaActivaCPU.icono);
                        break;
                    // Si está en la casilla del medio
                    case 2:
                        casillaMedioDerecha.setIcon(null);
                        casillaInferiorDerecha.setIcon(tropaActivaCPU.icono);
                        tropaActivaCPU.setPosicionTablero(1);
                        break;
                    // Si está en la casilla de abajo
                    case 1:
                        casillaInferiorDerecha.setIcon(null);
                        casillaCastilloInferior.setIcon(tropaActivaCPU.icono);
                        tropaActivaCPU.setPosicionTablero(0);
                        break;

                // Casilla Castillo Jugador
                    case 0:
                        casillaCastilloInferior.setIcon(null);
                        break;
                    default:
                        break;
                }
            }
        } catch (NullPointerException ex) {
        }
    }
    
    // Método para determinar la resolución de un combate
    public void combateTropas () {
        // Si en el tablero hay una tropa aliada y una enemiga y ambas se encuentran
        if ((tropaActivaJugador != null && tropaActivaCPU != null) && (tropaActivaJugador.getPosicionTablero() == tropaActivaCPU.getPosicionTablero())) {
            // Si ambas tropas son iguales
            if (tropaActivaJugador.getTipo().equals(tropaActivaCPU.getTipo())) {
                new MensajeCombate(tropaActivaJugador, tropaActivaCPU, null).setVisible(true);
            }
            // Si gana la tropa del jugador
            else if (tropaActivaJugador.getFortaleza().equals(tropaActivaCPU.getTipo())) {
                new MensajeCombate(tropaActivaJugador, tropaActivaCPU, tropaActivaJugador).setVisible(true);
                tropaActivaCPU.icono = null;
            }
            // Si pierde la tropa del jugador
            else if (tropaActivaJugador.getDebilidad().equals(tropaActivaCPU.getTipo())){
                new MensajeCombate(tropaActivaJugador, tropaActivaCPU, tropaActivaCPU).setVisible(true);
                tropaActivaJugador.icono = null;
            }
        }
    }
    
    // Método para actualizar la barra de salud
    public void barraSalud () {
        // Establece el cambio en la barra
        barraSaludJugador.setValue((int) (jugador.castillo.getPuntosVida() * 10));
        barraSaludCPU.setValue((int) (cpu.castillo.getPuntosVida() * 10));
        
        // Establece el cambio en el texto
        barraSaludJugador.setString(String.valueOf(jugador.castillo.getPuntosVida()) + " HP");
        barraSaludCPU.setString(String.valueOf(cpu.castillo.getPuntosVida()) + " HP");
    }
    
    // Método para realizar daño a los castillos
    public void dañoCastillos () {
        try {
            if (tropaActivaJugador.getPosicionTablero() == 4 && tropaActivaJugador.icono != null) {
                cpu.castillo.recibirDaño(tropaActivaJugador.getDaño());
                barraSalud();
            }

            if (tropaActivaCPU.getPosicionTablero() == 0 && tropaActivaCPU.icono != null) {
                jugador.castillo.recibirDaño(tropaActivaCPU.getDaño());
                barraSalud();
            }
        } catch (NullPointerException ex) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casillaCastilloSuperior = new javax.swing.JLabel();
        casillaCastilloInferior = new javax.swing.JLabel();
        casillaSuperiorIzquierda = new javax.swing.JLabel();
        casillaMedioIzquierda = new javax.swing.JLabel();
        casillaInferiorIzquierda = new javax.swing.JLabel();
        casillaSuperiorDerecha = new javax.swing.JLabel();
        casillaMedioDerecha = new javax.swing.JLabel();
        casillaInferiorDerecha = new javax.swing.JLabel();
        castilloJugador = new javax.swing.JLabel();
        castilloRival = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        puenteIzquierdo = new javax.swing.JLabel();
        puenteDerecho = new javax.swing.JLabel();
        ronda = new javax.swing.JLabel();
        rio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tropaJugador3 = new javax.swing.JLabel();
        tropaJugador1 = new javax.swing.JLabel();
        tropaJugador2 = new javax.swing.JLabel();
        tropaRival1 = new javax.swing.JLabel();
        tropaRival2 = new javax.swing.JLabel();
        tropaRival3 = new javax.swing.JLabel();
        tropasRestantesCPU = new javax.swing.JLabel();
        tropasRestantesJugador = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        caminoIzquierdoSeleccion = new javax.swing.JButton();
        caminoDerechoSeleccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        continuarBoton = new javax.swing.JButton();
        barraSaludCPU = new javax.swing.JProgressBar();
        barraSaludJugador = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(73, 142, 69));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casillaCastilloSuperior.setBackground(new java.awt.Color(198, 173, 125));
        casillaCastilloSuperior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaCastilloSuperior.setOpaque(true);
        jPanel1.add(casillaCastilloSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 50, 50));

        casillaCastilloInferior.setBackground(new java.awt.Color(198, 173, 125));
        casillaCastilloInferior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaCastilloInferior.setOpaque(true);
        jPanel1.add(casillaCastilloInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 50, 50));

        casillaSuperiorIzquierda.setBackground(new java.awt.Color(198, 173, 125));
        casillaSuperiorIzquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaSuperiorIzquierda.setOpaque(true);
        jPanel1.add(casillaSuperiorIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 50, 50));

        casillaMedioIzquierda.setBackground(new java.awt.Color(153, 153, 153));
        casillaMedioIzquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaMedioIzquierda.setOpaque(true);
        jPanel1.add(casillaMedioIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 50, 50));

        casillaInferiorIzquierda.setBackground(new java.awt.Color(198, 173, 125));
        casillaInferiorIzquierda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaInferiorIzquierda.setOpaque(true);
        jPanel1.add(casillaInferiorIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 50, 50));

        casillaSuperiorDerecha.setBackground(new java.awt.Color(198, 173, 125));
        casillaSuperiorDerecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaSuperiorDerecha.setOpaque(true);
        jPanel1.add(casillaSuperiorDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 50, 50));

        casillaMedioDerecha.setBackground(new java.awt.Color(153, 153, 153));
        casillaMedioDerecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaMedioDerecha.setOpaque(true);
        jPanel1.add(casillaMedioDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 50, 50));

        casillaInferiorDerecha.setBackground(new java.awt.Color(198, 173, 125));
        casillaInferiorDerecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        casillaInferiorDerecha.setOpaque(true);
        jPanel1.add(casillaInferiorDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 50, 50));

        castilloJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        castilloJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 1.png"))); // NOI18N
        jPanel1.add(castilloJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 548, -1, -1));

        castilloRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        castilloRival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/castle 2.png"))); // NOI18N
        jPanel1.add(castilloRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel5.setBackground(new java.awt.Color(198, 173, 125));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 50, 30));

        puenteIzquierdo.setBackground(new java.awt.Color(153, 153, 153));
        puenteIzquierdo.setOpaque(true);
        jPanel1.add(puenteIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 70, 120));

        puenteDerecho.setBackground(new java.awt.Color(153, 153, 153));
        puenteDerecho.setOpaque(true);
        jPanel1.add(puenteDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 70, 120));

        ronda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ronda.setForeground(new java.awt.Color(77, 165, 234));
        ronda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ronda.setText("RONDA 0");
        jPanel1.add(ronda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 230, 100));

        rio.setBackground(new java.awt.Color(25, 94, 147));
        rio.setForeground(new java.awt.Color(25, 94, 147));
        rio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        rio.setOpaque(true);
        jPanel1.add(rio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 608, 100));

        jLabel7.setBackground(new java.awt.Color(198, 173, 125));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 50, 120));

        jLabel8.setBackground(new java.awt.Color(198, 173, 125));
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 50, 120));

        jLabel9.setBackground(new java.awt.Color(198, 173, 125));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 50, 120));

        jLabel10.setBackground(new java.awt.Color(198, 173, 125));
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 50, 120));

        jLabel11.setBackground(new java.awt.Color(198, 173, 125));
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 250, 50));

        jLabel12.setBackground(new java.awt.Color(198, 173, 125));
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 250, 50));

        jLabel13.setBackground(new java.awt.Color(198, 173, 125));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 50, 50));

        tropaJugador3.setBackground(new java.awt.Color(204, 204, 204));
        tropaJugador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropaJugador3.setOpaque(true);
        jPanel1.add(tropaJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 650, 50, 50));

        tropaJugador1.setBackground(new java.awt.Color(204, 204, 204));
        tropaJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropaJugador1.setOpaque(true);
        jPanel1.add(tropaJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, 50, 50));

        tropaJugador2.setBackground(new java.awt.Color(204, 204, 204));
        tropaJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropaJugador2.setOpaque(true);
        jPanel1.add(tropaJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 50, 50));

        tropaRival1.setBackground(new java.awt.Color(204, 204, 204));
        tropaRival1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropaRival1.setOpaque(true);
        jPanel1.add(tropaRival1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 50, 50));

        tropaRival2.setBackground(new java.awt.Color(204, 204, 204));
        tropaRival2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropaRival2.setOpaque(true);
        jPanel1.add(tropaRival2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 50, 50));

        tropaRival3.setBackground(new java.awt.Color(204, 204, 204));
        tropaRival3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropaRival3.setOpaque(true);
        jPanel1.add(tropaRival3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        tropasRestantesCPU.setBackground(new java.awt.Color(221, 221, 221));
        tropasRestantesCPU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tropasRestantesCPU.setForeground(new java.awt.Color(221,221,221));
        tropasRestantesCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropasRestantesCPU.setText("Tropas restantes: 0");
        jPanel1.add(tropasRestantesCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        tropasRestantesJugador.setBackground(new java.awt.Color(221, 221, 221));
        tropasRestantesJugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tropasRestantesJugador.setForeground(new java.awt.Color(221,221,221));
        tropasRestantesJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tropasRestantesJugador.setText("Tropas restantes: 0");
        jPanel1.add(tropasRestantesJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 610, 20));

        caminoIzquierdoSeleccion.setBackground(new java.awt.Color(0, 102, 255));
        caminoIzquierdoSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arriba-blanco.png"))); // NOI18N
        caminoIzquierdoSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminoIzquierdoSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(caminoIzquierdoSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 50, 50));

        caminoDerechoSeleccion.setBackground(new java.awt.Color(0, 102, 255));
        caminoDerechoSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arriba-blanco.png"))); // NOI18N
        caminoDerechoSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminoDerechoSeleccionActionPerformed(evt);
            }
        });
        jPanel1.add(caminoDerechoSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 50, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221,221,221));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221,221,221));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(221,221,221));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("2");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(221,221,221));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("3");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 50, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(221,221,221));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 50, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(221,221,221));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("1");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 50, -1));

        continuarBoton.setBackground(new java.awt.Color(0, 102, 255));
        continuarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        continuarBoton.setForeground(new java.awt.Color(255, 255, 255));
        continuarBoton.setText("Continuar");
        continuarBoton.setFocusPainted(false);
        continuarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(continuarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 680, 110, -1));

        barraSaludCPU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        barraSaludCPU.setForeground(new java.awt.Color(255, 255, 255));
        barraSaludCPU.setValue(50);
        barraSaludCPU.setBorder(null);
        barraSaludCPU.setBorderPainted(false);
        barraSaludCPU.setFocusable(false);
        barraSaludCPU.setRequestFocusEnabled(false);
        barraSaludCPU.setString("5.0 HP");
        barraSaludCPU.setStringPainted(true);
        jPanel1.add(barraSaludCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 120, 20));

        barraSaludJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        barraSaludJugador.setForeground(new java.awt.Color(255, 255, 255));
        barraSaludJugador.setValue(50);
        barraSaludJugador.setBorder(null);
        barraSaludJugador.setBorderPainted(false);
        barraSaludJugador.setFocusable(false);
        barraSaludJugador.setRequestFocusEnabled(false);
        barraSaludJugador.setString("5.0 HP");
        barraSaludJugador.setStringPainted(true);
        jPanel1.add(barraSaludJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Camino Izquierdo
    private void caminoIzquierdoSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminoIzquierdoSeleccionActionPerformed
        caminoIzquierdo();
    }//GEN-LAST:event_caminoIzquierdoSeleccionActionPerformed

    // Camino Derecho
    private void caminoDerechoSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminoDerechoSeleccionActionPerformed
        caminoDerecho();
    }//GEN-LAST:event_caminoDerechoSeleccionActionPerformed

    // Botón Continuar
    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed
        switch (tropaActivaJugador.getPosicionTablero()) {
            // En caso de que vaya por la izquierda
            case -1:
            case -2:
            case -3:
                caminoIzquierdo();
                break;
                
            // En caso de que vaya por la derecha
            case 1:
            case 2:
            case 3:
                caminoDerecho();
                break;
                
            // En caso de que llegue al castillo enemigo (izq. o der. sirven)
            case 4:
                caminoDerecho();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_continuarBotonActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableroBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroBatalla(rival, jugador, cpu, numeroRonda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraSaludCPU;
    private javax.swing.JProgressBar barraSaludJugador;
    private javax.swing.JButton caminoDerechoSeleccion;
    private javax.swing.JButton caminoIzquierdoSeleccion;
    private javax.swing.JLabel casillaCastilloInferior;
    private javax.swing.JLabel casillaCastilloSuperior;
    private javax.swing.JLabel casillaInferiorDerecha;
    private javax.swing.JLabel casillaInferiorIzquierda;
    private javax.swing.JLabel casillaMedioDerecha;
    private javax.swing.JLabel casillaMedioIzquierda;
    private javax.swing.JLabel casillaSuperiorDerecha;
    private javax.swing.JLabel casillaSuperiorIzquierda;
    private javax.swing.JLabel castilloJugador;
    private javax.swing.JLabel castilloRival;
    private javax.swing.JButton continuarBoton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel puenteDerecho;
    private javax.swing.JLabel puenteIzquierdo;
    private javax.swing.JLabel rio;
    private javax.swing.JLabel ronda;
    private javax.swing.JLabel tropaJugador1;
    private javax.swing.JLabel tropaJugador2;
    private javax.swing.JLabel tropaJugador3;
    private javax.swing.JLabel tropaRival1;
    private javax.swing.JLabel tropaRival2;
    private javax.swing.JLabel tropaRival3;
    private javax.swing.JLabel tropasRestantesCPU;
    private javax.swing.JLabel tropasRestantesJugador;
    // End of variables declaration//GEN-END:variables
}
