# Ciclo for
# Nos permite iterar un conjunto de datos

cadena = 'Hello'
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')

# Palabra reservada 'break'
for letra in 'Alemania':
    if letra == 'a':
        print(f'Letra encontrada {letra}')
        break # Rompio la estructura cuando encuentra una 'a'
else:
    print("Fin del ciclo for")

# Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f'Valor {i}')

for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')