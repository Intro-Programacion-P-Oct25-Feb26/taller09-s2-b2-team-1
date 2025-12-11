/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;
        String dato;
        String reporte = "";
        System.out.println("Ingrese el numero de marcas que desee ingresar:");
        numero = entrada.nextInt();
        entrada.nextLine();
        String[] marcas = new String[numero];
        while (contador < marcas.length) {
            System.out.println("Ingrese la marca del vehiculo");
            dato = entrada.nextLine();
            String letra = dato.substring(0, 1);
            letra = letra.toLowerCase();
            if (letra.equals("a") || letra.equals("c") || letra.equals("t")) {
                System.out.println("Marca invalida, ingrese nuevamente");
            } else {
                marcas[contador] = dato;
                contador = contador + 1;
            }
        }
        for (int i = 0; i < marcas.length; i++) {
            reporte = String.format("%sMarca de Vehiculo %d: %s\n",
                    reporte, i + 1, marcas[i].toUpperCase());
        }
        System.out.printf("MARCAS VALIDAS REGISTRADAS\n%s\n", reporte);
    }
}
