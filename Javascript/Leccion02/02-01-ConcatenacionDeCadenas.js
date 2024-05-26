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
