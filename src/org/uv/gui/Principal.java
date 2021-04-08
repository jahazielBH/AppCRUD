package org.uv.gui;

import java.awt.Component;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        btoInicio = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        btoOpciones = new javax.swing.JMenu();
        btoEstudiante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(750, 450));

        desktop.setBackground(java.awt.Color.white);
        desktop.setMaximumSize(new java.awt.Dimension(600, 450));
        desktop.setMinimumSize(new java.awt.Dimension(600, 450));
        desktop.setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        btoInicio.setText("Inicio");
        btoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        salir.setForeground(java.awt.Color.black);
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        btoInicio.add(salir);

        menu.add(btoInicio);

        btoOpciones.setText("ventana");
        btoOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btoEstudiante.setForeground(java.awt.Color.black);
        btoEstudiante.setText("CRUD");
        btoEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEstudianteActionPerformed(evt);
            }
        });
        btoOpciones.add(btoEstudiante);

        menu.add(btoOpciones);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void btoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEstudianteActionPerformed
        EstudianteGUI emp = EstudianteGUI.getInstance();
        emp.setVisible(true);
        for (Component com : desktop.getComponents()) {
            if (com.equals(emp)) {
                return;
            }
        }
        desktop.add(emp);
    }//GEN-LAST:event_btoEstudianteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btoEstudiante;
    private javax.swing.JMenu btoInicio;
    private javax.swing.JMenu btoOpciones;
    private javax.swing.JPanel desktop;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
