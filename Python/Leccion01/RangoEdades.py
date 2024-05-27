"""
1. Preguntar la edad al usuario
2. Si la edad esta dentro de los 20 o 30 años, esta dentro del rango
3. Combinamos los operadores and y or para saber si el usuario esta dentro del rango o no
"""
edad = int(input("Cuantos años tiene?: "))
if edad >= 20 and edad <= 30:
    print("Esta dentro del rango")
else:
    print("Esta fuera del rango")

# Segunda opcion con or

# if (20 <= edad < 30) or (30 <= edad < 40):
if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
    print("Estas dentro del rango de los (20\'0) a (30\'0) años")
else:
    print("No estas dentro del rango de los (20\'0) a (30\'0) años")