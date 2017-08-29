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
public interface Ordenamiento {
    public void Seleccion (int[] v);
    public void Insercion (int[] v);
    public void Burbuja (int [] v);
    public void Mergesort (int [] v, int i, int f);
    public void Quicksort (int [] v,int i,int f);
}
