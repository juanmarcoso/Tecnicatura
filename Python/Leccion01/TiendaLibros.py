"""
1. Mostrar: Ingrese los siguientes datos del libro
2. Digite el nombre del libro
3. Digite el ID del libro
4. Digite el precio del libro
5. Indicar si el envío es gratuito (TRUE/FALSE)
6. Mostrar:
    Nombre:
    ID:
    Precio:
    Envio Gratuito?:
"""

print("*** Ingrese los siguientes datos del libro ***")
print("")
libro = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envio = input("Indicar si el envío es gratuito (SI/NO): ")

if envio == "SI":
    envio = True
elif envio == "NO":
    envio = False
else:
    print("Es invalida la respuesta")

print(f'''
        Nombre: {libro}
        Id: {id}
        Precio: {precio}
        Envio Gratis: {envio}
''')
print(f"Nombre: {libro}\nId: {id}\nPrecio: {precio}\nEnvio Gratis: {envio}")