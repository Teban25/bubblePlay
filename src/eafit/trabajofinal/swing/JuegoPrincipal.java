
package eafit.trabajofinal.swing;

import eafit.trabajofinal.logicajuego.AdministracionJuego;
import eafit.trabajofinal.objetos.Bolita;
import eafit.trabajofinal.objetos.Colores;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class JuegoPrincipal extends javax.swing.JFrame {
    private AdministracionJuego playJuego;
    private int tiempo = 0;
    private int puntaje = 0;
    private static final int ajustadorRadio = 4;
    private static final int ajustadorCoord =17;
    
    public JuegoPrincipal() {
        initComponents();
        this.setPlayJuego(Inicio.getPlayJuego());
        this.setPuntaje(0);
        this.setTiempo(this.inicializarTiempo());
        jTPuntaje.setText(String.valueOf(this.getPuntaje()));
        jTTiempo.setText(String.valueOf(this.getTiempo()));
    }
    
    private int inicializarTiempo() {
        int tiempoInicial = this.getPlayJuego().getTablero().getBolitasX()*
                this.getPlayJuego().getTablero().getBolitasY()*2;
        
        return tiempoInicial;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 0));

        jPTablero.setBackground(new java.awt.Color(255, 255, 255));
        jPTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPTableroMouseClicked(evt);
            }
        });
        jPTablero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPTableroKeyPressed(evt);
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
            .addGap(0, 232, Short.MAX_VALUE)
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

        jTTiempo.setEditable(false);
        jTTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTiempoActionPerformed(evt);
            }
        });

        jTPuntaje.setEditable(false);
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

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Reiniciar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
        tiempoJuego.start();
        jBPlayJuego.setVisible(Boolean.FALSE);
        pintarTablero(jPTablero.getGraphics());
    }//GEN-LAST:event_jBPlayJuegoActionPerformed

    private void jTTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTiempoActionPerformed

    private void jTPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPuntajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPuntajeActionPerformed

    private void jPTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPTableroMouseClicked
       Graphics2D dibujador = (Graphics2D) jPTablero.getGraphics();
        if (evt.getButton() == MouseEvent.BUTTON1) {
            boolean movimientoPermitido = this.getPlayJuego().validarMovimiento(evt.getX(), evt.getY());
            if (movimientoPermitido) {
                pintarSeleccionadas(dibujador);
            } else {
                borrarSeleccionadas(dibujador);
            }
        }else if(evt.getButton()==MouseEvent.BUTTON3){
            finalizarJugada(dibujador);
        }
    }//GEN-LAST:event_jPTableroMouseClicked

    private void jPTableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPTableroKeyPressed
       
    }//GEN-LAST:event_jPTableroKeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Inicio nuevoJuego = new Inicio();
        nuevoJuego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

        for(int i=0; i< this.getPlayJuego().getTablero().getBolitasX(); i++){
            for(int j=0; j< this.getPlayJuego().getTablero().getBolitasY(); j++){
                Bolita bolita = this.getPlayJuego().getTablero().getTableroBolita()[i][j];
                dibujador.setColor(bolita.getColor());
                dibujador.fillOval(bolita.getX() - 15, bolita.getY() - 15, Bolita.getRadio(), Bolita.getRadio());
            }
        }
    }
    
    private void pintarSeleccionadas(Graphics g){
        Graphics2D dibujador = (Graphics2D) g;
        dibujador.setColor(Color.BLACK);
        dibujador.setStroke(new BasicStroke(2));
        int cantidadSeleccionadas = this.getPlayJuego().getBolitasSeleccionadas().size();
        for(int i=0; i<cantidadSeleccionadas; i++){
            dibujador.drawOval(this.getPlayJuego().getBolitasSeleccionadas().get(i).getX() - 15,
                    this.getPlayJuego().getBolitasSeleccionadas().get(i).getY() - 15,
                    Bolita.getRadio(), Bolita.getRadio());
        }
    }
    
    private void borrarSeleccionadas(Graphics g){
        Graphics2D dibujador = (Graphics2D) g;
        int cantidadSeleccionadas = this.getPlayJuego().getBolitasSeleccionadas().size();
        for(int i=0; i<cantidadSeleccionadas; i++){
            Bolita bolita = this.getPlayJuego().getBolitasSeleccionadas().get(i);
            borrarBolita(bolita, dibujador);
        }
        for(int i=0; i<cantidadSeleccionadas; i++){
            Bolita bolita = this.getPlayJuego().getBolitasSeleccionadas().get(i);
            pintarBolita(bolita, dibujador);
        }
        this.getPlayJuego().limpiarBolitasSeleccionadas();
    }
    
    private void borrarBolita(Bolita bolita, Graphics2D g){
        g.setColor(Color.WHITE);
        g.setStroke(new BasicStroke(2));
        g.fillOval(bolita.getX()-ajustadorCoord, bolita.getY()-ajustadorCoord, 
                Bolita.getRadio()+ajustadorRadio, Bolita.getRadio()+ajustadorRadio);
    }
    
    private void pintarBolita(Bolita bolita, Graphics2D g){
        g.setColor(bolita.getColor());
        g.setStroke(new BasicStroke(0));
        g.fillOval(bolita.getX() - 15, bolita.getY() - 15, Bolita.getRadio(), Bolita.getRadio());
    }
    
    private void finalizarJugada(Graphics g) {
        Graphics2D dibujador = (Graphics2D) g;
        int cantidadSeleccionadas = this.getPlayJuego().getBolitasSeleccionadas().size();
        if (cantidadSeleccionadas > 1) {
            for (int i = 0; i < cantidadSeleccionadas; i++) {
                Color colorNuevo = this.getPlayJuego().getTablero().generarColor();
                Bolita bolita = this.getPlayJuego().getBolitasSeleccionadas().get(i);
                bolita.setColor(colorNuevo);
                this.getPlayJuego().getTablero().actualizarBolita(bolita);
                borrarBolita(bolita, dibujador);
                pintarBolita(bolita, dibujador);
                
                int puntajeBolita = Colores.getPuntajeXColor(bolita.getColor());
                this.setPuntaje(this.getPuntaje() + puntajeBolita);
            }
            if(cantidadSeleccionadas > 3){
                this.setTiempo(this.getTiempo() + 5);
            }
            jTPuntaje.setText(String.valueOf(this.getPuntaje()));
            this.getPlayJuego().limpiarBolitasSeleccionadas();
        }
    }
    
    Timer tiempoJuego = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if((getTiempo() - 1) != 0){
                setTiempo(getTiempo() - 1);
                jTTiempo.setText(String.valueOf(getTiempo()));
            }else{
                setTiempo(0);
                jTTiempo.setText(String.valueOf(getTiempo()));
                jPTablero.setVisible(false);
                JOptionPane.showMessageDialog(jPTablero, "Tu puntaje fue de: " + 
                        getPuntaje(), "Finalizó el juego", JOptionPane.INFORMATION_MESSAGE);
                tiempoJuego.stop();
            }
        }
    });
    
    private AdministracionJuego getPlayJuego() {
        return playJuego;
    }

    private void setPlayJuego(AdministracionJuego playJuego) {
        this.playJuego = playJuego;
    }
    
    private int getTiempo() {
        return tiempo;
    }

    private void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    private int getPuntaje() {
        return puntaje;
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPlayJuego;
    private javax.swing.JLabel jLPuntaje;
    private javax.swing.JLabel jLTiempo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JPanel jPTablero;
    private javax.swing.JTextField jTPuntaje;
    private javax.swing.JTextField jTTiempo;
    // End of variables declaration//GEN-END:variables

}
