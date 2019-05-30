
package Figura;

import java.util.ArrayList;

public class Tetraminoe {
    
    protected ArrayList<int [] []> estados = new ArrayList<int [][]>();
    protected int estado;
    protected orientacion ubicacion;
    
    public Tetraminoe(orientacion ubicacion, int estado){
        this.estado = estado;
        this.ubicacion = ubicacion;
    }
    public int EstadoOptenido(){
        return this.estado;
    }
    public String Forma(){
        int figura[][]= estados.get(estado);
        String forma ="{";
        for (int i = 0; i < figura.length; i++) {
            forma += "{";
            for (int j = 0; j < figura.length; j++) {
                forma += figura[i][j];
                if(j!=(figura.length -1)){
                    forma+=",";
                }
            }
            forma+="}";
        }
        forma+="}";
        return forma;
    }
    
    public void Izquierda(){
        this.ubicacion.ColumnaInicial--;
        this.ubicacion.ColumnaFinal--;
    }
    public void Derecha(){
        this.ubicacion.ColumnaInicial--;
        this.ubicacion.ColumnaFinal--;
    }
    public orientacion tenerUbicacion(){
        return this.ubicacion;
    }
    public void Caer (int filaInicial, int filaFinal){
        this.ubicacion.FilaInicial = filaInicial;
        this.ubicacion.FilaFinal = filaFinal;
    }
}
