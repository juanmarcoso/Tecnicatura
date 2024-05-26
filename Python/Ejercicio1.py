#Ejercicio 1
#Pedimos al usuario un valor numerico
#Verificar si el valor ingresado se encuentra entre el rango de 0 a 5
#La formula es <num> >= 0 and <num> <= 5

num = int(input("Ingrese un numero entre 0 y 5: "))

if num >= 0 and num <= 5:
    print("El numero ingresado es correcto!")
else:
    print("Numero ingresado erroneo")