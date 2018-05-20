/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportecalificaciones;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class ReporteEstudiantes {

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String calificacion;
        String asignatura;
        String nombre_estudiante;
        String resultado;
        String calificacion_final;
        int edad;
        int numero_asignaturas;
        int numero_reporte;
        double bimestre_uno;
        double bimestre_dos;
        double promedio;
        double promedio_estudiante = 0;
        double promedio_global = 0;
        double promedio_edad = 0;


        calificacion_final = String.format("Reporte Calificaciones de Estudiantes");
        System.out.printf("Ingrese cuantos reportes quiere imprimir: ");
        numero_reporte = entrada.nextInt();

        for (int a = 1; a <= numero_reporte; a++) {

            entrada.nextLine();

            System.out.printf("Nombre del Estudiante: ");
            nombre_estudiante = entrada.nextLine();

            System.out.printf("Edad: ");
            edad = entrada.nextInt();

            System.out.printf("Número de Asignaturas: ");
            numero_asignaturas = entrada.nextInt();

            calificacion = String.format("Nombre del Estudiante %d: %S\nEdad: %d\nNúmero de Asignaturas: %d\n\nReporte de Notas\n%-20s%-20s%-20s%-20s\n", a, nombre_estudiante, edad, numero_asignaturas, "Asignatura", "Bimestre 1", "Bimestre 2", "Promedio");


            for (int b = 1; b <= numero_asignaturas; b++) {
                entrada.nextLine();

                System.out.printf("Datos de la Asignatura %d\n", b);
                System.out.printf("Nombre: ");
                asignatura = entrada.nextLine();
                System.out.printf("Nota Bimestre 1: ");
                bimestre_uno = entrada.nextDouble();
                System.out.printf("Nota Bimestre 2: ");
                bimestre_dos = entrada.nextDouble();

                promedio = (bimestre_uno + bimestre_dos) / 2;

                calificacion = String.format("%s%-20s%-20.2f%-20.2f%-20.2f\n", calificacion, asignatura, bimestre_uno, bimestre_dos, promedio);

                promedio_estudiante = promedio_estudiante + promedio;
            }

            promedio_estudiante = promedio_estudiante / numero_asignaturas;
            promedio_global = promedio_global + promedio_estudiante;
            promedio_edad = promedio_edad + edad;

            calificacion = String.format("%s%32s%-20s%-20.2f\n\n", calificacion, "", "Promedio", promedio_estudiante);

            if (promedio_estudiante < 13) {
                resultado = "Regular";
            } else if (promedio_estudiante >= 13 & promedio_estudiante < 16) {
                resultado = "Bueno";
            } else if (promedio_estudiante >= 16 & promedio_estudiante < 19) {
                resultado = "Muy Bueno";
            } else {
                resultado = "Sobresaliente";
            }

            calificacion = String.format("%s%S tiene un promedio de %s\n", calificacion, nombre_estudiante, resultado);

            calificacion_final = String.format("%s\n\n%s", calificacion_final, calificacion);
        }

        promedio_global = promedio_global / numero_reporte;
        promedio_edad = promedio_edad / numero_reporte;

        calificacion = String.format("%s\n\nInformación global de los estudiantes:\nPromedio de edad es: %.2f\nPromedio de Notas de los estudiantes es: %.2f", calificacion_final, promedio_edad, promedio_global);
        calificacion_final = String.format("%s\n%s", calificacion_final, calificacion);

        System.out.printf(calificacion_final);
    }

}