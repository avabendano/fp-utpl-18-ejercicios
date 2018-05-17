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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre_cliente;
        String nombre_articulo;
        String factura;
        String salir;
        int cantidad_articulo;
        double iva, total, subtotal = 0;
        double precio_unitario_articulo;
        double precio_total;
        boolean bandera = true;
        System.out.println("Ingrese el nombre del cliente");
        nombre_cliente = entrada.nextLine();

        factura = String.format("%20s\nsupermecado 'Todo a menor precio'\nnombre del cliente:%s\n\n", "factura", nombre_cliente);
        factura = String.format("%s%-15s%-15s%-20s%-20s\n", factura, "articulo", "cantidad", "precio unitario", "precio total");
        while (bandera) {
            System.out.println("Ingresar el nombre del articulo");
            nombre_articulo = entrada.nextLine();
            System.out.println("Ingrese cantidad del articulo");
            cantidad_articulo = entrada.nextInt();
            System.out.println("Ingrese el precio unitario del articulo");
            precio_unitario_articulo = entrada.nextDouble();
            precio_total = cantidad_articulo * precio_unitario_articulo;
            factura = String.format("%s%-15s%-15d%-20.2f%-20.2f\n", factura, nombre_articulo, cantidad_articulo, precio_unitario_articulo, precio_total);

            subtotal = subtotal + precio_total;

            entrada.nextLine();
            System.out.println("Escriba si para salir");

            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }

        }
        iva = subtotal * 0.14;
        total = subtotal + iva;

        factura = String.format("%s%30s%-20s%-20.2f\n%30s%-20s%-20.2f\n%30s%-20s%-20.2f\n", factura, " ", "subtotal", subtotal, " ", "iva 14%", iva, " ", "total", total);
        System.out.println(factura);
    }

}
