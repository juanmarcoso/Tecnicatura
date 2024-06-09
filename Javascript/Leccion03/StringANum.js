// Convertir cadena a numero (String a Number)
let miNumero = "19x";
console.log(typeof miNumero);

let edad2 = Number(miNumero);
console.log(typeof edad2);

//Funcion isNaN
if(isNaN(edad2)){ //No es un numero = is Not a Number(Devuelve un booleano)
    console.log("Esta variable no contiene solo numeros")
} else { 
    if (edad2 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}

//Con operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Es muy joven para votar";
console.log(resultado3);
