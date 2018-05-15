"""
    Ingreso de datos en Python
 Ejemplo en clase:
"""

cadena = '{0:12}{1:7}{2:7}{3:7}{4:8}\n'.format(
    "Nombre", "Nota1", "Nota2", "Nota3", "Promedio")

cont = 1

n = int(input('Numero de estudiantes que ingresara: '))

while cont <= n:
    nombre = input('\nNombre del estudiante: ')
    n1 = input('Nota 1 del estudiante: ')
    n2 = input('Nota 2 del estudiante: ')
    n3 = input('Nota 3 del estudiante: ')

    prom = (float(n1) + float(n2) + float(n3)) / 3

    cadena = '{0}{1:12}{2:7}{3:7}{4:7}{5:8.2f}\n'.format(
        cadena, nombre, n1, n2, n3, prom)
    
    cont += 1

print('\n{0:^41}\n{1}'.format('Reporte' ,cadena))