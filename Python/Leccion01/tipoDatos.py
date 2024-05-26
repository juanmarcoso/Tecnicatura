# Tipo de datos (los tipos de datos son clases tambien)

# Tipo Str
a: str = "Hola"
print(a)
print(type(a))

# Tipo Int
x = 10
print(x)
print(type(x))

# Tipo flotante
b = 10.75
print(b)
# Imprimimos con una funcion
print(type(b))

# Tipo booleano
f = True
g = False
print(f)
print(type(g))

# Manejo de cadenas (str)

miGrupoFavorito = "Five Finger Dead Punch" + " and " + "Metallica"
caracteristica = "Las mejores bandas de rock"
print("Mis grupos favorito son:", miGrupoFavorito, ".", caracteristica)
print("Mis grupos favorito son: " + miGrupoFavorito + ". " + caracteristica)
print(f"Mis grupos favorito son: {miGrupoFavorito}. {caracteristica}")

num1 = "1"
num2 = "2"
print(num1 + num2)  # Concatenamos
print(int(num1) + int(num2))  # Convertimos a integer

# Tipos booleanos
miBooleano = True
miBooleano2 = 1 > 2
print(miBooleano)
print(miBooleano2)

if miBooleano2:
    print("El resultado es verdadero")
else:
    print("El resultado es Falso")

# Entrada de usuario
resultado = input("Digite un numero: ")  # Funcion de tipo str
print(f"Usted eligio el numero {resultado}")
print(type(resultado))

# Conversion en la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado2 = numero1 + numero2
print("El resultado de la suma es:", resultado2)
