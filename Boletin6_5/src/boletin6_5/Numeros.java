/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;
import javax.swing.JOptionPane;
/**
 *
 * @author slorenzorodriguez
 */
public class Numeros{
        public void Numeros(){
        int num1,num2,num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercer numero"));
        
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "El mayor es "+num1);
            
        }
        
          else if (num2>num3){
            JOptionPane.showMessageDialog(null, "El mayor es "+num2);
        }
          
        else if (num3>num2){
            JOptionPane.showMessageDialog(null, "El mayor es "+num3);
        }
        
      
        
        
    }
}






