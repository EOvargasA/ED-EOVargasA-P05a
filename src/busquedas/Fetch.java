/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;
import java.util.Random;
/**
 *
 * @author Osiris
 */
public abstract class Fetch {
    protected int[] vector;
    abstract int fetch (int n);
    Random rng = new Random();
    
    int[] getV() {
        return this.vector;
    }

    void setV(int[] v) {
        this.vector = v;
    }

    int[] randomV(int n) {
        int [] v = new int[n];
        for (int i = 0; i < v.length; i++){
            v[i] = rng.nextInt();
        }
        return v;
    }

    void showV() {
        System.out.print("[");
        for (int i = 0; i < this.vector.length; i++){
            System.out.print(this.vector[i]);
            if(i < this.vector.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    void showF(int f) {
        System.out.println("El numero esta en la posicion "+(f+1));
    }
}
