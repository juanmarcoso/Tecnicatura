// Comentarios de una sola linea
/* 
La sintaxis en los comentarios
es igual a Java
*/
//Tipo Str
var nombre = "Juan"; 
console.log(typeof nombre);
console.log(nombre);
nombre = 7; //Al ser las variables, dinamicas, se pueden reasignar
console.log(typeof nombre);
console.log(nombre);


//Tipo numerico
var num = 10;
console.log(num);
console.log(typeof num);
var num = 12.2;
console.log(num);
console.log(typeof num);

//Tipo object
var object = {
    nombre: "Juan",
    apellido: "Orellana",
    dni: 123456789,
    telefono: 555-555-555
};
console.log(typeof object);
console.log(object);

//Tipos de datos booleanos
var bandera = true;
console.log(bandera);
console.log(typeof bandera);

//Tipo de datos funcion (dentro de ellas se ejecutan lineas de codigos)
// Nos permiten reutilizar lineas de codigo
function miFuncion(){}
console.log(miFuncion);
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);
console.log("Es de tipo: " + typeof simbolo);

//Tipo de dato Clase
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);
console.log("Esta clase es de tipo: " + typeof Persona);

//Tipo de datos undefined
var x;
console.log(x);
console.log(typeof x + " Es un tipo de dato igual 'x'");

x = undefined;
console.log("Se puede declarar igual como: "+x);

//Null: Ausencia de valor
var y = null;
console.log(y); //Null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de datos array y Empty string
var autos = ['Citroen', 'Audi', 'BMW', 'Ford'];
console.log(autos);
console.log(typeof autos); //Un arreglo es un tipo de datos object

var z = '';
console.log(z); //Esto se refiere a una cadena vacia
console.log(typeof z);