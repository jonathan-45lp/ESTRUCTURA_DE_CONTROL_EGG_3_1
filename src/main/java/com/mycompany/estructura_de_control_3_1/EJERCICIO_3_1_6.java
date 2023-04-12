package com.mycompany.estructura_de_control_3_1;
import java.util.Scanner;
public class EJERCICIO_3_1_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE NUMERO 1: ");
        int n1 = leer.nextInt();
        
        System.out.println("INGRESE NUMERO 2: ");
        int n2 = leer.nextInt();
        
        if(n1 > 25 && n2 > 25){
            System.out.println("LOS DOS NUMERO SON MAYOR QUE 25: " + " N1 " +n1 + " N2 " + n2);
        }else if(n1 > 25){
            System.out.println("EL NUMERO N1 ES MAYOR QUE 25: " + n1);
        }else if(n2 > 25){
            System.out.println("EL NUMERO N2 ES MAYOR QUE 25: " + n2);
        }else{
            System.out.println("NINGUNO DE LOS NUMERO SON MAYORES A 25");
        }
        
        
    }
}
