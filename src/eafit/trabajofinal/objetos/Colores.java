
package eafit.trabajofinal.objetos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;


public class Colores {
    //ATRIBUTO
    private int cantidadColores;
    private Color[] colores;
    private final ArrayList<Color> coloresPredeterminados;

    //METODOS
    public Colores(int cantidadColores){
        coloresPredeterminados = new ArrayList<>();
        this.llenarColoresDefault();
        this.cantidadColores = cantidadColores;
        colores = new Color[cantidadColores];
        this.asignarColores();
    }

    public int getCantidadColores() {
        return cantidadColores;
    }

    public void setCantidadColores(int cantidadColores) {
        this.cantidadColores = cantidadColores;
    }
    
    public Color[] getColores() {
        return colores;
    }
    
    public Color getColor(int index) throws IndexOutOfBoundsException{
        return colores[index];
    }

    public void setColores(Color[] colores) {
        this.colores = colores;
    }
    
    private void llenarColoresDefault(){
        coloresPredeterminados.add(Color.BLUE);
        coloresPredeterminados.add(Color.GREEN);
        coloresPredeterminados.add(Color.RED);
        coloresPredeterminados.add(Color.YELLOW);
    }
    
    private void asignarColores(){
        for(int i=0; i<cantidadColores; i++){
           Random asignarcolores = new Random(System.currentTimeMillis());
           int numeroAleatorio = asignarcolores.nextInt(coloresPredeterminados.size());
           colores[i]=coloresPredeterminados.get(numeroAleatorio);
           coloresPredeterminados.remove(numeroAleatorio);
        }
    }
    
    public static final int getPuntajeXColor(String nombreColor){
        int puntaje;
        switch (nombreColor){
                
                case "GREEN":
                    puntaje = 30;
                    break;
                default:
                    puntaje = 0;
        }            
        return puntaje; 
    }
    
}
