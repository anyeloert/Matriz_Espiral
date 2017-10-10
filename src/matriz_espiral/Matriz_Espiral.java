package matriz_espiral;

import javax.swing.JOptionPane;

public class Matriz_Espiral {

    public static void main(String[] args) {
        
        int i=1,j=1,fila,columna;
        int aux=Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño de matríz:", "Determine la cantidad de filas y columnas",JOptionPane.QUESTION_MESSAGE));
        fila = aux;
        columna=aux;
        while (!((i>(aux/2)+1)&&(j>(aux/2)+1))){
            filaIzquierdaDerecha(i, j, columna);
            i++;
            columnaArribaAbajo(columna, i, fila);
            columna--;
            filaDerechaIzquierda(fila, columna, j);
            fila--;
            columnaAbajoArriba(j, fila, i);
            j++;
        }
    }
    /*
    i=fila fija
    j=donde inicia el ciclo
    column= donde culmina el ciclo
    
    */
    static void filaIzquierdaDerecha(int i,int j,int column){
        for (int k = j; k <= column; k++) 
            System.out.print("("+i+","+k+")");        
        System.out.println("");
    }
    /*
    column=columna fija
    i=donde inicia el ciclo
    fila=donde culmina el ciclo
    
    */
    static void columnaArribaAbajo(int column,int i,int fila){
        for (int k = i; k <= fila; k++) 
            System.out.print("("+k+","+column+")");        
        System.out.println("");
    }
    /*
    fila=fila fija
    column=donde inicia ciclo
    j=donde culmina ciclo
    */
    
    static void filaDerechaIzquierda(int fila,int column,int j){
        for (int k = column; k >= j; k--) 
            System.out.print("("+fila+","+k+")");        
        System.out.println("");
    }
    /*
    j=columna fija
    fila=donde inicia ciclo
    i=donde finaliza ciclo
    */    
    static private void columnaAbajoArriba(int j,int fila,int i){
        for (int k = fila; k >= i; k--) 
            System.out.print("("+k+","+j+")");        
        System.out.println("");
    }
}
