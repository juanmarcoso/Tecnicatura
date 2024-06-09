// Convertir cadena a numero (String a Number)
let miNumero = "19";
console.log(typeof miNumero);

let edad2 = Number(miNumero);
console.log(typeof edad2);

if (edad2 >= 18){
    console.log("Puede votar");
}
else{
    console.log("Muy joven para votar");
}

//Con operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Es muy joven para votar";
console.log(resultado3);