/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class CondicionalDoble {
     public void comparacionNumeros(){
    Scanner res= new Scanner(System.in);
        System.out.println("teclea primer numero: ");
        short numero1= res.nextShort();
        System.out.println("teclea segundo numero: ");
        short numero2= res.nextShort();
        
        if (numero1 >= numero2){
            System.out.println("el resultado de la resta es = "+( numero1-numero2));
        }
        else{
            System.out.println("el resultado de la suma es = "+(numero1+numero2));
        }
        System.out.println("FIN programa");
    }

}
