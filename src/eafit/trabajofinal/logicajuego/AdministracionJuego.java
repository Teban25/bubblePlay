package eafit.trabajofinal.logicajuego;

import eafit.trabajofinal.objetos.Bolita;
import eafit.trabajofinal.objetos.Tablero;
import java.util.ArrayList;
import java.util.List;


public class AdministracionJuego {
    //ATRIBUTOS
    private static final int standardSize = 2;
    private int ajustadorY;
    private Tablero tablero;
    private List<Bolita> bolitasSeleccionadas;
    private String jugador;
    

    //METODOS
    
    public AdministracionJuego(){
        this.bolitasSeleccionadas = new ArrayList<>();
    }
    
    public void crearTablero(String nombreJugador,int bolitasX, int bolitasY, int cantidadColores){
        jugador = nombreJugador;
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

    public List<Bolita> getBolitasSeleccionadas() {
        return bolitasSeleccionadas;
    }

    public void setBolitasSeleccionadas(List<Bolita> bolitasSeleccionadas) {
        this.bolitasSeleccionadas = bolitasSeleccionadas;
    }
    
    public void agregarBolitaSeleccionada(Bolita bolita){
        this.bolitasSeleccionadas.add(bolita);
    }
    
    public void limpiarBolitasSeleccionadas(){
        this.bolitasSeleccionadas.clear();
    }
       public String getJugador() {
        return jugador;
    }
    
    public boolean validarMovimiento(int x, int y){
        boolean movimientoValido = true;
        Bolita bolitaSeleccionada = obtenerBolita(x, y);
        if(bolitaSeleccionada != null){
            if(!bolitasSeleccionadas.isEmpty()){
                if(!existeBolitaSeleccionada(bolitaSeleccionada)){
                    Bolita bolitaAntecesora = bolitasSeleccionadas.get(bolitasSeleccionadas.size()-1);
                    if(bolitaSeleccionada.getColor() == bolitaAntecesora.getColor()){
                        if(bolitaSeleccionada.getX() == bolitaAntecesora.getX()
                                || bolitaSeleccionada.getY() == bolitaAntecesora.getY()){
                            int distanciaX = calcularDistanciaBolitas(bolitaSeleccionada.getX(),bolitaAntecesora.getX());
                            int distanciaY = calcularDistanciaBolitas(bolitaSeleccionada.getY(),bolitaAntecesora.getY());
                            if((distanciaX == 0 && distanciaY < 60) || (distanciaY == 0 && distanciaX < 60)){
                                bolitasSeleccionadas.add(bolitaSeleccionada);
                            }else{
                                movimientoValido = false;
                            }
                        }else{
                            movimientoValido = false;
                        }
                    }else{
                        movimientoValido = false;
                    }
                }
            }else{
                bolitasSeleccionadas.add(bolitaSeleccionada);
            }
        }
        return movimientoValido;
    }
    
    private int calcularDistanciaBolitas(int bolita1, int bolita2){
        return Math.abs(bolita1 - bolita2);
    }
    
    public Bolita obtenerBolita(int x, int y){
        return this.tablero.buscarBolita(x, y);
    }
    
    public void actualizarBolita(Bolita bolita){
        this.tablero.actualizarBolita(bolita);
    }
    
    private boolean existeBolitaSeleccionada(Bolita bolitaSeleccionada){
        boolean estaSeleccionada = false;
        for(int i=0; i<bolitasSeleccionadas.size(); i++){
            Bolita bolita = bolitasSeleccionadas.get(i);
            if(bolitaSeleccionada.getX()==bolita.getX()
                    &&bolitaSeleccionada.getY()==bolita.getY()){
                estaSeleccionada = true;
                break;
            }
        }
        return estaSeleccionada;
        
    }
}
