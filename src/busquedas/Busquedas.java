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
public class Busquedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        Secuencial a = new Secuencial();
        a.setV(a.randomV(10));
        a.showV();
        i = a.getV()[8];
        j = a.fetch(i);
        a.showF(j);
        Binaria b = new Binaria();
        int[] c = new int[10];
        c[0]=2;
        c[1]=3;
        c[2]=5;
        c[3]=6;
        c[4]=9;
        c[5]=11;
        c[6]=12;
        c[7]=14;
        c[8]=17;
        c[9]=20;
        b.setV(c);
        int k = b.fetch(5);
        a.showF(k);
    }
    
}
