package ejercicio6dinero;

import java.util.Scanner;

/*
Guillermo tiene N dolares. 
Luis tiene la mitad de lo que posee Guillermo
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres
*/
public class Ejercicio6Dinero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo: $");
        var guille = Double.parseDouble(entrada.nextLine());
        
        double luis = (guille / 2);
        
        double juan = (guille + luis) / 2;
        
        double total = (guille + luis + juan);
        
        System.out.println("El dinero de Guillermo es: $" + guille);
        System.out.println("El dinero de Luis es: $" + luis);
        System.out.println("El dinero de Juan es: $" + juan);
        System.out.println("El dinero que tienen entre los tres es: $" + (total));
        

        
    }
    
}
