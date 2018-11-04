/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithms;

/**
 *
 * @author juanh
 */
public class HeapSort {
    
    private static void heapify(int arr[], int n, int i) { 
        int mayor = i;  
        int izq = 2*i + 1;  
        int der = 2*i + 2; 
  
        // si hijo izq es mas grande que raiz
        if (izq < n && arr[izq] > arr[mayor]) 
            mayor = izq; 
  
        // si hijo derecho es mayor
        if (der < n && arr[der] > arr[mayor]) 
            mayor = der; 
  
        // si mayor no es raiz 
        if (mayor != i) 
        { 
            int aux = arr[i]; 
            arr[i] = arr[mayor]; 
            arr[mayor] = aux; 
   
            heapify(arr, n, mayor); 
        } 
    } 
    
    public static void heapSort(int arr[]) { 
        int n = arr.length; 
  
        // construye monticulo 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        // deshace monticulo
        for (int i=n-1; i>=0; i--) 
        {  
            int aux = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = aux; 
  
            heapify(arr, i, 0); 
        } 
    }  
}
