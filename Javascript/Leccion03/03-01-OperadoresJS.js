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