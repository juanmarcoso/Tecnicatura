# Transformar un entero a string

numTexto = ''

num = int(input("Digite un numero en el rango del 1 al 3: "))

if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else:
    numTexto = "Has ingresado un numero fuera del rango"

print(f'El numero ingresado es: {num} - {numTexto}')