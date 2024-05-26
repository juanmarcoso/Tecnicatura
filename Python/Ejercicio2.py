"""
Operador OR
Ejercicio2
La pregunta es si un padre puede asistir al juego de su hijo
Verificamos si tiene vacaciones
Verificamos si tiene el dia libre
Usar estructura 'if else' con el operador or
Imprimir
"""

print("Podra el padre ir al juego de su hijo?")
vacaciones = input("Tiene vacaciones el fin de semana el padre? SI/NO: ")
diaLibre = input("Tiene el dia libre el padre? SI/NO: ")

if vacaciones == "SI" or diaLibre == "SI":
    print("Si podrá asistir!")
else:
    print("No podrá asistir =(")