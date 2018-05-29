package eafit.trabajofinal.objetos;

import java.awt.Color;
import java.util.Random;


public class Tablero {
    //ATRIBUTOS
    private int ancho;
    private int largo;
    private Bolita tableroBolita[][];
    private Colores coloresJuego;
    private int bolitasX, bolitasY;
    
    

    //METODOS
    public Tablero(int ancho, int largo, int bolitasX, int bolitasY, int cantidadColores){
        this.ancho = ancho;
        this.largo = largo;
        tableroBolita = new Bolita[bolitasX][bolitasY];
        coloresJuego = new Colores(cantidadColores);
        this.bolitasX = bolitasX;
        this.bolitasY = bolitasY;
    
    
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Bolita[][] getTableroBolita() {
        return tableroBolita;
    }

    public void setTableroBolita(Bolita[][] tableroBolita) {
        this.tableroBolita = tableroBolita;
    }

    public Colores getColoresJuego() {
        return coloresJuego;
    }

    public void setColoresJuego(Colores coloresJuego) {
        this.coloresJuego = coloresJuego;
    }

    public int getBolitasX() {
        return bolitasX;
    }

    public void setBolitasX(int bolitasX) {
        this.bolitasX = bolitasX;
    }

    public int getBolitasY() {
        return bolitasY;
    }

    public void setBolitasY(int bolitasY) {
        this.bolitasY = bolitasY;
    }
    
    
    
    
    public void llenarTablero(){
        int coordX = 10;
        int coordY = 20;
        int sizeX = tableroBolita.length;
        int sizeY = tableroBolita[0].length;
        Random aleatorio = new Random(System.currentTimeMillis());
        for(int i = 0; i<sizeX; i++){
            for(int j = 0; j<sizeY; j++){
                int numeroColor = aleatorio.nextInt(coloresJuego.getCantidadColores());
                Color colorBolita = coloresJuego.getColor(numeroColor);
                Bolita bolita = new Bolita(colorBolita, coordX, coordY);
                tableroBolita[i][j] = bolita;
                coordY = coordY + 50;
            }
            coordX = coordX + 50;
            coordY = 20;
        }

    }
}
