"""
Leer los 10 numeros e imprimir
cuantos son positivos,
cuantos negativos y
cuantos neutros
"""
from random import randint
conteo_negativo = 0
conteo_positivo = 0
conteo_neutro = 0

for i in range(10):
    num1 = int(input("Ingrese un rango de numeros a verificar: "))
    if num1 > 0:
        conteo_positivo = conteo_positivo + 1
        #print(i)
    elif num1 < 0:
        conteo_negativo = conteo_negativo + 1
        #print(i)
    else:
        conteo_neutro = conteo_neutro + 1
        #print(i)

print(f"Los numeros neutros son: {conteo_neutro}\nLos numeros positivos son: {conteo_positivo}\nLos numeros negativos son: {conteo_negativo}")