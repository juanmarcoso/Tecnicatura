"""
Suponga que se tiene un conjunto de calificaciones de un
grupo de 10 alumnos. Realizar un algoritmo para calcular la calificación
promedio y la calificación mas baja de todo el grupo.
"""

print("Ingrese diez calificaciones")
calificacion = 0
suma = 0
calificaciones = []

for i in range(10):
    calificacion = int(input("Ingrese la calificacion: "))
    calificaciones.append(calificacion)
    suma += calificacion

print(f"El promedio de las calificaciones es {suma/10}.")
print(f"La nota mas baja es {min(calificaciones)}")

