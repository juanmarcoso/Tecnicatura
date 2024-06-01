
package ejerciciorectangulo;

import java.util.Scanner;

public class EjercicioRectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el lado de un triangulo: ");
        int lado = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el alto: ");
        int alto = Integer.parseInt(entrada.nextLine());
        
        var area = lado * alto;
        System.out.println("El area del rectangulo es = " + area + " cm");
        
        var perimetro = 2 * lado +  2 * alto;
        System.out.println("El perimetro del rectangulo dado es = " + perimetro + " cm");
                
                
    }
}
