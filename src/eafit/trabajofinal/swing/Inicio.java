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
        jBPuntajes = new javax.swing.JButton();
        JLjugador = new javax.swing.JLabel();
        jTFjugador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciarJuego.setText("INICIAR JUEGO");
        iniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarJuegoActionPerformed(evt);
            }
        });

        jLbolitasY.setText("BOLITAS VERTICALES:");

        jLbolitasX.setText("BOLITAS HORIZONTALES:");

        jBPuntajes.setText("PUNTAJES");
        jBPuntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPuntajesActionPerformed(evt);
            }
        });

        JLjugador.setText("NOMBRE DEL JUGADOR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jBPuntajes)
                .addGap(43, 43, 43)
                .addComponent(iniciarJuego)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbolitasX)
                            .addComponent(jLbolitasY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFbolitasY, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTFbolitasX)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLjugador)
                        .addGap(18, 18, 18)
                        .addComponent(jTFjugador)))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLjugador)
                    .addComponent(jTFjugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbolitasX)
                    .addComponent(jTFbolitasX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbolitasY)
                    .addComponent(jTFbolitasY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarJuego)
                    .addComponent(jBPuntajes))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void iniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarJuegoActionPerformed
        String nombreJugador = jTFjugador.getText();
        int bolitasX = Integer.parseInt(jTFbolitasX.getText());
        int bolitasY = Integer.parseInt(jTFbolitasY.getText());
        int cantidadColores = 4;
        
        playJuego = new AdministracionJuego();
        playJuego.crearTablero(nombreJugador,bolitasX, bolitasY, cantidadColores);
        JuegoPrincipal juego = new JuegoPrincipal();
        juego.setSize(playJuego.getTablero().getAncho(), playJuego.getTablero().getLargo());
        juego.setResizable(false);
        juego.setLocation(400, 150);
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iniciarJuegoActionPerformed

    private void jBPuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPuntajesActionPerformed
         Puntajes puntajes = new Puntajes();
           puntajes.setResizable(false);
        puntajes.setLocation(400, 150);
        puntajes.setVisible(true);
    }//GEN-LAST:event_jBPuntajesActionPerformed


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
    private javax.swing.JLabel JLjugador;
    private javax.swing.JButton iniciarJuego;
    private javax.swing.JButton jBPuntajes;
    private javax.swing.JLabel jLbolitasX;
    private javax.swing.JLabel jLbolitasY;
    private javax.swing.JTextField jTFbolitasX;
    private javax.swing.JTextField jTFbolitasY;
    private javax.swing.JTextField jTFjugador;
    // End of variables declaration//GEN-END:variables
}
