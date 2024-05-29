# Determinar la solucion logica de la siguiente operacion
# ((3+5*8)<3 and ((-6/3*4)+2<2)) or (a>b)

a = int(input("Ingrese el valor de a: "))
b = int(input("Ingrese el valor de b: "))

num1 = (3 + 5 * 8) < 3
num2 = ((-(6/3) * 4) + 2) < 2
num3 = a > b
print(num1 and num2 or num3)