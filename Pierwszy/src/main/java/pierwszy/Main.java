/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pierwszy;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {

        Pojemnik szklanka1 = new Szklanka(12, "okragly", "czerwony");
        szklanka1.zrzuc();
        Pojemnik szklanka2 = new Szklanka(14, "kwadrat", "niebieski");
        szklanka2.zrzuc();

        System.out.println("Kolor trzeciej szklanki to " + szklanka2.getKolor());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kolor szklanki: ");
        String kolor = scanner.next();
        Pojemnik kubek = new Kubek(14, "kwadrat", kolor);
        kubek.zrzuc();
        System.out.println("Kolor kubka to " + kubek.getKolor());

    }

}
