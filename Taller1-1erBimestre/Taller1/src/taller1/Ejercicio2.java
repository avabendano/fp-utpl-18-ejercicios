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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hijo;
        String papa;
        String gastos;
        String gastos_generales;
        String texto;
        int numero_hijos;
        int numero_reporte;
        double sueldo;
        double pasaje;
        double bar;
        double salida;
        double total_pasaje = 0;
        double total_bar = 0;
        double total_salida = 0;
        double total_gastos;

        gastos_generales = "Reporte Gastos de Padres de Familia";
        System.out.println("Ingrese cuantos reportes quiere imprimir");
        numero_reporte = entrada.nextInt();

        for (int a = 1; a <= numero_reporte; a++) {

            entrada.nextLine();
            System.out.println("Ingrese el nombre del padre");
            papa = entrada.nextLine();
            System.out.printf("Ingrese el numero de hijos: ");
            numero_hijos = entrada.nextInt();
            System.out.printf("Ingrese el sueldo");
            sueldo = entrada.nextDouble();
            gastos = String.format("Nombre de Padre de Familia: %s\nSueldo Semanal: %.2f\nNúmero de Hijos: %d", papa, sueldo, numero_hijos);
            gastos = String.format("\nGastos Familia\n%-20s%-20s%-20s%-20s\n", "Persona", "Pasaje", "Bar", "Salida");
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

            if (total_gastos > 50) {
                texto = "falta";
            } else if (total_gastos == 50) {
                texto = "alcanza";
            } else {
                texto = "sobra";
            }
            gastos = String.format("%sEl padre de familia %s le %s el dinero.\n", gastos, papa, texto);
            gastos_generales = String.format("%s\n%s", gastos_generales, gastos);
        }
        System.out.println(gastos_generales);
    }

}
