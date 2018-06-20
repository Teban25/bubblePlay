package eafit.trabajofinal.swing;


import eafit.trabajofinal.logicajuego.AdministracionJuego;


public class Inicio extends javax.swing.JFrame {

    private static AdministracionJuego playJuego;
    
    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciarJuego = new javax.swing.JButton();
        jLbolitasY = new javax.swing.JLabel();
        jLbolitasX = new javax.swing.JLabel();
        jTFbolitasX = new javax.swing.JTextField();
        jTFbolitasY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciarJuego.setText("INICIAR JUEGO");
        iniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJuegoActionPerformed(evt);
            }
        });

        jLbolitasY.setText("BOLITAS VERTICALES:");

        jLbolitasX.setText("BOLITAS HORIZONTALES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(iniciarJuego)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbolitasX)
                    .addComponent(jLbolitasY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFbolitasY, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jTFbolitasX))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbolitasX)
                    .addComponent(jTFbolitasX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbolitasY)
                    .addComponent(jTFbolitasY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(iniciarJuego)
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void iniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJuegoActionPerformed
        int bolitasX = Integer.parseInt(jTFbolitasX.getText());
        int bolitasY = Integer.parseInt(jTFbolitasY.getText());
        int cantidadColores = 4;
        
        playJuego = new AdministracionJuego();
        playJuego.crearTablero(bolitasX, bolitasY, cantidadColores);
        JuegoPrincipal juego = new JuegoPrincipal();
        juego.setSize(playJuego.getTablero().getAncho(), playJuego.getTablero().getLargo());
        juego.setResizable(false);
        juego.setLocation(400, 150);
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iniciarJuegoActionPerformed


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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public static AdministracionJuego getPlayJuego() {
        return playJuego;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarJuego;
    private javax.swing.JLabel jLbolitasX;
    private javax.swing.JLabel jLbolitasY;
    private javax.swing.JTextField jTFbolitasX;
    private javax.swing.JTextField jTFbolitasY;
    // End of variables declaration//GEN-END:variables
}
