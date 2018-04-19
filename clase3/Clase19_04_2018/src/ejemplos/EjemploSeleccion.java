/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 Crear un programa que permita ingresar una califiacion por teclado, si la calificacion ingresada 
 es mayor o igual a 5 y la calificacion es menor a 10 se debe presentar un mensaje que diga usted esta en supletorios
 de lo contrario se presenta un mensaje con el valor de la calificacion dividido para dos.
*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class EjemploSeleccion {
    public static void main(String[] args){
          Scanner entrada = new Scanner(System.in);
          
          double calificacion;
          System.out.println("Ingrese su calificacion");
          calificacion = entrada.nextDouble();
          
          if(calificacion >= 5 & calificacion<10){
              System.out.printf("Usted esta en supletorio");
          }else{
              //System.out.printf ("%d",calificacion/2);
              double resultado = calificacion/2;
              System.out.printf("%f",resultado);
              
             
          }
                  
       
    
    }
}
    
