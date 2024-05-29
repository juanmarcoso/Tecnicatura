"""
El objetivo del programa será crear un sistema de calificaciones
de la siguiente manera:

Le pedimos al usuario que ingrese un valor del 0 a 10:
9 a 10 --> A
8 a 9 --> B
7 a 8 --> C
6 a 7 --> D
0 a 6 --> F
De lo contrario el valor ingresado es incorrecto
"""

nota = float(input("Ingrese una nota: "))

if 9 <= nota <= 10:
    print("Usted saco A")
elif 8 <= nota < 9:
    print("Usted saco B")
elif 7 <= nota < 8:
    print("Usted saco C")
elif 6 <= nota < 7:
    print("Usted saco D")
elif 0 <= nota < 6:
    print("Usted saco F")
else:
    print("El valor ingresado es incorrecto")