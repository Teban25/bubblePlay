/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eafit.trabajofinal.modelo;

/**
 *
 * @author Sergio Llanos
 */
public class Puntaje {
  private String name;
   private int puntuacion;
   
     public Puntaje(String name, int puntuacion) {
        this.name = name;
        this.puntuacion = puntuacion;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
  
}
