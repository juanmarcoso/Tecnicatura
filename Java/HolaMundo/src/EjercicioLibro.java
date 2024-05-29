import java.util.Scanner;

public class EjercicioLibro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el nombre del autor: ");
        String autor = scanner.nextLine();
        System.out.println("Proporciona el numero de ID: ");
        String id = scanner.nextLine();
        System.out.println("Proporciona el precio del libro: ");
        String precio = scanner.nextLine();
        /*System.out.println("El envio es gratis (True/False)?: ");
        boolean envio = scanner.nextBoolean();*/
        
        System.out.println(titulo + " fue escrito por " + autor + ". El numero de ID es: " + id + ". El precio es de: " + precio + "." );
    }
}
