/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

public class Kalkulator {

    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println((a + b) * c);
        System.out.println(a - b / c);

        System.out.println((a++ + b++) * c++);
        System.out.println(a++ - b++ / c++);

        System.out.println((a + b) > c);
        System.out.println("czy" + (a==b));
               
        
    }
}
