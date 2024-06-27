package clase12;
/*
Ejercicio 1: Construir un programa que, dado un número total de
horas, devuelve el número de semanas, días y horas equivalentes.
por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,
6 días y 16 horas.

horas = 1
dias = 24 
semana = (24*7)
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas: ");
        int horas = Integer.parseInt(entrada.nextLine());
        
        int semanas = horas / 168;
        int residuoSemana = horas % 168;
        
        int dias = residuoSemana  / 24;
        residuoSemana = residuoSemana % 24;
        
        int horas2 = residuoSemana;
        
        System.out.println("Para las horas ingresadas son " + semanas + " semanas. " + dias + " dias. " + horas2 + " horas.");
        

    }
    
}
