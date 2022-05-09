/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pppp;

/**
 *
 * @author Aingeru
 * @contacto aingerualonso333@gmail.com
 * @fecha 21 mar 2022 8:09:47
 * @company DAM
 */
public class mayor {

    public static int obt_mayorNumero(int lista[]) {
        int indice, max = Integer.MIN_VALUE;
        for (indice = 0; indice < lista.length ; indice++) {
            if (lista[indice] > max) {
                max = lista[indice];
            }
        }
        return max;
    }

}
