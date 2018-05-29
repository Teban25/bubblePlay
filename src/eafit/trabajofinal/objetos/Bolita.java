package eafit.trabajofinal.objetos;

import java.awt.Color;


public class Bolita {
    //ATRIBUTOS
    private Color color;
    private static final int radio = 30;
    private int x;
    private int y;
        
    //METODOS
    public Bolita(Color color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public static int getRadio(){
        return Bolita.radio;
    }
    
}
