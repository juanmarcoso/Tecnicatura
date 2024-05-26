miVariable = 3
print(miVariable)
miVariable = 'Hola a todos!!!'
print(miVariable)
miVariable = 3.5
print(miVariable) #Si nos equivocamos en algo, podemos reformatear y nos arregla todo

#Ahora queremos ver la direccion de memoria con id()
x = 10
y = 2
z = x + y
print(z)
print(id(y)) #10781704
print(id(x)) #10781960
print(id(z)) #10782024
'''
REFERENCIA DE MEMORIA: (En mi linux no cambian las referencias de memoria)
Las literales se escriben con x704 para 'y'
Las literales se escriben con x960 para 'x'
Las literales se escriben con x024 para 'z'
'''

