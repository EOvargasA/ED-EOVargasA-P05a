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
public class Secuencial extends Fetch {
    @Override
    int fetch(int n) {
        for (int i = 0; i < this.vector.length; i++){
            if (n == this.vector[i]){
                return i;
            }
        }
        return -1;
    }
}
