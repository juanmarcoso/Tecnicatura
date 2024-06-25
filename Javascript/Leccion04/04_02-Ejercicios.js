// Evitar repetir tu codigo
// Try don't repeat yourself

    let days = 'Sabado';

    switch (days){
        case 'Lunes':
            console.log("Hoy es " + days)
            break;
        case 'Martes':
            console.log("Hoy es " + days)
            break;
        case 'Miercoles':
            console.log("Hoy es " + days)
            break;
        case 'Jueves':
            console.log("Hoy es " + days)
            break;
        case 'Viernes':
            console.log("Hoy es " + days)
            break;
        case 'Sabado':
            console.log("Hoy es " + days)
            break;
        case 'Domingo':
            console.log("Hoy es " + days)
            break;
        default:
            break;

    }

    //Opcion mejorada 
    let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];
    function getDay(n){
        if(n < 1 || n > 7){
            throw new Error('out of range');
        }
        return days2[n-1];
    }

    console.log(getDay(5))