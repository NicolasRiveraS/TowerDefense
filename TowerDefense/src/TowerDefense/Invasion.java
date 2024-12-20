package TowerDefense;

import java.util.Random;
import javax.swing.JLabel;

public class Invasion extends javax.swing.JFrame {
    // Atributos
    private static ArbolInvasion arbol;
    private static int numRival;
    private Random r;
    private int posicionSiguienteRival = 12;
    private String rival2Ganador1 = "", rival2Ganador2 = "";
    
    // Constructor
    public Invasion(ArbolInvasion arbol, int numRival) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Progreso de Invasión");
        this.arbol = arbol;
        this.numRival = numRival;
        this.r = new Random();
        textoNombreRival2Ganador.setVisible(false);
        setProgreso();
    }
    public Invasion(ArbolInvasion arbol, int numRival, String rival2Ganador1, String rival2Ganador2) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Progreso de Invasión");
        this.arbol = arbol;
        this.numRival = numRival;
        this.rival2Ganador1 = rival2Ganador1;
        this.rival2Ganador2 = rival2Ganador2;
        this.r = new Random();
        textoNombreRival2Ganador.setVisible(false);
        setProgreso();
    }

    // Métodos
    public int getPosicionSiguienteRival () {
        return this.posicionSiguienteRival;
    }
    public String getRival2Ganador1 () {
        return this.rival2Ganador1;
    }
    public String getRival2Ganador2 () {
        return this.rival2Ganador2;
    }
    
    public void setProgreso(){
        textoNombre1.setText(arbol.getNombre(14)); // Jugador
        textoNombre2.setText(arbol.getNombre(12)); // Wulfric

        textoNombre3.setText(arbol.getNombre(10)); // Edric
        textoNombre4.setText(arbol.getNombre(8)); // Alaric

        textoNombre5.setText(arbol.getNombre(6)); // Baldric
        textoNombre6.setText(arbol.getNombre(4)); // Godfrey

        textoNombre7.setText(arbol.getNombre(2)); // Cedric
        textoNombre8.setText(arbol.getNombre(0)); // Ragnar
        
        switch (numRival) {
            case 1:
                break;
            case 2:
                pintarCaminos2();
                break;
            case 3:
                pintarCaminos3();
                break;
            case 100:
                pintarCaminos3();
                jLabel28.setBackground(new java.awt.Color(102, 204, 255));
                jLabel31.setBackground(new java.awt.Color(102, 204, 255));
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private void pintarCaminos3 () {
        // Camino jugador
        textoNombre1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel22.setBackground(new java.awt.Color(102, 204, 255));
        jLabel23.setBackground(new java.awt.Color(102, 204, 255));
        jLabel24.setBackground(new java.awt.Color(102, 204, 255));
        jLabel29.setBackground(new java.awt.Color(102, 204, 255));
        jLabel30.setBackground(new java.awt.Color(102, 204, 255));
        jLabel14.setBackground(new java.awt.Color(102, 204, 255));
        
        if (rival2Ganador1.equals(textoNombre5.getText())) {
            textoNombre5.setBackground(new java.awt.Color(102, 204, 255));
            jLabel15.setBackground(new java.awt.Color(102, 204, 255));
            jLabel16.setBackground(new java.awt.Color(102, 204, 255));
            jLabel25.setBackground(new java.awt.Color(102, 204, 255));
            jLabel26.setBackground(new java.awt.Color(102, 204, 255));
        }
        else {
            textoNombre6.setBackground(new java.awt.Color(102, 204, 255));
            jLabel13.setBackground(new java.awt.Color(102, 204, 255));
            jLabel16.setBackground(new java.awt.Color(102, 204, 255));
            jLabel25.setBackground(new java.awt.Color(102, 204, 255));
            jLabel26.setBackground(new java.awt.Color(102, 204, 255)); 
        }
        
        if (rival2Ganador2.equals(textoNombre7.getText())) {
            textoNombre7.setBackground(new java.awt.Color(102, 204, 255));
            jLabel1.setBackground(new java.awt.Color(102, 204, 255));
            jLabel10.setBackground(new java.awt.Color(102, 204, 255));
            jLabel11.setBackground(new java.awt.Color(102, 204, 255));
            jLabel38.setBackground(new java.awt.Color(102, 204, 255));
        }
        else {
            textoNombre8.setBackground(new java.awt.Color(102, 204, 255));
            jLabel1.setBackground(new java.awt.Color(102, 204, 255));
            jLabel11.setBackground(new java.awt.Color(102, 204, 255));
            jLabel12.setBackground(new java.awt.Color(102, 204, 255));
            jLabel38.setBackground(new java.awt.Color(102, 204, 255));
        }
        
        jLabel20.setBackground(new java.awt.Color(102, 204, 255));
        jLabel36.setBackground(new java.awt.Color(102, 204, 255));
        
        if (ganadorAleatorioRivales2(rival2Ganador1, rival2Ganador2).equals(textoNombre5.getText())) {
            posicionSiguienteRival = 6;
        }
        else if (ganadorAleatorioRivales2(rival2Ganador1, rival2Ganador2).equals(textoNombre6.getText())) {
            posicionSiguienteRival = 4;
        }
        else if (ganadorAleatorioRivales2(rival2Ganador1, rival2Ganador2).equals(textoNombre7.getText())) {
            posicionSiguienteRival = 2;
        }
        else {
            posicionSiguienteRival = 0;
        }
        textoNombreRival2Ganador.setVisible(true);
        textoNombreRival2Ganador.setText(arbol.getNombre(posicionSiguienteRival));
    }
    
    private void pintarCaminos2 () {
        // Camino jugador
        textoNombre1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel22.setBackground(new java.awt.Color(102, 204, 255));
        jLabel23.setBackground(new java.awt.Color(102, 204, 255));
        jLabel24.setBackground(new java.awt.Color(102, 204, 255));
        jLabel29.setBackground(new java.awt.Color(102, 204, 255));
        
        // Batalla llave 2
        if (ganadorAleatorioRivales(textoNombre3, textoNombre4).equals(textoNombre3.getText())) {
            textoNombre3.setBackground(new java.awt.Color(102, 204, 255));
            jLabel18.setBackground(new java.awt.Color(102, 204, 255));
            jLabel19.setBackground(new java.awt.Color(102, 204, 255));
            jLabel27.setBackground(new java.awt.Color(102, 204, 255));
            jLabel37.setBackground(new java.awt.Color(102, 204, 255));
            posicionSiguienteRival = 10;
        }
        else {
            textoNombre4.setBackground(new java.awt.Color(102, 204, 255));
            jLabel17.setBackground(new java.awt.Color(102, 204, 255));
            jLabel18.setBackground(new java.awt.Color(102, 204, 255));
            jLabel27.setBackground(new java.awt.Color(102, 204, 255));
            jLabel37.setBackground(new java.awt.Color(102, 204, 255));
            posicionSiguienteRival = 8;
        }
        
        // Batalla llave 3
        if (ganadorAleatorioRivales(textoNombre5, textoNombre6).equals(textoNombre5.getText())) {
            textoNombre5.setBackground(new java.awt.Color(102, 204, 255));
            jLabel15.setBackground(new java.awt.Color(102, 204, 255));
            jLabel16.setBackground(new java.awt.Color(102, 204, 255));
            jLabel25.setBackground(new java.awt.Color(102, 204, 255));
            jLabel26.setBackground(new java.awt.Color(102, 204, 255));
            rival2Ganador1 = textoNombre5.getText();
        } 
        else {
            textoNombre6.setBackground(new java.awt.Color(102, 204, 255));
            jLabel13.setBackground(new java.awt.Color(102, 204, 255));
            jLabel16.setBackground(new java.awt.Color(102, 204, 255));
            jLabel25.setBackground(new java.awt.Color(102, 204, 255));
            jLabel26.setBackground(new java.awt.Color(102, 204, 255));
            rival2Ganador1 = textoNombre6.getText();
        }
        
        // Batalla llave 4
        if (ganadorAleatorioRivales(textoNombre7, textoNombre8).equals(textoNombre7.getText())) {
            textoNombre7.setBackground(new java.awt.Color(102, 204, 255));
            jLabel1.setBackground(new java.awt.Color(102, 204, 255));
            jLabel10.setBackground(new java.awt.Color(102, 204, 255));
            jLabel11.setBackground(new java.awt.Color(102, 204, 255));
            jLabel38.setBackground(new java.awt.Color(102, 204, 255));
            rival2Ganador2 = textoNombre7.getText();
        } 
        else {
            textoNombre8.setBackground(new java.awt.Color(102, 204, 255));
            jLabel1.setBackground(new java.awt.Color(102, 204, 255));
            jLabel11.setBackground(new java.awt.Color(102, 204, 255));
            jLabel12.setBackground(new java.awt.Color(102, 204, 255));
            jLabel38.setBackground(new java.awt.Color(102, 204, 255));
            rival2Ganador2 = textoNombre8.getText();
        }
    }
    
    private String ganadorAleatorioRivales (JLabel rival1, JLabel rival2) {
        String ganador;
        int valor = r.nextInt(1, 3);
        switch (valor) {
            case 1:
                ganador = rival1.getText();
                break;
            case 2:
                ganador = rival2.getText();
                break;
            default:
                throw new AssertionError();
        }
        return ganador;
    }
    
    private String ganadorAleatorioRivales2 (String rival1, String rival2) {
        String ganador;
        int valor = r.nextInt(1, 3);
        switch (valor) {
            case 1:
                ganador = rival1;
                break;
            case 2:
                ganador = rival2;
                break;
            default:
                throw new AssertionError();
        }
        return ganador;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emperador = new javax.swing.JLabel();
        textoNombreRival2Ganador = new javax.swing.JLabel();
        textoNombre1 = new javax.swing.JLabel();
        textoNombre2 = new javax.swing.JLabel();
        textoNombre3 = new javax.swing.JLabel();
        textoNombre4 = new javax.swing.JLabel();
        textoNombre5 = new javax.swing.JLabel();
        textoNombre6 = new javax.swing.JLabel();
        textoNombre7 = new javax.swing.JLabel();
        textoNombre8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emperador.setBackground(new java.awt.Color(153, 153, 153));
        emperador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emperador.setForeground(new java.awt.Color(0, 0, 0));
        emperador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emperador.setText("Emperador");
        jPanel1.add(emperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 30));

        textoNombreRival2Ganador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoNombreRival2Ganador.setForeground(new java.awt.Color(0, 0, 0));
        textoNombreRival2Ganador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombreRival2Ganador.setText("Nombre");
        jPanel1.add(textoNombreRival2Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 280, 100, 20));

        textoNombre1.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre1.setForeground(new java.awt.Color(0, 153, 0));
        textoNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre1.setText("Nombre");
        textoNombre1.setOpaque(true);
        jPanel1.add(textoNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 120, 30));

        textoNombre2.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre2.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre2.setText("Nombre");
        textoNombre2.setOpaque(true);
        jPanel1.add(textoNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, 30));

        textoNombre3.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre3.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre3.setText("Nombre");
        textoNombre3.setOpaque(true);
        jPanel1.add(textoNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 120, 30));

        textoNombre4.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre4.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre4.setText("Nombre");
        textoNombre4.setOpaque(true);
        jPanel1.add(textoNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 120, 30));

        textoNombre5.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre5.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre5.setText("Nombre");
        textoNombre5.setOpaque(true);
        jPanel1.add(textoNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 120, 30));

        textoNombre6.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre6.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre6.setText("Nombre");
        textoNombre6.setOpaque(true);
        jPanel1.add(textoNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 120, 30));

        textoNombre7.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre7.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre7.setText("Nombre");
        textoNombre7.setOpaque(true);
        jPanel1.add(textoNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 120, 30));

        textoNombre8.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre8.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre8.setText("Nombre");
        textoNombre8.setOpaque(true);
        jPanel1.add(textoNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 120, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 60, 10));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 40, 10));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 10, 30));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 40, 10));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 40, 10));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setOpaque(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 20, 80));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 40, 10));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 60, 10));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 40, 10));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setOpaque(true);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 10, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 40, 10));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setOpaque(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 90, 20));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 40, 10));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 10, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 40, 10));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setOpaque(true);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 60, 10));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 10, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 10, 40));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setOpaque(true);
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 60, 10));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/corona.png"))); // NOI18N
        jLabel28.setOpaque(true);
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 100));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setOpaque(true);
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 10, 40));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setOpaque(true);
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 90, 20));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setOpaque(true);
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 50, 20));
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 20, 20));
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 20, 20));
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 20, 20));

        botonContinuar.setBackground(new java.awt.Color(0, 102, 255));
        botonContinuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 110, 40));

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setOpaque(true);
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 20, 80));

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setOpaque(true);
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 10, 40));

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setOpaque(true);
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 10, 40));

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

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(Invasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invasion(arbol, numRival).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JLabel emperador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoNombre1;
    private javax.swing.JLabel textoNombre2;
    private javax.swing.JLabel textoNombre3;
    private javax.swing.JLabel textoNombre4;
    private javax.swing.JLabel textoNombre5;
    private javax.swing.JLabel textoNombre6;
    private javax.swing.JLabel textoNombre7;
    private javax.swing.JLabel textoNombre8;
    private javax.swing.JLabel textoNombreRival2Ganador;
    // End of variables declaration//GEN-END:variables
}
