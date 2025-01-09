/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double resultado1;
        resultado1 = obtenerMediaA(informacion);
        double resultado2 = obtenerDesviacion(informacion, resultado1);

        System.out.printf("La media aritmetica es: %.2f y el valor de la "
                + "desviacion estandar es: %.4f\n", resultado1, resultado2);

    }

    public static double obtenerMediaA(int[] arreglo) {
        double suma = 0;
        double media;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        media = suma / arreglo.length;
        return media;
    }

    public static double obtenerDesviacion(int[] arreglo, double media) {
        double calculo;
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            calculo = Math.pow(arreglo[i] - media, 2);
            suma = suma + calculo;
        }
        double desviacion = Math.sqrt(suma / 9);
        return desviacion;
    }
}
