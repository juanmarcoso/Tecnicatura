import java.util.Scanner;

public class EjercicioLibro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona tu titulo aqui: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
