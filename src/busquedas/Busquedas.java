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
        Binaria b = new Binaria();
        b.setV(b.randomV(10));
        b.showV();
        b.Mergesort(b.getV(),0,b.getV().length - 1);
        b.showV();
    }
    
}
