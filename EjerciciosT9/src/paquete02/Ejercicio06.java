/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] cafes = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precios = {1.5, 2.1, 2.3};
        String reporte = "";
        double valorTotal = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Seleccione un producto:");
            for (int i = 0; i < cafes.length; i++) {
                System.out.printf("%d) %s - $%.1f\n", i + 1, cafes[i], precios[i]);
            }
            System.out.print("Ingrese el número del producto:\n");
            int opcion = entrada.nextInt();
            opcion = opcion - 1;
            if (opcion < 0 || opcion >= cafes.length) {
                System.out.println("Opción no válida");
            } else {
                System.out.print("¿Cuántas tazas desea comprar?:\n");
                int tazas = entrada.nextInt();
                double totalPedido = precios[opcion] * tazas;
                reporte = String.format("%s\t%s (%d t), valor a cancelar $%.1f\n",
                        reporte, cafes[opcion], tazas, totalPedido);
                valorTotal = valorTotal + totalPedido;
            }
            entrada.nextLine();
            System.out.print("¿Desea comprar otro producto? (s/n):\n");
            String salida = entrada.nextLine();
            if (!salida.equals("s")) {
                bandera = false;
            }
        }
        System.out.printf("El usuario ha comprado:\n\n"
                + "%s\n"
                + "Total a pagar: %.1f\n", reporte, valorTotal);
    }
}
