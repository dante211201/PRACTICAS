/*
DANTE VAZQUEZ SILVA
2S11
 */
package matriz;

import java.util.Scanner;

public class Cruz {
    
     @SuppressWarnings("empty-statement")
       public static void main(String[] args){
           
           Scanner teclado= new Scanner(System.in);
           boolean numeroCorrecto= false;
           int n,m = 0;
           
           do{
               
              System.out.print("Ingresa la cantidad de filas amix (que sea numero impar)...");
              n=teclado.nextInt();
              
              System.out.print("Ingresa la cantidad de columnas que quieres amix (que sea numero impar)...");
              m=teclado.nextInt();
              
              if(n%2 !=0 && m%2 !=0){
                    numeroCorrecto=true;
              }else{
                   System.out.println("Ah ocurrido un error con los datos amix :C... De seguro ingresaste numeros pares intentalo de nuevo c:");
              }
               System.out.println();
               
           }while(!numeroCorrecto);
           
         char matriz[][] = new char [n][m];
         
         int mitadFilas=matriz.length/2;
         int mitadColumnas=matriz[0].length/2;
         
         for (int i=0; i<matriz.length;i++){
         for (int j=0; j<matriz[0].length;j++){
             
             if(i== mitadFilas || j==mitadColumnas){
                 matriz[i][j]= '#';
             }else{
                 matriz[i][j]=' ';
                 
             }
              System.out.print(matriz[i][j]+" ");
             }
        System.out.println();
              
              }
           }
       }
       

