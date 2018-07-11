/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eafit.trabajofinal.dao;

import eafit.trabajofinal.modelo.ConexionDB;
import eafit.trabajofinal.modelo.Puntaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Llanos
 */
public class PuntuacionDaoImpl implements PuntuacionDao{
 
    List<Puntaje> Puntajes;

    @Override
    public List<Puntaje> getAllPuntajes() {
        Puntajes = new ArrayList<Puntaje>();
        ConexionDB conex= new ConexionDB();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM puntuacion");
            ResultSet res = consulta.executeQuery();
while(res.next()){
    Puntaje puntaje = new Puntaje("",0);
    puntaje.setName(res.getString("nombre"));
    puntaje.setPuntuacion(Integer.parseInt(res.getString("puntuacion")));
    Puntajes.add(puntaje);
}
           res.close();
          consulta.close();
          conex.desconectar();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudieron consultar los puntajes\n"+e);
  }
        return Puntajes;
    }

    
    public void registrarPuntaje(Puntaje puntaje) throws SQLException {
ConexionDB conex= new ConexionDB();
 try{
      Statement statement = conex.getConnection().createStatement();
   statement.executeUpdate("INSERT INTO puntuacion VALUES ('"+puntaje.getName()+"', '"
     +puntaje.getPuntuacion()+"')");
   JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
   statement.close();
   conex.desconectar();
 }catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro el puntaje");
  }
    }



}

