/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        String reporte = "";
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Ingrese el número %d: ", i + 1);
            numeros[i] = entrada.nextDouble();
            suma = suma + numeros[i];
        }
        double promedio = suma / numeros.length;
        reporte = String.format("%sPromedio de los numero ingresados: %.2f\n",
                reporte, promedio);
        for (int i = 0; i < numeros.length; i++) {
            double diferencia = numeros[i] - promedio;
            reporte = String.format("%sNúmero %d: %.2f | Diferencia: %.2f\n",
                    reporte, i + 1, numeros[i], diferencia);
        }
        System.out.printf("%s\n", reporte);
    }
}
