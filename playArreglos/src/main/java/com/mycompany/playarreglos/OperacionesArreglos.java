/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playarreglos;

/**
 *
 * @author abel
 */
public class OperacionesArreglos {

    //Desarrollar una función que reciba un arreglo de números decimales y regrese la sumatoria
    public float calcularSuma(float[] num) {
        if (num==null)
        return 0f;
        
        float suma = 0f;
        //Recorrer el arreglo
        for (int i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        return suma;
    }

    //Desarrollar una función que reciba un arreglo de números decimales y regrese el promedio. 
    public float calcularPromedio(float[] num) {
        if (num==null)
            return 0f;
        float suma = 0f;
        for (int i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        // Calcular el promedio
        float promedio = 0f;
        if (num.length > 0) {
            promedio = suma / num.length;
        }

        return promedio;
    }

    /*Desarrollar una función que reciba un arreglo de números decimales y un límite; y 
    regrese la cantidad de elementos que excedan el límite.*/
    public int contarMayoresQue(float[] num, float limite) {
        if (num==null)
            return 0;
    int contador = 0;
    

    // Recorrer el arreglo
    for (int i = 0; i < num.length; i++) {
        if (num[i] > limite) {
            contador++;
        
        }
    }

    return contador;
    }
    
    /*Desarrollar una función que reciba un arreglo de números decimales y un arreglo 
    invertido. Por ejemplo, si el arreglo es 2, 1, 9 y 6, regresará 6, 9, 1 y 2. */
    public float[] invertirArreglo(float[] num) {
    float[] invertido = new float[num.length];
    int j = 0;

    // Recorrer el arreglo desde el final hacia el principio
    for (int i = num.length - 1; i >= 0; i--) {
        invertido[j] = num[i];
        j++;
    }

    return invertido;
    }
    
    /*Desarrollar una función que reciba un arreglo de números decimales y un arreglo con los valores absolutos. 
    Por ejemplo, si el arreglo es 2, -3, -4 y 5, regresará 2, 3, 4 y 5.*/
    public float[] obtenerAbsolutos(float[] num) {
    float[] absolutos = new float[num.length];

    // Recorrer el arreglo y convertir cada número a su valor absoluto
    for (int i = 0; i < num.length; i++) {
        if (num[i] < 0) {
            absolutos[i] = -num[i];  // Cambiar signo si es negativo
        } else {
            absolutos[i] = num[i];   // Mantener si ya es positivo
        }
    }

    return absolutos;
    }

}
