/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin6_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Personas persona1 = new Personas("Pepe", 98.32);
        Personas persona2 = new Personas("Marta", 60.22);
        if(persona1.getPeso() > persona2.getPeso()){
            System.out.println(persona1.getNombre() + " pesa más que " + persona2.getNombre());
            System.out.println("La diferencia de peso es de " + (persona1.getPeso() - persona2.getPeso()));
        }
        else{
            System.out.println(persona2.getNombre() + " pesa más que " + persona1.getNombre());
            System.out.println("La diferencia de peso es de " + (persona2.getPeso() - persona1.getPeso()));
        }
 
    }
   }

    
    

