"""
Calcular el factorial de un numero mayor o igual a 0.
"""
i = 1
factorial = 1

numero = int(input("Ingrese un numero: "))

while i <= numero:
    factorial *= i
    i = i + 1

print(f"El factorial es: {factorial}")