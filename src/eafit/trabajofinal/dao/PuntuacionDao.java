/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eafit.trabajofinal.dao;

import eafit.trabajofinal.modelo.Puntaje;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sergio Llanos
 */
public interface PuntuacionDao {
   public List<Puntaje> getAllPuntajes();
   public void registrarPuntaje(Puntaje puntaje) throws SQLException;
}
