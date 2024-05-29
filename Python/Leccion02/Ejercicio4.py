"""
Ejercicio 4: Área y longitud de un circulo
Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia
Área = Pi * r**2
Longitud = 2 * Pi * r
En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
Se escribe:   import math
"""
from math import pi

radio = int(input("Ingrese el valor del radio: "))

longitud = 2 * pi * radio
area = pi * (radio**2)

print(f"El valor de la longitud es: {longitud}")
print(f"El valor del area es: {area}")
