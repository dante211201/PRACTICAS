/*
DANTE VAZQUEZ SILVA
2S11
 */
package cuadro;
import java.util.Scanner;

public class cuadro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
         boolean numer = false;
             int d,m;
do{

    System.out.println("Ingresa cuantas columnas quieres amix: ");
    d=entrada.nextInt();
    System.out.println("Ingresa  cuantas filas quires amix: ");
    m=entrada.nextInt();
 
    if (d%2 !=0 && m%2 !=0){
        numer=true;
       }else{
       System.out.println("AYUDAME A AYUDARTE INGRESA NUMEROS IMPARES!!!!");
    }    
} while(!numer);
        int i;
char matriz[][] = new char [d][m];
for (i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if ((i==0) || (i== matriz.length-1)||(j==0)||(j==matriz.length-1)){
                matriz[i][j] = 'S';
            }
                else{
                        matriz[i][j] = ' ';
                        }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }          
    }  
}

