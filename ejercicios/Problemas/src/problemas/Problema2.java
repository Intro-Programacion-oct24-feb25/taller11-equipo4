/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int indice;
        System.out.println("Ingrese segun desee: (1) Cuadrado, (2) Triangulo,"
                + "(3) Rectangulo");
        indice = entrada.nextInt();
        if (indice == 1) {
            obtenerCuadrado();
        } else {
            if (indice == 2) {
                obtenerTriangulo();
            } else {
                if (indice == 3) {
                    obtenerRectangulo();

                }
            }
        }
    }

    public static void obtenerCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double valor1;
        System.out.println("Ingrese la medida del lado del cuadrado");
        valor1 = entrada.nextDouble();
        resultado = valor1 * valor1;
        String mensaje = "El area del cuadrado es:" + resultado;
        System.out.printf("%s\n", mensaje);

    }

    public static void obtenerTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double valor1;
        double valor2;
        System.out.println("Ingrese la base");
        valor1 = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        valor2 = entrada.nextDouble();
        resultado = (valor1 * valor2) / 2;
        String mensaje = "El area del cuadrado es:" + resultado;
        System.out.printf("%s\n", mensaje);

    }

    public static void obtenerRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double valor1;
        double valor2;
        System.out.println("Ingrese la base");
        valor1 = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        valor2 = entrada.nextDouble();
        resultado = valor1 * valor2;
        String mensaje = "El area del cuadrado es:" + resultado;
        System.out.printf("%s\n", mensaje);

    }

}
