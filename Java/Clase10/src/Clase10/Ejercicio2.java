package Clase10;
/*En un almacen se hacen 20 mod de descuento a los clientes cuya compra supere los $100
¿Cual será la cantidad que pagara una persona por su compra?*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cantidad a pagar?: ");
        double compra = Double.parseDouble(entrada.nextLine());
        
        double descuento = compra * 0.2;
        
        if (compra > 100){
            System.out.println("Su compra es de: " + (compra - descuento));
        }
        else{
            System.out.println("Su compra es sin descuento.");
        }
    }
}
