/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca;

        String origen;
        String reporte = "";
        int contador = 1;
        double costo;

        int total_autos;
        int argentina = 0;
        int chile = 0;
        int colombia = 0;
        int otros_paises = 0;
        double total_impuestos = 0;
        double total_precio_venta = 0;
        double impuesto;
        double precio_venta;
        String bandera = "";
        System.out.println("Ingrese el numero de autos");
        total_autos = entrada.nextInt();

        reporte = reporte + String.format("%-16s%-16s%-16s%-16s%-16s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");

        while (contador <= total_autos) {
            System.out.println("Ingrese el nombre de la marca");
            marca = entrada.next();
            entrada.nextLine();
            System.out.println("Ingrese el nombre del origen:");
            origen = entrada.nextLine();

            System.out.println("Ingrese el costo");
            costo = entrada.nextInt();

            if (origen.equalsIgnoreCase("argentina")) {
                impuesto = costo * 0.2;
                argentina = argentina + 1;

            } else {
                if (origen.equalsIgnoreCase("Colombia")) {
                    impuesto = costo * 0.25;
                    colombia = colombia + 1;

                } else {
                    if (origen.equalsIgnoreCase("Chile")) {
                        impuesto = costo * 0.3;
                        chile = chile + 1;

                    } else {
                        impuesto = costo * 0.4;
                        otros_paises = otros_paises + 1;

                    }

                }

            }
            precio_venta = costo + impuesto;

            reporte = reporte + String.format("%-16s%-16s%-16.2f%-16.2f%-16.2f\n", marca, origen, costo, impuesto, precio_venta);
            total_impuestos = total_impuestos + impuesto;
            total_precio_venta = total_precio_venta + precio_venta;

            contador = contador + 1;

        }
        reporte = String.format("\nReporte de Autos Importados\n%sTotal Autos: %d\t Tot. Imps: %.2f\t Tot PV: %.2f\n", reporte, total_autos, total_impuestos, total_precio_venta);

        System.out.printf("%s%-16s%-16d\n%-16s%-16d\n%-16s%-16d\n%-16s%-16d\n", reporte, "Argentina", argentina, "Colombia", colombia, "Chile", chile, "Otros origenes", otros_paises);

    }
}
