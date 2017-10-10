package matriz_espiral;

public class Matriz_Espiral {

    public static void main(String[] args) {
        
         int filas;
         int columnas;
         
        
    }
    
    private void filaIzquierdaDerecha(int fila,int column){
        for (int i = 0; i < column-1; i++) {
            System.out.println("("+fila+","+i+")");
        }
    
    }
    private void columnaArribaAbajo(int fila,int column){
        for (int i = 0; i < fila-1; i++) {
            System.out.println("("+column+","+i+")");
        }
    }
    private void filaDerechaIzquierda(int fila,int column){
        for (int i = 0; i < column-1; i--) {
            System.out.println("("+fila+","+i+")");
        }
    }
    private void columnaAbajoArriba(int fila,int column){
        for (int i = 0; i < fila-1; i--) {
            System.out.println("("+column+","+i+")");
        }
    }
}
