package com.mycompany.estructura_de_control_3_1;
import java.util.Scanner;

public class EJERCICIO_3_1_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("INGRESE NOTA: ");
        int nota = leer.nextInt();
        
        
        while( nota < 0 || nota > 10){
            System.out.print("INGRESE NUEVA MENTE LA NOTA: ");
            nota = leer.nextInt();
        }
        
    }
}
