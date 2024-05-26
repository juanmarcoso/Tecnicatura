"""
Ejercicio 1: Califica tu día
¿Cómo estuvo tu día (1 al 10)?
Mi día estuvo de: 10
"""

dia = int(input("Como estuvo tu dia del 1 al 10: "))

if dia >= 1 and dia <= 5:
    print("Tu dia estuvo malo")
elif dia >= 6 and dia <= 9:
    print("Tu dia estuvo maso")
else:
    print("Tu dia estuvo genial!")