
package Calculadora;

import java.util.Scanner;


public class Servicios {
    private Scanner leer = new Scanner(System.in);
    
    public double Suma(){
        System.out.println("Ingrese el primer número");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int n2 = leer.nextInt();
        return n1 + n2;
    }
    public double Resta(){
        System.out.println("Ingrese el primer número");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int n2 = leer.nextInt();
        return n1 - n2;
    }
    public double Division(){
        System.out.println("Ingrese el primer número");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int n2 = leer.nextInt();
        return (double) n1 / n2;
    }
    public double Multiplicar(){
        System.out.println("Ingrese el primer número");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int n2 = leer.nextInt();
        return n1 * n2;
    }
    public double PotenciaCuadrada(){
        System.out.println("Ingrese un número");
        int n1 = leer.nextInt();
        return n1 * n1;
    }
    public double PotenciaCubica(){
        System.out.println("Ingrese un número");
        int n1 = leer.nextInt();
        return n1 * n1 * n1;
    }
    public double Potenciacion(){
        System.out.println("Ingrese un número");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el número a elevar");
        int n2 = leer.nextInt();
        return (double) Math.pow(n1, n2);
    }
    public double RaizCuadrada(){
        System.out.println("Ingrese un número");
        int n1 = leer.nextInt();
        return (double) Math.sqrt(n1);
    }
    public double RaizCubica(){
        System.out.println("Ingrese un número");
        int n1 = leer.nextInt();
        return (double) Math.cbrt(n1);
    }
}
