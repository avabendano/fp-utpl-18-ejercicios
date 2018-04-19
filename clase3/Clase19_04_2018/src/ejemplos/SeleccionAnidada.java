/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        
        Scanner entrada = new Scanner(System.in);
        
        int calificacion;
        String nombre;
        
        System.out.println("Ingresa tu nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingresa tu calificacion");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 50) {
            System.out.printf("ESTUDIANTE %s\n\tAprobado\ncon califiación\n\t%d\n", nombre.toUpperCase(), calificacion);
        } else {
            System.out.printf("ESTUDIANTE %s\n\tReprobado\ncon califiación\n\t%d\n", nombre.toUpperCase(), calificacion);
        }
    }
}
