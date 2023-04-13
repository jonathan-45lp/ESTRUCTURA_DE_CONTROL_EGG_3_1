package com.mycompany.estructura_de_control_3_1;
import java.util.Scanner;
public class EJERCICIO_3_1_9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        int cont = 0;
        int suma = 0;
        do{
            System.out.print("INGRES UN NUMERO: ");
            int num = leer.nextInt();
            cont = cont + 1;
            if(num > 0){
                suma = suma + num;
            }else if( num == 0 ){
                System.out.print("SE CAPTURO EL NUMERO CERO: " + num);
                break;
            }
                
        }while( cont != 20);
        
        System.out.println("LA SUMA ES: " + suma);
        
    }
}
