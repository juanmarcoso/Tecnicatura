    //Ejercicio para encontrar los numeros pares e impares
    let parImpar = 8;
    if(parImpar % 2 == 0){
        console.log("Es un numero PAR");
    }
    else{
        console.log("Es un numero IMPAR");
    }

    // Ejercicio es mayor de edad o menor?
    let edad = 23, adulto = 18;
    if(edad >= adulto){
        console.log("Usted es una persona adulta");
    }
    else{
        console.log("Usted es menor de edad.");
    }

    //Ejercicio dentro de un rango
    let dentroRango = 10; //Aqui vamos a ir cambiando el valor
    let valMin = 0, valMax = 10;
    if (dentroRango >= valMin && dentroRango <= valMax){
        console.log("Esta dentro del rango establecido")
    }
    else {
        console.log("Esta fuera del rango establecido")
    }

    //Ejercicio Padre puede ir a juego
    let vacaciones = false, tiempoLibre = false;
    if (vacaciones || tiempoLibre){
        console.log("Puede ir al juego del hijo")
    }
    else {
        console.log("No puede ir al juego")
    }

    //Operador ternario
    let resultado2 = 3 < 2 ? "Verdadero" : "Falso";
    console.log(resultado2)

    let numero = 8;
    resultado = numero % 2 == 0 ? "Par" : "Impar";
    console.log(resultado)

    // Convertir string a numero 
    let miNumero = "19"; //Es una cadena
    console.log(typeof miNumero)
    
    let edad2 = Number(miNumero); //Esta es una funcion de conversion
    console.log(typeof edad2);
    
    //Funcion isNaN (para verificar si una variable es de tipo numerica) Devuelve un tipo booleano
    if (isNaN(edad2)){
        console.log("esta variable no contiene solo numeros");
    }
    else {
            if (edad2 >= 18){
        console.log("Puede votar");
        }
        else {
            console.log("Es menor, no puede votar");
        }
    }

    //Operador ternario
    let resultado4 = edad2 >= 18 ? "Puede votar" : "Es muy joven para votar";
    console.log(resultado4)

    
