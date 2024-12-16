package TowerDefense;

public class MensajeCombate extends javax.swing.JFrame {
    // Atributos
    private static Tropa tropaJugador;
    private static Tropa tropaCPU;
    private static Tropa tropaGanadora;
    
    // Constructor
    public MensajeCombate(Tropa tropaJugador, Tropa tropaCPU, Tropa tropaGanadora) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("¡Combate entre tropas!");
        this.tropaJugador = tropaJugador;
        this.tropaCPU = tropaCPU;
        this.tropaGanadora = tropaGanadora;
        setTextoTropas();
    }

    // Métodos
    public void setTextoTropas () {
        // Empate tropas
        if (tropaGanadora == null) {
            // Asigna los textos del mensaje
            textTropaJugador.setText(tropaJugador.tipo);
            textTropaJugador.setForeground(new java.awt.Color(0, 0, 0));
            textTropaCPU.setText(tropaCPU.tipo);
            textTropaCPU.setForeground(new java.awt.Color(0, 0, 0));
            // Asigna los íconos
            iconTropaJugador.setIcon(tropaJugador.icono);
            iconTropaCPU.setIcon(tropaCPU.icono);
            // Indica que ambas tropas sobreviven
            ganadorJugador.setText("¡Empate!");
            ganadorCPU.setText("¡Empate!");
            // Pinta los recuadros ganadores
            panelJugador.setBackground(new java.awt.Color(255, 204, 0));
            panelCPU.setBackground(new java.awt.Color(255, 204, 0));
        }
        // Gana tropa Jugador
        else if (tropaGanadora == tropaJugador) {
            // Asigna los textos del mensaje
            textTropaJugador.setText(tropaJugador.tipo);
            textTropaCPU.setText(tropaCPU.tipo);
            // Asigna los íconos
            iconTropaJugador.setIcon(tropaJugador.icono);
            iconTropaCPU.setIcon(tropaCPU.icono);
            // Indica que el jugador gana
            ganadorJugador.setText("¡Ganador!");
            ganadorCPU.setText("");
            // Pinta el recuadro ganador
            panelJugador.setBackground(new java.awt.Color(0, 153, 0));
            panelCPU.setBackground(null);
        }
        // Gana tropa CPU
        else if (tropaGanadora == tropaCPU) {
            // Asigna los textos del mensaje
            textTropaJugador.setText(tropaJugador.tipo);
            textTropaCPU.setText(tropaCPU.tipo);
            // Asigna los íconos
            iconTropaJugador.setIcon(tropaJugador.icono);
            iconTropaCPU.setIcon(tropaCPU.icono);
            // Indica que el cpu gana
            ganadorJugador.setText("");
            ganadorCPU.setText("¡Ganador!");
            // Pinta el recuadro ganador
            panelJugador.setBackground(null);
            panelCPU.setBackground(new java.awt.Color(0, 153, 0));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCPU = new javax.swing.JPanel();
        textTropaCPU = new javax.swing.JLabel();
        iconTropaCPU = new javax.swing.JLabel();
        panelJugador = new javax.swing.JPanel();
        textTropaJugador = new javax.swing.JLabel();
        iconTropaJugador = new javax.swing.JLabel();
        continuarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ganadorCPU = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ganadorJugador = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCPU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTropaCPU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textTropaCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTropaCPU.setText("Tropa");
        panelCPU.add(textTropaCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        iconTropaCPU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconTropaCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconTropaCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arquero.png"))); // NOI18N
        panelCPU.add(iconTropaCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 70));

        getContentPane().add(panelCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 70, 90));

        panelJugador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTropaJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textTropaJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTropaJugador.setText("Tropa");
        panelJugador.add(textTropaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        iconTropaJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iconTropaJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconTropaJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arquero.png"))); // NOI18N
        panelJugador.add(iconTropaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 70));

        getContentPane().add(panelJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 90));

        continuarBoton.setBackground(new java.awt.Color(0, 102, 255));
        continuarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        continuarBoton.setForeground(new java.awt.Color(255, 255, 255));
        continuarBoton.setText("Continuar");
        continuarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });
        getContentPane().add(continuarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Combate entre tropas!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 210, -1));

        ganadorCPU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ganadorCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganadorCPU.setText("¡Ganador!");
        getContentPane().add(ganadorCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 120, 390, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 20));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 30, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Jugador");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 60, 80, 20));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 20));

        ganadorJugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ganadorJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganadorJugador.setText("¡Ganador!");
        getContentPane().add(ganadorJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 190, 90, 30));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(MensajeCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensajeCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensajeCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensajeCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MensajeCombate (tropaJugador, tropaCPU, tropaGanadora).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarBoton;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel ganadorCPU;
    private javax.swing.JLabel ganadorJugador;
    private javax.swing.JLabel iconTropaCPU;
    private javax.swing.JLabel iconTropaJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelCPU;
    private javax.swing.JPanel panelJugador;
    private javax.swing.JLabel textTropaCPU;
    private javax.swing.JLabel textTropaJugador;
    // End of variables declaration//GEN-END:variables
}
