/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[promedios.length];

        for (int i = 0; i < promedios.length; i++) {
            double promedio = promedios[i];

            if (promedio >= 9 && promedio <= 10) {
                promediosCualitativos[i] = "Sobresaliente";
            } else if (promedio >= 6 && promedio <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else if (promedio >= 0 && promedio <= 5.9) {
                promediosCualitativos[i] = "Regular";
            }
        }
        for (int i = 0; i < promedios.length; i++) {
            String promedioFormateado = String.format("%.2f", promedios[i]);
            System.out.printf("%s promedio: %s promedio cualitativo %s\n",
                    estudiantes[i],
                    promedioFormateado,
                    promediosCualitativos[i]);
        }
        
    }
}
