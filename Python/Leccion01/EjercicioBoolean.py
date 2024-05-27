"""
1. Pedimos al usuario un valor numerico
2. Verificar si el valor ingresado se encuentra dentro del rango 0 a 5
3. La formula es: <num> >= 0 and <num> <= 5
"""
num = int(input("Ingrese un numero: "))

if num >= 0 and num <= 5:
    print(True)
else:
    print(False)

#Opcion 2
valor = int(input("Digite un numero dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} esta fuera del rango")