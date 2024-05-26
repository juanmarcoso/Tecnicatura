# Verificar si un numero es par o impar

num = int(input("Ingrese un numero entero: "))
print(f"El residuo de la division es: {num % 2}")

if num % 2 == 0:
    print("El numero es PAR")
else:
    print("El numero es IMPAR")