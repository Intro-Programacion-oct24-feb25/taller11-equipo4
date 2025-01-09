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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        int indice;
        String nombre;
        String cedula;
        while (bandera) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula");
            cedula = entrada.nextLine();
            System.out.println("Ingrese segun desee: (1) planilla de luz, (2)"
                    + "predio");
            indice = entrada.nextInt();
            if (indice == 1) {
                calcularValorLuz(nombre, cedula);

            } else {
                if (indice == 2) {
                    calcularPredio(nombre, cedula);
                }
            }
            String letra;
            System.out.println("Desea finalizar? (si) (no)");
            entrada.nextLine();
            letra = entrada.nextLine();
            if (letra.equals("si")) {
                bandera = false;

            }
        }
    }

    public static void calcularValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double valork;
        double numk;
        System.out.println("Ingrese el valor del kilowatio");
        valork = entrada.nextDouble();
        System.out.println("Ingrese el numero del kilowatio en el mes");
        numk = entrada.nextDouble();

        double resultado = valork * numk;

        String mensaje = String.format("Cliente: %s con cedula %s debe cancelar"
                + "el valor de $ %.2f", a, b, resultado);
        System.out.printf("%s\n", mensaje);

    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);

        double inmueble;
        double predio;
        String mensaje;
        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        predio = inmueble * 0.02;
        mensaje = String.format("Cliente: %s con cedula %s tiene un bien inmueble"
                + "valorado en $%.2f tiene que pagar un predio $%.2f",
                a,
                b,
                inmueble,
                predio);
        System.out.printf("%s\n", mensaje);

    }

}
