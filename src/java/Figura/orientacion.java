
package Figura;
/**
 *
 * @author alejo
 */
public class orientacion {
    
    public int FilaInicial;
    public int FilaFinal;
    public int ColumnaInicial;
    public int ColumnaFinal;
    
    public orientacion(int FilaInicial, int FilaFinal, int columnaInicial, int ColumnaFinal){
        this.FilaInicial = FilaInicial;
        this.FilaFinal = FilaFinal;
        this.ColumnaInicial = ColumnaInicial;
        this.ColumnaFinal = ColumnaFinal;
    }
    @Override
    public String toString(){
        return FilaInicial+","+FilaFinal+","+ColumnaInicial+","+ColumnaFinal;
    }
}
