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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        int contador = arreglo.length;
        int elementos_a = 0;
        int elementos_d = 0;

        for (int i = 0; i < 13; i++) {
            suma = suma + arreglo[i];
        }
        double media = suma / (contador);
        for (int i = 0; i < 13; i++) {
            if (arreglo[i] > media) {
                elementos_a = elementos_a + 1;
            } else {
                if (arreglo[i] < media) {
                    elementos_d = elementos_d + 1;
                }

            }
            
        }
        String mensaje=String.format("Hay %d elementos que están arriba de la media arimetica de %.2f. \nY hay %d elementos que están por debajo de la media arimetica de %.2f.", 
                elementos_a,
                media,
                elementos_d,
                media);
        System.out.println(mensaje);
        
    }

}
