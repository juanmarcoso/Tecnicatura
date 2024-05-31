/*
Hacer un programa que calcule e imprima el salario de un empleado, //Salario por mes
a partir de sus horas semanales trabajadas  // sueldo = horasTrabajadas*horaSemanal
y de su salario por hora.​ // horaSemanal = (((salarioMes/4))/5)/8
*/
import java.util.Scanner;

public class Ejercicio2Sueldo {

    public static void main(String[] args) {
        
        double sueldo = 800000; //Declaramos el sueldo mensual
        
        double precioHora = ((sueldo/4)/5)/8; // Definimos precio hora
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas en el mes: ");
        int horasTrabajadas = Integer.parseInt(entrada.nextLine()); 
        
        double sueldoMes = horasTrabajadas * precioHora;
        
        System.out.println("El sueldo que le correponde = " + sueldoMes );
        
    }
    
}
