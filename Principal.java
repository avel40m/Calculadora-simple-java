
package Calculadora;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicios servicios = new Servicios();
        boolean band = true;
        
        System.out.println("Calculadora");
        
        while (band) {            
            System.out.println("1-Sumar\n2-Restar\n3-División\n4-Multiplicación\n"
                    + "5-Potencia al cuadrado\n6-Potencia al cubo\n7-Potencia mayor a 3"
                    + "\n8-Raiz cuadrada\n9-Raiz cubica");
            String resp = leer.next();
            switch(resp){
                case "1":
                    System.out.println("La suma es igual a" + servicios.Suma());
                break;
                case"2":
                    System.out.println("La resta es igual a" + servicios.Resta());
                break;
                case "3":
                    System.out.println("La division es igual a" + servicios.Division());
                break;
                case "4":
                    System.out.println("La multiplicación es igual a" + servicios.Multiplicar());
                break;
                case "5":
                    System.out.println("La potencia cuadra es igual a:"+ servicios.PotenciaCuadrada());
                 break;
                case "6":
                    System.out.println("La potencia cubica es igual a:"+servicios.PotenciaCubica());
                 break;
                case "7":
                    System.out.println("La potencia es igual a:"+servicios.Potenciacion());
                 break;
                case "8":
                    System.out.println("La raiz cudrada es igual a: "+servicios.RaizCuadrada());
                break;
                case "9":
                    System.out.println("La raiz cubica es igual a:"+servicios.RaizCubica());
                break; 
                case "10":
                    System.out.println("Salio del programa");
                    band=false;
                break;
                default:
                    System.out.println("Opción incorrecta, ingrese nuevamente una opción");
                break;
            }
        }
    }
    
}
