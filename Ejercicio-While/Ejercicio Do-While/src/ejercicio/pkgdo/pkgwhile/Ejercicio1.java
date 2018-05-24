/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String reporte_general;
        String reporte_jugadores;
        String nombre_jugador;
        String nivel_jugador;
        String a_goles;
        String a_pases;
        String a_bandera;
        int total_pases = 0;
        int total_goles = 0;
        int pases;
        int goles;
        int numero = 1;
        int numero_partidos;
        int numero_jugadores = 0;
        double promedio_pases = 0;
        double promedio_goles = 0;
        boolean bandera = false;

        reporte_general = String.format("\nGenerar el siguiente reporte:\n\nReporte de Jugadores del Equipo \"UTPL\"\n\n%-25s%-20s%-20s%-19s\n\n", "Nombre del Jugador", "Total de Pases", "Total de Goles", "Nivel de Jugador");
        do {
            numero_jugadores = numero_jugadores + 1;
            System.out.printf("Ingrese el nombre de los jugadores %d: ", numero);
            nombre_jugador = entrada.nextLine();
            System.out.printf("Numero de partidos jugados: ");
            numero_partidos = entrada.nextInt();
            reporte_jugadores = String.format("%-25s", nombre_jugador);
            for (int a = 1; a <= numero_partidos; a++) {
                System.out.printf("Ingrese el numero de Pases en el Partido %d: ", a);
                pases = entrada.nextInt();
                System.out.printf("Ingrese el numero de Goles en el Partido %d: ", a);
                goles = entrada.nextInt();

                a_pases = String.format("P%d:%d", a, pases);
                a_goles = String.format("P%d:%d", a, goles);
                if (a == 1) {
                    reporte_jugadores = String.format("%s%-20s%-20s\n", reporte_jugadores, a_pases, a_goles);
                } else {
                    reporte_jugadores = String.format("%s%-25s%-20s%-20s\n", reporte_jugadores, "", a_pases, a_goles);
                }

                total_pases = total_pases + pases;
                total_goles = total_goles + goles;
            }

            if (total_pases < 60) {
                nivel_jugador = "Regular";
            } else if (total_pases < 80) {
                nivel_jugador = "Bueno";
            } else if (total_pases < 100) {
                nivel_jugador = "Muy Bueno";
            } else {
                nivel_jugador = "Excelente";
            }

            a_pases = String.format("Total:%d", total_pases);
            a_goles = String.format("Total:%d", total_goles);
            reporte_jugadores = String.format("%s\n%-25s%-20s%-20s%-19s", reporte_jugadores, "", a_pases, a_goles, nivel_jugador);
            reporte_general = String.format("%s%s\n\n", reporte_general, reporte_jugadores);
            promedio_pases = promedio_pases + total_pases;
            promedio_goles = promedio_goles + total_goles;

            System.out.printf("Desea salir (si - no): ");
            entrada.nextLine();
            a_bandera = entrada.nextLine();

            if (a_bandera.equals("si")) {
                bandera = true;
            }
            total_pases = 0;
            total_goles = 0;

        } while (!bandera);

        promedio_pases = promedio_pases / numero_jugadores;
        promedio_goles = promedio_goles / numero_jugadores;

        reporte_general = String.format("%sDatos Finales:\n%d Jugadores Analizados.\nPromedio de Pases del equipo es %.2f\nPromedio de Goles del equipo es %.2f\n\n\nDepartamento Estadístico", reporte_general, numero_jugadores, promedio_pases, promedio_goles);

        System.out.println(reporte_general);

    }
}
