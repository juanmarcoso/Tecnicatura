import java.util.Scanner;

public class EjercicioLibro {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("Digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine()); // Lo que estamos haciendo aqui es pasarle un entero y como "nextLine" solo recibe strings lo pasamos a que lea el entero
        System.out.println("Digite el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si  el envio es gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio del libro: " + precioLibro);
        System.out.println("El envio del libro gratuito es: " + envioGratuito);
     
    }
}
