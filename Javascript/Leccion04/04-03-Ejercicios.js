/*
Hacer un ejercicio similar al que esta hecho, 
pero ahora con los meses del año,
hacerlo con estructura switch
y luego con la funcion de opcion mejorada
*/

let mes = 3;

switch (mes){
    case 1:
        mes = "Enero";
        break;
    case 2:
        mes = "Febrero";
        break;
    case 3:
        mes = "Marzo";
        break;
    case 4:
        mes = "Abril";
        break;
    case 5:
        mes = "Mayo";
        break;
    case 6:
        mes = "Junio";
        break;
    case 7:
        mes = "Julio";
        break;
    case 8:
        mes = "Agosto";
        break;
    case 9:
        mes = "Septiembre";
        break;
    case 10:
        mes = "Octubre";
        break;
    case 11:
        mes = "Noviembre";
        break;
    case 12:
        mes = "Diciembre";
        break;
    default:
        mes = "Error";
}

console.log(mes)

// Con funcion
let mes2 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre","Diciembre"]

function myMonth(x){
    if(x < 1 || x > 12){
        throw new Error('Fuera de rango');
    }
    return mes2[x - 1];
}

console.log(myMonth(12))