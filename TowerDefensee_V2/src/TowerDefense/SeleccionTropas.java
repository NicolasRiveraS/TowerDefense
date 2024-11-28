package TowerDefense;

import java.awt.*;

public class SeleccionTropas extends javax.swing.JFrame {

    // Atributos
    private int cantidadTropas = 0;
    private int cantidadArqueros = 0;
    private int cantidadCaballeros = 0;
    private int cantidadMagos = 0;
    private static int numeroRonda;
    private int auxArqueros = 0;
    private int auxCaballeros = 0;
    private int auxMagos = 0;

    // Constructor
    public SeleccionTropas(int numeroRonda) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Selección de Tropas");
        jLabel1.setForeground(new java.awt.Color(139, 69, 19)); //café claro
        jPanel1.setBackground(new java.awt.Color(222, 184, 135)); //café madera
        jLabel2.setForeground(new java.awt.Color(210, 105, 30)); //chocolate???
        jLabel6.setForeground(new java.awt.Color(139, 69, 19)); //café claro

        jButton1.setBackground(new java.awt.Color(50, 205, 50)); // Verde lima
        jButton1.setForeground(new java.awt.Color(255, 255, 255)); // Texto blanco

        jButton2.setBackground(new java.awt.Color(220, 20, 60)); // Rojo carmesí
        jButton2.setForeground(new java.awt.Color(255, 255, 255)); // Texto blanco

        Spinner1.setForeground(new java.awt.Color(0, 0, 255)); // Texto azul
        ((javax.swing.JComponent) Spinner1.getEditor()).setBackground(new java.awt.Color(245, 245, 245)); // Fondo gris claro

        Spinner2.setForeground(new java.awt.Color(0, 128, 0)); // Texto verde
        ((javax.swing.JComponent) Spinner2.getEditor()).setBackground(new java.awt.Color(245, 245, 245)); // Fondo gris claro

        Spinner3.setForeground(new java.awt.Color(128, 0, 128)); // Texto morado
        ((javax.swing.JComponent) Spinner3.getEditor()).setBackground(new java.awt.Color(245, 245, 245)); // Fondo gris claro

        this.numeroRonda = numeroRonda;
        revisarRonda();
    }

    // Métodos
    // Getters
    public int getCantidadArqueros() {
        return cantidadArqueros;
    }

    public int getCantidadCaballeros() {
        return cantidadCaballeros;
    }

    public int getCantidadMagos() {
        return cantidadMagos;
    }

    // Verifica el número de ronda e imprime la información correspondiente
    public void revisarRonda() {
        jLabel1.setText("RONDA " + numeroRonda);
        jLabel2.setText("Selecciona tus tropas");
        jLabel6.setText("(Máximo " + (numeroRonda + 1) + ")");
    }

    // Método utilizado para hacer la correcta suma de las tropas seleccionadas
    public int cambioSpinner(int tropaNueva, String tipo) {
        int cambio = 0;

        switch (tipo) {
            case "Arquero":
                if (tropaNueva > auxArqueros) {
                    cambio = 1;
                } else if (tropaNueva < auxArqueros) {
                    cambio = -1;
                } else {
                    cambio = 0;
                }
                break;

            case "Caballero":
                if (tropaNueva > auxCaballeros) {
                    cambio = 1;
                } else if (tropaNueva < auxCaballeros) {
                    cambio = -1;
                } else {
                    cambio = 0;
                }
                break;

            case "Mago":
                if (tropaNueva > auxMagos) {
                    cambio = 1;
                } else if (tropaNueva < auxMagos) {
                    cambio = -1;
                } else {
                    cambio = 0;
                }
                break;

            default:
                throw new AssertionError();
        }
        return cambio;
    }

    // Verifica el número de ronda y establece la cantidad máxima de tropas por esa ronda
    public void revisarMaximoTropas(int cambioSpinner, String tipo) {
        cantidadTropas += cambioSpinner;

        if (cantidadTropas >= 1) {
            jButton1.setEnabled(true);
        }

        if (cantidadTropas >= (numeroRonda + 1)) {
            Spinner1.setEnabled(false);
            Spinner2.setEnabled(false);
            Spinner3.setEnabled(false);
        }

        switch (tipo) {
            case "Arquero":
                cantidadArqueros += cambioSpinner;
                break;

            case "Caballero":
                cantidadCaballeros += cambioSpinner;
                break;

            case "Mago":
                cantidadMagos += cambioSpinner;
                break;

            default:
                throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Spinner2 = new javax.swing.JSpinner();
        Spinner3 = new javax.swing.JSpinner();
        Spinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("RONDA 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona tus tropas");

        jLabel6.setText("(Máximo 2)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Magos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Caballeros");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Arqueros");

        Spinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Spinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner2StateChanged(evt);
            }
        });

        Spinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Spinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner3StateChanged(evt);
            }
        });

        Spinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Spinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner1StateChanged(evt);
            }
        });
        Spinner1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Spinner1PropertyChange(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("CONFIRMAR");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Deshacer");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Spinner1))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Spinner2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Spinner3))
                .addGap(50, 50, 50)
                .addComponent(jButton2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Arqueros
    private void Spinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner1StateChanged
        int arquero = (int) Spinner1.getValue();
        revisarMaximoTropas(cambioSpinner(arquero, "Arquero"), "Arquero");
        auxArqueros = arquero;
    }//GEN-LAST:event_Spinner1StateChanged

    private void Spinner1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Spinner1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Spinner1PropertyChange

    // Botón Confirmar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Caballeros
    private void Spinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner2StateChanged
        int caballero = (int) Spinner2.getValue();
        revisarMaximoTropas(cambioSpinner(caballero, "Caballero"), "Caballero");
        auxCaballeros = caballero;
    }//GEN-LAST:event_Spinner2StateChanged

    // Botón Deshacer
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Reinicia todos los valores a cero
        Spinner1.setValue(0);
        Spinner2.setValue(0);
        Spinner3.setValue(0);
        cantidadArqueros = 0;
        cantidadCaballeros = 0;
        cantidadMagos = 0;
        cantidadTropas = 0;
        auxArqueros = 0;
        auxCaballeros = 0;
        auxMagos = 0;

        // Habilita los spinners nuevamente
        Spinner1.setEnabled(true);
        Spinner2.setEnabled(true);
        Spinner3.setEnabled(true);

        // Desactiva el botón de confirmar hasta que haya tropas seleccionadas
        jButton1.setEnabled(false);

        //Restablece todos los valores y reactiva los spinners, lo que permite realizar una nueva selección sin reiniciar toda la ventana.
    }//GEN-LAST:event_jButton2ActionPerformed

    // Magos
    private void Spinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner3StateChanged
        int mago = (int) Spinner3.getValue();
        revisarMaximoTropas(cambioSpinner(mago, "Mago"), "Mago");
        auxMagos = mago;
    }//GEN-LAST:event_Spinner3StateChanged

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
            java.util.logging.Logger.getLogger(SeleccionTropas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionTropas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionTropas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionTropas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionTropas(numeroRonda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Spinner1;
    private javax.swing.JSpinner Spinner2;
    private javax.swing.JSpinner Spinner3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
