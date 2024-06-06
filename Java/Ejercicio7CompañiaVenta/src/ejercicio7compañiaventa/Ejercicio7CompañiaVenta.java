/*
 Una compañia de venta de carros usados, 
paga a su personal de ventas un salario de $1000 mensuales 
+ $150 por cada carro vendido
+ 5% del valor de la venta por carro
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.

El salario de 1000 lo vamos  a manejar como un dato constante, para asignarlo debemos usar la palabra reservada "final"

 */
package ejercicio7compañiaventa;

import java.util.Scanner;

public class Ejercicio7CompañiaVenta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double salario = 1000;
        System.out.println("*** Salario empleado ***");
        System.out.println("");
        
        System.out.println("Ingrese la cantidad de autos vendidos: ");
        var cantidad =Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese la cantidad de dinero por las ventas realizadas: ");
        var ventas = Double.parseDouble(entrada.nextLine());
        
        var dineroTotal = salario + (150 * cantidad) + (ventas * 0.05);
        System.out.println("El salario que le corresponde al empleado es de: $" + dineroTotal );
        
        
        
        
    }
    
}
