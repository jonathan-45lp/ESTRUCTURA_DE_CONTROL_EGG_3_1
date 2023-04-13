package com.mycompany.estructura_de_control_3_1;
import java.util.Scanner;
public class EJERCICIO_3_1_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
       
        
        for(int i = 1; i <= 4; i++){
            System.out.print("INGRESE EL VALOR EN LA POSICION " +i+ " : ");
            int num = leer.nextInt();
            
            System.out.print(num + ": ");
            
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
