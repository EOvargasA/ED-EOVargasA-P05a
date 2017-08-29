/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;

/**
 *
 * @author Osiris
 */
public class Binaria extends Fetch implements Ordenamiento{

    @Override
    int fetch(int n) {
        int start = 0, end = this.vector.length - 1, middle;
        boolean exist;
        do{
            exist = false;
            middle = (start + end)/2;
            if (n == this.vector[middle]){
                return middle;
            }
            if (n >= this.vector[start]&&n<= this.vector[middle]){
                exist = true;
                end = middle - 1;
            }else{
                if (n >= this.vector[middle]&&n<= this.vector[end]){
                    exist = true;
                    start = middle + 1;
                }
            }
        }while(exist == true);
        return -1;
    }

    @Override
    public void Seleccion(int[] v) {
       int menor = 0, auxiliar;
        for (int i = 0; i < v.length; i++){
            menor = i;
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < v[menor]){
                    menor = j;
                }
            }
            intercambio(i,menor);
        }
    }

    @Override
    public void Insercion(int[] v) {
        int aux, j;
        for (int i = 0; i < v.length; i++){
            aux = v[i];
            j = i - 1;
            while((j >= 0) && (v[j] > aux)){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = aux;
        }
        v = this.vector;
    }

    @Override
    public void Burbuja(int[] v) {
        for (int i = 0; i < v.length; i++){
            for (int j = 0; j < v.length - 1; j++){
                if (v[j] > v[j+1]){
                    intercambio(j, j+1);
                }
            }
        }
    }

    @Override
    public void Mergesort(int[] v, int i, int f) { 
     if (i < f){
        int m = (i+f)/2;
        Mergesort(v, i, m);
        Mergesort(v , m+1, f);
        Merge(v, i, m, f);
        }
        setV(v);
    }

    @Override
    public void Quicksort(int[] v, int i, int f) {
        int j, k, pivote;
        j = i;
        k = f;
        pivote = v[getMiddle(v)];
        while (j < k){
            while (v[j] <= pivote && j<k) j++;
            while (v[k] > pivote) k--;
            if (j < k) intercambio(j,k);
        }
        intercambio(j,getMiddle(v));
        if (i < k-1){
            Quicksort(v,i,k-1);
        }
        if (f > j+1){
            Quicksort(v,j+1,f);
        }
    }
    
    private void intercambio (int a, int b){
        int aux;
        aux = this.vector[a];
        this.vector[a] = this.vector[b];
        this.vector[b] = aux;
    }
    
    private int getSmallest(int[] v){
        int s = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] < v[s]){
                s = i;
            }
        }
        return s;
    }
    
    private int getGreatest(int[] v){
        int s = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] > v[s]){
                s = i;
            }
        }
        return s;
    }
     private int getMiddle (int[] v){
         int aux = ((getSmallest(v)+getGreatest(v))/2);
         int s = 0, a = Math.abs(v[0] - aux);
         for (int i = 0; i < v.length; i++){
            if (Math.abs(v[i] - aux) > a){
                a = Math.abs(v[i] - aux);
                s = i;
            }
        }
        return s;
     }
     
    private void Merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
