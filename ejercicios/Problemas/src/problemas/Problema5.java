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
public class Problema5 {

    public static void main(String[] args) {
        int[][] arreglo1 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] arreglo2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] arreglo3 = new int[3][3];
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerSuma(arreglo1[i][j],
                        arreglo2[i][j]);
            }

        }
        obtenerPantalla(arreglo1);
        obtenerPantalla(arreglo2);
        obtenerPantalla(arreglo3);
    }

    public static void obtenerPantalla(int[][] arreglo1) {
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int obtenerSuma(int a, int b) {
        int operacion;
        operacion = a + b;
        return operacion;

    }
}
