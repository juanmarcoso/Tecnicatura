a = 5
"""
Calcular el area de un perimetro.
El alto y el ancho dado por el usuario
"""

alto = int(input("Ingrese el alto del rectangulo: "))
ancho = int(input("Ingrese el ancho del rectangulo: "))

area = alto * ancho
perimetro = (alto + ancho) * 2
print(f"El area del rectangulo es: {area}")
print(f"El perimetro es {perimetro}")