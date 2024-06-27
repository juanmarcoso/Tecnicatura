/*Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante. 
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.

participacion = 10%
primer examen parcial = 25%
segundo examen parcial = 25%
examen final = 40%
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la nota por participacion: ");
        double participacion = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la nota por el primer examen: ");
        double examen1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la nota por el segundo examen: ");       
        double examen2 = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese la nota del examen final: ");
        double examenF = Double.parseDouble(entrada.nextLine());
        
        var notaFinal = ((participacion * 0.1) + (examen1 * 0.25) + (examen2 * 0.25) + (examenF * 0.4));
        System.out.println("La nota final por el semestre es de: " + notaFinal);
        
        
    }
    
}
