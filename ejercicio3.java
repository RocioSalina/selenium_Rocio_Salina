package Practico3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero= input.nextInt();
        System.out.println("El doble del número ingresado es: "+ obtenerDoble(numero));
    }
    public static int obtenerDoble(int numero){
        return numero*2;
    }
}
