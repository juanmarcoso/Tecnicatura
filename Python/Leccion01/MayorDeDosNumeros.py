"""
Solicitar al usuario dos valores, determinar cual es el mayor
1. Solicitar al usuario dos valores:
    numero1 (int)
    numero2 (int)
2. Se debe imprimir el mayor de dos numeros
    (La salida debe ser identica a la siguiente):
    Digite el valor para el numero 1:
    Digite el valor para el numero 2:
    El numero mayor es: <NumeroMayor>
"""
num1 = int(input("Digite el valor para el numero 1: "))
num2 = int(input("Digite el valor para el numero 2: "))

numeroMayor = num1 < num2
numeroMayor1 = num2 < num1

if numeroMayor == True:
    print(f"El numero mayor es: {num2}")
elif numeroMayor1 == True:
    print(f"El numero mayor es: {num1}")
else:
    print("Los numeros son iguales")

# Segunda opcion
if num1 > num2:
    print(f"El numero mayor es: {num1}")
else:
    print(f"El numero mayor es: {num2}")
    