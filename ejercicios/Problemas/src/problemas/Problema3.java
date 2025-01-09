/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        System.out.println("Ingrese la primera nota");
        double nota = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        double nota4 = entrada.nextDouble();
        String resultado = obtenerPromedio(nota, nota2, nota3, nota4);
        mensaje = String.format("El promedio de las notas: %.1f, %.1f, %.1f, "
                + "%.1f es %s", nota, nota2, nota3, nota4, resultado);
        mensaje = obtenerMayuscula(mensaje);
        System.out.printf("%s\n", mensaje);
    }

    public static String obtenerPromedio(double a, double b, double c, double d) {
        double promedio;
        String cualitativo = "Fuera de Rango";
        promedio = (a + b + c + d) / 4;
        if (promedio >= 0 && promedio <= 5) {
            cualitativo = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cualitativo = "Bueno";

            } else {
                if (promedio >= 8.1 && promedio <= 9) {

                    cualitativo = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        cualitativo = "Sobresaliente";

                    }
                }

            }
        }
        return cualitativo;
    }

    public static String obtenerMayuscula(String a) {
        a = a.toUpperCase();
        return a;
    }
}
