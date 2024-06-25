"""
Ingresar "N" enteros,
visualizar la suma de los numeros pares de la lista,
cuantos numeros pares existen,
cual es el promedio de los numeros impares?
"""

n_elementos = int(input("Ingrese la cantidad de elementos a ingresar: "))

i = 1
suma_pares = 0
suma_impares = 0
conteo_pares = 0
conteo_impares = 0


while i <= n_elementos:
    num = int(input("Digite un numero: "))
    if num % 2 == 0:
        # El numero es par. Suma interactiva de pares"
        suma_pares = suma_pares + num
        # Conteo de pares
        conteo_pares = conteo_pares + 1
    else:
        # El numero es impar. Suma interactiva de impares
        suma_impares = suma_impares + num
        # Conteo de impares
        conteo_impares = conteo_impares + 1

    i = i + 1

if conteo_pares == 0:
    print("No se han digitado numeros pares")
else:
    print(f"La suma de los pares es: {suma_pares}. Y la cantidad de numeros pares ingresados es: {conteo_pares}")

promedio_impares = suma_impares / conteo_impares
if conteo_impares == 0:
    print("No se han digitado numeros impares")
else:
    print(f"El promedio de los numeros impares es: {promedio_impares}")

