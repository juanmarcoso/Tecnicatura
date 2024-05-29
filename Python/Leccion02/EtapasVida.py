"""
Ejercicio 6
Haremos un programa que cuando el usuario ingrese su edad diga,
la etapa de su vida en una breve oracion

0 a 10 = "La infancia es increible y bella"
10 a 19 = "Tienes muchos cambios, mucho que estudiar"
20 a 29 = "Amor y comienza el trabajo"
Para las siguientes etapas, deberás completarlo
"""

edad = int(input("Ingresa tu edad: "))

if 0 < edad <= 10:
    print("La infancia es increible y bella")
elif 11 < edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar")
elif 20 < edad <= 29:
    print("Amor y comienza el trabajo")
else:
    print("Para las siguientes etapas, deberás completarlo...")