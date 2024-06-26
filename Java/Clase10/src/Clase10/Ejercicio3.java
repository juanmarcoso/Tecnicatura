package Clase10;
/*
Leer dos numeros; 
si son iguales que los multiplique, 
si el primero es mayor que el segundo que los reste y 
si no que los sume*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double num1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingresar el segundo numero: ");
        double num2 = Double.parseDouble(entrada.nextLine());
        
        if (num1 == num2) {
            System.out.println("Los numeros son iguales. Se multiplican: " + (num1 * num2));
        }
        else if (num1 > num2) {
                System.out.println("El primero es mayor. Se resta: " + (num1 - num2));
                }
        else {
            System.out.println("El segundo es mayor que el primero. Se suman: " + (num2 + num1));
        }
        
        
    }
}
