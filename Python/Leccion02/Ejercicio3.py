"""
Intercambiar el valor de dos variables.
Por ejemplo:
a = 10 --> a=5
b = 5 --> b = 10
"""
a = int(input("Ingrese un numero para a: "))
b = int(input("Ingrese un numero para b: "))

cambio = b
b = a
print(f"Los valores son a: {cambio} y b: {b}")
