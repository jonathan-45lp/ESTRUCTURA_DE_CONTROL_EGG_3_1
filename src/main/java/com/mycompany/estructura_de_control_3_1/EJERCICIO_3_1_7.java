package com.mycompany.estructura_de_control_3_1;
import java.util.Scanner;
public class EJERCICIO_3_1_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("INGRESE UNA OPCION DESDE 1 AL 4 LA OPCION ES : ");
        int op = leer.nextInt();
        
        switch (op){
            case 1:{ 
                    System.out.println("LA BOMBA ES UNA BOMBA DE AGUA");
                    break;}
            case 2:{ 
                    System.out.println("LA BOMBA ES UNA BOMBA DE GASOLINA");
                    break;}
            case 3:{ 
                    System.out.println("LA BOMBA ES UNA BOMBA DE HORMIGON");
                    break;}
            case 4:{ 
                    System.out.println("LA BOMBA ES UNA BOMBA DE PASTA ALIMENTICIA");
                    break;}
            default:{ 
                    System.out.println("NO EXISTE UN VALOR VALIDO PARA TIPO DE BOMBA");
            }
            
        
        }
    }
}
