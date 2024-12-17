package TowerDefense;

public class ResultadoRival extends javax.swing.JFrame {
    // Atributos
    private static int rival;
    private static Jugador jugador;
    private static CPU cpu;
    private static int numeroRonda;
    
    // Constructor
    public ResultadoRival(int rival, Jugador jugador, CPU cpu, int numeroRonda) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Resultado Batalla");
        this.rival = rival;
        this.jugador = jugador;
        this.cpu = cpu;
        this.numeroRonda = numeroRonda;
        setResultados();
    }

    // Métodos
    public void setResultados () {
        // CPU Gana
        if (jugador.getCastillo().getPuntosVida() <= 0) {
            resultadoPrincipal.setText("¡Derrota!");
            resultadoPrincipal.setForeground(new java.awt.Color(255, 0, 0));
            textoRival.setText("¡Has sido derrotado por el Rival " + rival + "!");
        }
        // Jugador Gana
        else if (cpu.getCastillo().getPuntosVida() <= 0) {
            resultadoPrincipal.setText("¡Victoria!");
            resultadoPrincipal.setForeground(new java.awt.Color(0, 153, 0));
            textoRival.setText("¡Has vencido al Rival " + rival + "!");
        }
        textoRondas.setText("Rondas: " + numeroRonda);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultadoPrincipal = new javax.swing.JLabel();
        textoRival = new javax.swing.JLabel();
        textoRondas = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultadoPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resultadoPrincipal.setForeground(new java.awt.Color(255, 0, 0));
        resultadoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoPrincipal.setText("¡Victoria!");
        jPanel1.add(resultadoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 30));

        textoRival.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoRival.setText("¡Has vencido al Rival 1!");
        jPanel1.add(textoRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, -1));

        textoRondas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoRondas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoRondas.setText("Rondas: 0");
        jPanel1.add(textoRondas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, -1));

        botonContinuar.setBackground(new java.awt.Color(0, 102, 255));
        botonContinuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 20, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 20, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 20, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

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
            java.util.logging.Logger.getLogger(ResultadoRival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultadoRival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultadoRival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultadoRival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultadoRival(rival, jugador, cpu, numeroRonda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultadoPrincipal;
    private javax.swing.JLabel textoRival;
    private javax.swing.JLabel textoRondas;
    // End of variables declaration//GEN-END:variables
}
