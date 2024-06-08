"""
Calcular la suma de los primeros 'N' numeros
"""

suma = 0
#num1 = int
num1: int = int(input("Ingrese los numeros a sumar: "))

for i in range(num1):
    suma += suma + i

print(f"La suma de los numeros elegidos para es: {suma}")