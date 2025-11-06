/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playarreglos;

/**
 *
 * @author abel
 */
public class PlayArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op = new OperacionesArreglos();
        
        float[] pesos = {12f, 45f, 3.5f};
        float sum = op.calcularSuma(pesos);
        System.out.println("La suma es " + sum);
        
        float prom = op.calcularPromedio(pesos);
        System.out.println("El promedio es " + prom);
        
        int mayores = op.contarMayoresQue(pesos, 20f);
        System.out.println("La cantidad de elementos mayores a 20 es " + mayores);
        
        //inverso
        float[] numeros = {2f, 1f, 9f, 6f};

        System.out.print("Arreglo original: ");
        for (float n : numeros) {
            System.out.print(n + " ");
        }

        float[] invertido = op.invertirArreglo(numeros);

        System.out.print("\nArreglo invertido: ");
        for (float n : invertido) {
            System.out.print(n + " ");
        
        }
        //absolutos
        float[] valores = {2f, -3f, -4f, 5f};

        System.out.print("Arreglo original: ");
        for (float n : valores) {
            System.out.print(n + " ");
        }

        float[] absolutos = op.obtenerAbsolutos(valores);

        System.out.print("\nArreglo con valores absolutos: ");
        for (float n : absolutos) {
            System.out.print(n + " ");
        }
    }
}

 