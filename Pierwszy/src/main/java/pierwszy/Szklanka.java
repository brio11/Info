/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszy;

/**
 *
 * @author Lenovo
 */
public class Szklanka extends Pojemnik {

    public Szklanka(int pojemnosc, String ksztalt, String kolor) {
        super(pojemnosc, "szklo", ksztalt, kolor, 2, false);

    }

    @Override
    public void zrzuc() {

        System.out.println("Stłukło się " + getMaterial());

    }

}
