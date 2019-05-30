
package Figura;


public class Figuraj extends Tetraminoe {
    
    public int[][] estado0 ={{0,0,1},{0,0,1},{0,1,1}};
    public int[][] estado1 ={{0,0,0},{1,0,0},{1,1,1}};      
    public int[][] estado2 ={{0,0,0},{1,1,1},{0,0,1}}; 
    public int[][] estado3 ={{1,1,0},{1,0,0},{1,0,0}};    

public Figuraj (orientacion ubicacion,int estado){
    super(ubicacion, estado);
    if(estado<0 || estado >3){
        this.estado  = -1;
    }
    this.estados.add(0,this.estado0);
    this.estados.add(1,this.estado1);
    this.estados.add(2,this.estado2);
    this.estados.add(3,this.estado3);
}    
    public void rotarDerecha() {
        if (this.estado == 3) {
            this.estado = 0;
        } else {
            this.estado++;
        }
    }
    public void rotarIzquierda() {
        if (this.estado == 0) {
            this.estado = 3;
        } else {
            this.estado--;
        }
    }

}
