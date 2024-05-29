"""
Calcular estacion del año
Pedir al usuario que ingrese un mes del año,
el valor debe ser entre 1 y 12,
luego le decimos en que estacion del año esta

Verano: 1,2,3
Otoño: 4,5,6
Invierno: 7,8,9
Primavera: 10,11,12
"""
# Se puede mejorar pero el objetivo del ejercicio esta cumplido

mes = int(input("Ingrese el mes del año (1 - 12): "))
estacion = None
if mes == 1 or mes == 2 or mes == 3:
    estacion = "Verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "Otoño"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "Invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "Primavera"
else:
    print("Usted no eligio un mes valido")

print(f"Usted eligio el mes {mes} que corresponde a la estación {estacion}")

