
import java.util.Scanner;
/*
Hacer un programa que calcule e imprima la suma de tres calificaciones
Pedir las calificaciones al usuario.
*/

public class Ejercicio5Calificaciones {

    public static void main(String[] args) {
        Scanner entrada = new  Scanner(System.in);
        
        System.out.println("Ingrese la primera nota: ");
        double nota1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese la segunda nota: ");
        double nota2 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese la tercera nota: ");
        double nota3 = Integer.parseInt(entrada.nextLine());
        
        double resultado = (nota1+nota2+nota3);
        
        System.out.println("La suma de las notas es = " + resultado );
       
    }
    
}
