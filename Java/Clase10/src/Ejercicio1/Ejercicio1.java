package Ejercicio1;

import java.util.Scanner;

/*Determinar si un alumno aprueba o reprueba un curso.
Sabiendo que si aprobará si su promedio de tres notas es mayor a 70
caso contrario, reprueba*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primera nota: ");
        int nota1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese la tercera nota: ");
        int nota3 = Integer.parseInt(entrada.nextLine());
        
        var promedio = (nota1 + nota2 + nota3) / 3;
        
        if(promedio>= 70){
            System.out.println("Usted aprobo el curso con un promedio de: " + promedio);
        }
        else{
            System.out.println("Usted reprobo, intentelo en la proxima. Su promedio es: " + promedio);
        }
    }
    
}
