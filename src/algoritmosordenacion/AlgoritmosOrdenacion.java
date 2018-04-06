/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Diego Álvarez
 */
public class AlgoritmosOrdenacion {

    public void ordenacionBurbuja(int[] numeros) {
        int aux; //variable para hacer los intercambios
        boolean recolocar = true;
        while (recolocar) {
            recolocar = false;
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) { //intercambio los valores
                    aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                    recolocar = true;
                }
            }
        }
    }
    
    public void ordenacionInsercion(int[] numeros) {
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i;
            while (j > 0 && numeros[j - 1] > aux) {
                numeros[j] = numeros[j - 1];
                j--;
            }
            numeros[j] = aux;
            System.out.println(Arrays.toString(numeros));
        }
}
 public int[] generaNumerosRandom(int dimension){
     int [] numeros = new int[dimension];
        Random r = new Random();
        
        for(int i=0;i<dimension; i++){
            numeros[i] =r.nextInt();
        }
        
        return numeros;
 }
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosOrdenacion ejercicios = new AlgoritmosOrdenacion();
        //int[] numeros = {57, 22, 11, 13, 21, 7};
        int[] numeros = ejercicios.generaNumerosRandom(1000);
        //ejercicios.ordenacionBurbuja(numeros);
        //ejercicios.ordenacionInsercion(numeros);
        long tiempoInicio = System.currentTimeMillis();
        
        ejercicios.ordenacionBurbuja(numeros);
        
        long tiempoFinal = System.currentTimeMillis();
        
        System.out.println(tiempoFinal - tiempoInicio);
        //Comprobar que pasa si lo metes en orden y hay que optimizarlo
        //Que no compruebe siempre el bucle interno todos los numeros
    }
}
