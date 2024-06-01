
package mayordedosnumeros;

import java.util.Scanner;

public class MayorDeDosnumeros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero a comparar: ");
        var num1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Ingrese el segundo numero a comparar: ");
        var num2 = Integer.parseInt(entrada.nextLine());
        
        var solucion = (num1 > num2) ? "Es mayor" : "Es menor";
        System.out.println( "Num1 es mayor? : " + solucion);
                
        
        
    }
    
}
