/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Condicional {
    public void Numero() {
        Scanner res = new Scanner(System.in);
        System.out.println("teclea numero: ");
        short numero1 = res.nextShort();

        if (numero1 > 0) {
            System.out.println("+");
        } else if (numero1 < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
        System.out.println("FIN programa");
    }
}


