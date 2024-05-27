"""
La pregunta es si un padre puede asistir al juego de su hijo
1. Verificamos si tiene vacaciones
2. Verificamos si tiene dia libre
3. Usar estructura 'if-else' con el operador or
4. Imprimir
"""
diaLibre = input("Indique si tiene el dia libre para el Viernes (SI/NO): ")
vacaciones = input("Indique si tiene vacaciones (SI/NO): ")

if vacaciones == "SI" or diaLibre == "SI":
    print("Va a poder asistir al juego de su hijo")
else:
    print("En la proxima será")

# Ejercicio con el operador or, Operador not
vacaciones1 = False
diaDescanso = True

if not (vacaciones1 or diaDescanso): # El operando not cambia el resultado Verdadero a Falso
    print("Puede asistir")
else:
    print("Tiene trabajo que hacer")