
package eafit.trabajofinal.swing;

import eafit.trabajofinal.logicajuego.InicializarJuego;
import eafit.trabajofinal.objetos.Bolita;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class JuegoPrincipal extends javax.swing.JFrame {
    private InicializarJuego playJuego;

    public JuegoPrincipal() {
        initComponents();
        playJuego = Inicio.getPlayJuego();
        pintarTablero(jPTablero.getGraphics());
        pintarCirculo(jPTablero.getGraphics());
    }
    
    private void pintarCirculo(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.fillOval(10, 30, 30, 30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTablero = new javax.swing.JPanel();
        jPDatos = new javax.swing.JPanel();
        jBPlayJuego = new javax.swing.JButton();
        jLTiempo = new javax.swing.JLabel();
        jLPuntaje = new javax.swing.JLabel();
        jTTiempo = new javax.swing.JTextField();
        jTPuntaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 0));

        jPTablero.setBackground(new java.awt.Color(255, 255, 255));
        jPTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPTableroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPTableroLayout = new javax.swing.GroupLayout(jPTablero);
        jPTablero.setLayout(jPTableroLayout);
        jPTableroLayout.setHorizontalGroup(
            jPTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPTableroLayout.setVerticalGroup(
            jPTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );

        jPDatos.setBackground(new java.awt.Color(204, 204, 204));

        jBPlayJuego.setText("Iniciar");
        jBPlayJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayJuegoActionPerformed(evt);
            }
        });

        jLTiempo.setText("Tiempo:");

        jLPuntaje.setText("Puntaje:");

        jTTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTiempoActionPerformed(evt);
            }
        });

        jTPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPuntajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDatosLayout = new javax.swing.GroupLayout(jPDatos);
        jPDatos.setLayout(jPDatosLayout);
        jPDatosLayout.setHorizontalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLPuntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBPlayJuego)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDatosLayout.setVerticalGroup(
            jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPlayJuego)
                    .addComponent(jLTiempo)
                    .addComponent(jLPuntaje)
                    .addComponent(jTTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPlayJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayJuegoActionPerformed
        jBPlayJuego.setVisible(false);
        pintarTablero(jPTablero.getGraphics());
    }//GEN-LAST:event_jBPlayJuegoActionPerformed

    private void jTTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTiempoActionPerformed

    private void jTPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPuntajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPuntajeActionPerformed

    private void jPTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPTableroMouseClicked
        Graphics2D dibujador = (Graphics2D)jPTablero.getGraphics();
        double distanciaX = Math.pow(evt.getX() - 60, 2);
        double distanciaY = Math.pow(evt.getY() - 20, 2);
        double distancia = Math.sqrt(distanciaX + distanciaY);
        if(distancia <= Bolita.getRadio()){
            // crear metodo para definir si es un movimiento permitido
            // crear metodo para seleccionar bolita
            // crear metodo para almacenar la bolita que posiblimente sera borrada
            dibujador.setColor(Color.BLACK);
            dibujador.setStroke(new BasicStroke(2));
            dibujador.drawOval(60, 20, 30, 30);
        }
    }//GEN-LAST:event_jPTableroMouseClicked

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
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegoPrincipal().setVisible(true);
            }
        });
    }
    
    private void pintarTablero(Graphics g){
        Graphics2D dibujador = (Graphics2D) g;

        for(int i=0; i<playJuego.getTablero().getBolitasX(); i++){
            for(int j=0; j<playJuego.getTablero().getBolitasY(); j++){
                Bolita bolita = playJuego.getTablero().getTableroBolita()[i][j];
                dibujador.setColor(bolita.getColor());
                dibujador.fillOval(bolita.getX(), bolita.getY(), Bolita.getRadio(), Bolita.getRadio());
            }
        
        }
    
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPlayJuego;
    private javax.swing.JLabel jLPuntaje;
    private javax.swing.JLabel jLTiempo;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JPanel jPTablero;
    private javax.swing.JTextField jTPuntaje;
    private javax.swing.JTextField jTTiempo;
    // End of variables declaration//GEN-END:variables
}
