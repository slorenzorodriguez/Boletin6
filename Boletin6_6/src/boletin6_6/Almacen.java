/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Almacen {
    
    private String nombre;
    private int ventas;

    public Almacen(String nome, int vendasA) {
        this.nombre = nome;
        this.ventas = vendasA;
    }

    public void calcularConsumo(Almacen a) {
        if (ventas <= 100) {
            JOptionPane.showMessageDialog(null, a.nombre + " ten un consumo baixo.");
        } else if (ventas <= 500) {
            JOptionPane.showMessageDialog(null, a.nombre + " ten un consumo medio.");
        } else if (ventas <= 1000) {
            JOptionPane.showMessageDialog(null, a.nombre + " ten un consumo alto.");
        } else {
            JOptionPane.showMessageDialog(null, a.nombre + " ten unha primeira necesidade.");
        }
    }
}

