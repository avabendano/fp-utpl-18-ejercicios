/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hijo;
        String gastos;
        int numero_hijos;
        double pasaje;
        double bar;
        double salida;
        double total_pasaje = 0;
        double total_bar = 0;
        double total_salida = 0;
        double total_gastos;

        gastos = String.format("\nGastos Familia\n%-20s%-20s%-20s%-20s\n", "Persona", "Pasaje", "Bar", "Salida");
        System.out.printf("Ingrese el numero de hijos: ");
        numero_hijos = entrada.nextInt();

        for (int i = 1; i <= numero_hijos; i++) {
            hijo = String.format("Hijo %d", i);
            System.out.printf("Datos del %s\n", hijo);
            System.out.printf("Pasaje: ");
            pasaje = entrada.nextDouble();
            System.out.printf("Bar: ");
            bar = entrada.nextDouble();
            System.out.printf("Salida: ");
            salida = entrada.nextDouble();

            gastos = String.format("%s%-20s%-20.2f%-20.2f%-20.2f\n", gastos, hijo, pasaje, bar, salida);
            total_pasaje = total_pasaje + pasaje;
            total_bar = total_bar + bar;
            total_salida = total_salida + salida;
        }
        gastos = String.format("%s\n%-20s%-20.2f%-20.2f%-20.2f\n", gastos, "Totales", total_pasaje, total_bar, total_salida);

        total_gastos = total_pasaje + total_bar + total_salida;
        System.out.println(gastos);

        if (total_gastos > 50) {
            System.out.println("El padre de familia le falta dinero.");
        } else if (total_gastos == 50) {
            System.out.println("El padre de familia salio con las justas.");
        } else {
            System.out.println("El padre de familia le sobra dinero.");
        }

    }

}
