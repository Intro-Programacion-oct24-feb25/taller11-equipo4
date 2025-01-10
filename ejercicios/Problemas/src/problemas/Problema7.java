/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    
     public static void main(String[] args) {
        
        String[] elementos = obtenerElementos();
     
        imprimirElementos(elementos);
    }

    public static String[] obtenerElementos() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de elementos");
        int numEle = entrada.nextInt();
        entrada.nextLine();

        String[] arreglo = new String[numEle];

        for (int i = 0; i < numEle; i++) {
            System.out.println("Ingrese un elemento");
            arreglo[i] = entrada.nextLine();
        }

        return arreglo;
    }

   
    public static void imprimirElementos(String[] arreglo) {
        System.out.println("Elementos de 4 o 5 caracteres");
        for (int i = 0; i < arreglo.length; i++) {
            String elemento = arreglo[i];
            if (elemento.length() == 4 || elemento.length() == 5) {
                System.out.println(arreglo[i]);
            }
        }
    }

   
}