"""
Diseñar un programa que ingresando un año, nos devuelva
por consola si es un año bisiesto o no, repetir la accion hasta
que le usuario decida
"""
opcion = 0
print("")
print("Comprobamos que año es bisiesto")
print("")
# num = int(input("Ingrese el año: "))

while opcion != 1:
    opcion = int(input("Quiere seguir o no? Si es no ingrese 1 sino pulse una tecla: "))
    if opcion != 1:
        num = int(input("Ingrese el año: "))
        if (num % 4 == 0) and (num % 100 != 0) or (num % 400 == 0):
            print("El año es bisiesto")
        else:
            print("El año no es bisiesto")
    else:
        print("Muchas gracias")
