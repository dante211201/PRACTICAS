/*
 DANTE VAZQUEZ SILVA
2S11
 */
import java.util.*;
public class figura_x{
    public static void main(String[] args) {

        int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa  cuantas filas quires amix:");

        int n=teclado.nextInt();
        int y=n-1;
        System.out.println("Ingresa cuantas columnas quieres amix:");

        int m=teclado.nextInt();

        String matriz [][]= new String [n][m];

        for( i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]=" ";  
                }else{
                    matriz[i][j] = "V";
                }    
             }

            }
            for(j=0;j<m;j++){
                matriz[y][j]=" ";    
                y--;
           }

           for(i=0; i<n;i++){
            for(j=0;j<m;j++){
              System.out.print(" ( " + matriz[i][j] + " ) ");
            }
            System.out.println();
         }

        
    }
}





