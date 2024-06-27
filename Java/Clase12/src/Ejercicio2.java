/*
Ejercicio 2: Hacer un programa que calcule el cuadro de una suma,
el usuario debe ingresar el valor de a y el valor de b.
Formula: (a+b)2=a2+b2+2*a*b
Para esto deberán utilizar la clase Math y un método llamado pow
 */
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a: ");
        double a = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese el valor de b: ");
        double b = Double.parseDouble(entrada.nextLine());
        
        /*operacion == (a+b)2=a2+b2+2*a*b*/
        
        double operacion1 = Math.pow((a+b), 2);
        System.out.println("operacion1 = " + operacion1);
        
        double operacion2 = (Math.pow(a, 2)) + (Math.pow(b, 2)) + (2*a*b);
        System.out.println("operacion2 = " + operacion2);
        
        System.out.println("Comprobamos la igualdad: " + (operacion1 == operacion2));
    }
    
}
