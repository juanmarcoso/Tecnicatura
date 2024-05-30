
public class EjercicioMayorEdad {
    public static void main(String args[]) {
            var edad = 17; //Literal tener presente la inferencia de tipos
        var adulto = edad >= 18;
        if (adulto){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
