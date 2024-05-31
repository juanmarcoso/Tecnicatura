// Nuestro Primer programa Hola Mundo -- Comentarios de una sola linea
/*
Comentarios extensivos de muchas lineas
Esto es para varias lineas
*/
import java.util.Scanner;

public class HolaMundo {
    public static void main(String args[]){ //Clase main
               /* System.out.println("Hola mundo desde Java"); //con soutv+Tab arma la linea de impresion
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 25;
        System.out.println(miVariable);
        
        // Tipo String
        String miVariableCadena = "Bienvenidos";
        //String tipo objeto
        //String miVariableCadena = new String ("Bienvenidos!"); //Asi no se hace
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
*/
       //Var - inferencia de tipos en Java
       /*var miVariableEntera = 10;
       var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableCadena2 =" + miVariableEntera);
       //Al utilizar el operador suma, hace una concatenacion a la literal de la variable
       // Concatenacion de cadenas
       
       Reglas para dfinir variables: 
       1) El primer caracter del nombre de una variable, podemos utilizar cualquier letra. Por convencion en mi minuscula
       2) No se pueden utilizar numeros como primer caracter de mis variables
       3) No puede tener caracteres especiales
       4) Si puede tener guion bajo "_miVariable"
       5) Se puede usar signo de dolar "$miVariable"
       6) Se puede usar acentos, pero no es recomendable
       7) Caracter ilegal delante de una variable "#miVariable"
       
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 8; 
        var b = 4;
        System.out.println(usuario + " " + (a + b)); // Primero resuelve la suma y luego concatena
        
        //Ejercicio: Caracteres especiales con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t\t.:Menu:."); 
        System.out.println("Retroceso: \b\b" + nombre); //Tabulador especial para centrar
        System.out.println("Comillas simples: \'" + nombre + "\'" );
        System.out.println("Comillas dobles: \"" + nombre + "\"");*/
       /*
       //Clase Scanner: Sirve para analizar lo que quiere el usuario
       //Vamos a crear un objeto de la clase Scanner "entrada"
       Scanner entrada = new Scanner(System.in); //La clase Scanner esta en otro paquete
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine (); //Estamos pidiendole al usuario algo y lo almacenamos
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escribe el titulo: ");
        var titulo2 = entrada.nextLine ();
        System.out.println("Resultado: " + titulo2 + " " + usuario2); 
       */
       /*byte numEnteroByte = 10;
       // Quiero forzar a que lea un numero superior al permitido por byte
       byte numExcesoByte = (byte) 129; // Es de esta manera que lo forzamos a que lo lea = -127
       // me dio -127 porque excedio el maximo de los nuemeros enteros positivos permitidos
        System.out.println("numExcesoByte = " + numExcesoByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);
        
        short numEnteroShort = 10;
        short numEnteroShort2 = (short) 32768;
        System.out.println("numEnteroShort2 = " + numEnteroShort2); //Pasa lo mismo que con los bytes
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        
        int numEnteroInt = 10;
        int numEnteroInt2 = (int)2147483649L;  // Agregamos al final la letra "L" para decirle que es de valor Long
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("numEnteroInt2 = " + numEnteroInt2);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int: "+ Integer.MAX_VALUE);
        
        long numEnteroLong = 10; 
        long numEnteroLong2 = 9223372036854775808L; //Se le agrega la letra L
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("numEnteroLong2 = " + numEnteroLong2);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);*/
       
       /*float numFloat = 10.0F; //Si no le colocamos la "F" al final del numero no lo toma como tipo flotante
       float numFloat2 = (float) 10.0; // Esta es otra opcion
       float numFloat3 = (float) 3.5028235E38; //Le indicamos que supera el maximo de float, le agregamos la D o entre parentesis float
        System.out.println("numFloat3 = " + numFloat3);
        System.out.println("numFloat2 = " + numFloat2);
        System.out.println("El valor minimo de float es: " + Float.MIN_VALUE); //1.4E-45 Exponente 45, 45 posiciones hacia la izquierda
        System.out.println("El valor maximo de float es: " + Float.MAX_VALUE); //3.4028235E38 Exponente 38, 38 posiciones hacia la derecha
       
        double numDouble = 10;
        double numDouble2 = 1.7976931348623157E308; // No deja poner un numero mayor
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double es: " + Double.MIN_VALUE); //4.9E-324
        System.out.println("El valor maximo de double es: " + Double.MAX_VALUE); //1.7976931348623157E308*/
       
       //Infrencia de tipo var y tipos primitivos
       // El punto de ruptura para un debug se hace en una linea valida. 
       // Aqui lo vamos a poner en donde inicializamos la variable
       /*var numeroEntero = 20; // Las literales sin punto automaticamente, son de tipo int
        System.out.println("numeroEntero = " + numeroEntero);
        var numFloat = 10.0F; //Automaticamente con el punto se transforma en un tipo Double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
       
       //Tipos primitivos char
       // Tiene una caracteristica, que solo puede almacenar un solo caracter con comillas simples
       /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //]Indicamos a Java con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        
        char varCaracterDecimal = 36; //Valor decimal de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        
        char varCaracterSimbolo = '$'; // Un caracter especial que podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var cadena = " ";
        System.out.println(cadena);
        // Ahora con var
        var varCaracter1 = '\u0024'; //]Indicamos a Java con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        
        var varCaracterDecimal1 = (char) 36; //Valor decimal de caracteres unicode. Si le agegamos  (char) lo convertimos
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1); // Aqui lo toma como un valor entero
        
        var varCaracterSimbolo1 = '$'; // Un caracter especial que podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        System.out.println(cadena);
        
        int varEnteroChar = '$'; // Nos esta mostrando el valor asociado al simbolo
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        
        // Tipos primitivos tipo booleanos (Se conocen como tipo bandera)
        
        /*boolean varBool = false;
        System.out.println("varBool = " + varBool);
        
        // Sentencias If
        if (varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }*/
        
        //Conversion de tipos primitivos
        /*var edad1 = "20"; // esto es un string
        // Llamamos al metodo parseInt
        var edad = Integer.parseInt("20"); //Aqui lo convertimos en Int
        System.out.println("edad = " + (edad + 1)); //Lo sumamos para ver que sucede
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + (valorPi));
        
        //Pedir un valor
        var entrada = new Scanner(System.in); //El "in" significa que vamos a trabajar con la consola
        
        // Pedir un valor 
        var entrada2 = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt(entrada2.nextLine());
        System.out.println("edad = " + edad);*/
        
        // Conversion de tipos primitivos en Java parte 2
       /* var edadTexto = String.valueOf(10); // Con este metodo lo que hacemos es convertir un INT en un STR
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(8); //Con este metodo lo que hacemos es buscar segun indice la letra tipo "char"
        System.out.println("fraseChar = " + fraseChar); // Solo los tipo String tienen el metodo "charAt"
        
        //Vamos a probar convirtiendo string en char desde la clase Scanner
        var entrada = new Scanner(System.in);
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
       
       // Inicializar variables
       /*int num1 = 5, num2  = 4; // La inferencia de tipos no se puede inicializar varias varialbes
       
       //Inferencia de tipos
       var solucion = num1 + num2; //Operacion aritmetica
        System.out.println("solucion de la suma = " + solucion);
       
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        var solucion2 = 3.4 / num2; //Aqui se usa la inferencia de tipos, que automaticamente nos convierte la variable en tipo double
        System.out.println("Resultado de la division = " + solucion2);
        
        //Tipo modulo o residuo de la division
        solucion = num1 % num2; // Guarda el residuo entero de la division
        System.out.println("solucion del modulo = " + solucion);
        
        // Uso de if sin llaves, no se usan en este ejemplo porque solo se imprime una sola linea de codigo
        if (num2 % 2 == 0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");*/
        
       // Operadores de asignacion (practicas)
       
       int varNum1 = 1, varNum2 = 4;
       int varNum3 = varNum1 + 6 - varNum2; // Aqui le agregamos una operacion a la variable / tambien se puede utilizar la inferencia de tipos "var" en vez de "int"
        System.out.println("varNum3 = " + varNum3);
       
        varNum1 += 1; // varNum1 = varnum1 + 1
        System.out.println("varNum1 = " + varNum1);
        
        var solucion4 = (varNum3 -= varNum2);
        System.out.println("solucion4 = " + solucion4);
        
        var solucion5 = (varNum1 /= 2);
        System.out.println("solucion5 = " + solucion5);
        
        var solucion6 = (varNum1 *= 2);
        System.out.println("solucion6 = " + solucion6);
        
        var solucion7 = (varNum1 /= 2);
        System.out.println("solucion7 = " + solucion7);
        
        var solucion8 = (varNum1 %= 2);
        System.out.println("solucion8 = " + solucion8);
        
       //Constantes
       //int final VALOR_INICIAL = 5;
       //double final IVA_TIPO_1 = 0.16;
    }
}
