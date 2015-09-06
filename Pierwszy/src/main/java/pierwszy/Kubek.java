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
public class Kubek extends Pojemnik {

    public Kubek(int pojemnosc, String ksztalt, String kolor) {
        super(pojemnosc, "metal", ksztalt, kolor, 5, true);

    }

    @Override
    public void zrzuc() {
        String material = getMaterial();
        material = material + " wygiety";
        System.out.println("Wygło się " + material);

    }

}
