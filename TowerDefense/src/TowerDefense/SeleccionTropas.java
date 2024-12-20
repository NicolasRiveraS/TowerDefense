package TowerDefense;

import javax.swing.*;

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
        
        // Obliga a que el usuario pueda cambiar los valores de los spinner únicamente mediante las flechas 
        // Inhabilita la edición del texto
        ((JSpinner.DefaultEditor) Spinner1.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) Spinner2.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) Spinner3.getEditor()).getTextField().setEditable(false);
        // Inhabilita que el cursor de texto se posicione sobre los valores
        ((JSpinner.DefaultEditor) Spinner1.getEditor()).getTextField().setFocusable(false);
        ((JSpinner.DefaultEditor) Spinner2.getEditor()).getTextField().setFocusable(false);
        ((JSpinner.DefaultEditor) Spinner3.getEditor()).getTextField().setFocusable(false);

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

        jPanel2 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RONDA 1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 36, 640, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona tus tropas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 104, 640, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("(Máximo 2)");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 130, 640, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Magos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 6, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Caballeros");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Arqueros");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 6, 68, -1));

        Spinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Spinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner2StateChanged(evt);
            }
        });
        jPanel1.add(Spinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 38, 71, -1));

        Spinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Spinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner3StateChanged(evt);
            }
        });
        jPanel1.add(Spinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 38, -1, -1));

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
        jPanel1.add(Spinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 38, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONFIRMAR");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 115, 158, 52));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Deshacer");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 38, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 176, 642, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 380));

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
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
