package eafit.trabajofinal.logicajuego;

import eafit.trabajofinal.objetos.Bolita;
import eafit.trabajofinal.objetos.Tablero;


public class InicializarJuego {
    //ATRIBUTOS
    private static final int standardSize = 2;
    private int ajustadorY;
    private Tablero tablero;
    

    //METODOS
    
    public void crearTablero(int bolitasX, int bolitasY, int cantidadColores){
        if(bolitasY >= 5){
            ajustadorY = 50;
        } else {
            ajustadorY = 80;
        }
        this.tablero = new Tablero(standardSize*bolitasX*Bolita.getRadio(), 
                     standardSize*bolitasY*Bolita.getRadio()+ajustadorY, bolitasX, bolitasY, cantidadColores);
        this.tablero.llenarTablero();
    }
    

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
    
    
}
