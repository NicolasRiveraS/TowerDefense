package TowerDefense;

public class RivalPorCombatir extends javax.swing.JFrame {
    // Atributos
    private static String rival;
    
    // Contructor
    public RivalPorCombatir(String rival) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("¡Encuentro!");
        this.rival = rival;
        setTextos();
    }

    // Métodos
    public void setTextos () {
        textoRival.setText(rival);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultadoPrincipal = new javax.swing.JLabel();
        textoRival = new javax.swing.JLabel();
        textoJugador = new javax.swing.JLabel();
        textoVersus = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultadoPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resultadoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        resultadoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoPrincipal.setText("¡Encuentro!");
        jPanel1.add(resultadoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 30));

        textoRival.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoRival.setForeground(new java.awt.Color(255, 0, 0));
        textoRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoRival.setText("Rival 1");
        jPanel1.add(textoRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 400, -1));

        textoJugador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoJugador.setForeground(new java.awt.Color(0, 153, 0));
        textoJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoJugador.setText("Jugador");
        jPanel1.add(textoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, -1));

        textoVersus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoVersus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoVersus.setText("VS");
        jPanel1.add(textoVersus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, -1));

        botonContinuar.setBackground(new java.awt.Color(0, 102, 255));
        botonContinuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 20, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 20, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 20, 20));

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
            java.util.logging.Logger.getLogger(RivalPorCombatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RivalPorCombatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RivalPorCombatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RivalPorCombatir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RivalPorCombatir(rival).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultadoPrincipal;
    private javax.swing.JLabel textoJugador;
    private javax.swing.JLabel textoRival;
    private javax.swing.JLabel textoVersus;
    // End of variables declaration//GEN-END:variables
}
