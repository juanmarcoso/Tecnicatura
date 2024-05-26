var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre + " " + apellido; //Primera concatenacion
console.log(nombreCompleto);

var nombreCompleto2 = 'Juan'+ ' ' + 'Orellana'; //Segunda concatenacion
console.log(nombreCompleto2);

//Contexto str o contexto cadena
var juntos = nombre + 227; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);

juntos = nombre + 78 + 17; //Aqui se puede diferenciar a traves de los parentesis
console.log(juntos);

juntos = nombre + (78 + 17);
console.log(juntos);

juntos = 78 + 17 + nombre; //Aqui lo que va a hacer es sumar y despues mostrar el resultado como str
console.log(juntos);

//Tercera concatenacion
nombre += apellido;
console.log(nombre);

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2);

let x, y; //Se pueden crear varias variables dntro de una misma linea
x = 17, y = 21;
let z = x + y;
console.log(z);

let _1num = 31; //No utilizar numeros para inicializar las variables
let $23num = 23;
let rompiendo = "rompe"; //No utilizar palabras reservadas para variables como "break"
console.log(_1num + " " + $23num + " " + rompiendo);