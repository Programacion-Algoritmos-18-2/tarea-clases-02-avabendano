/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Victoria
 */
public class Principal {

    public static void main(String[] args) {
        Precio p;
        p = new Precio();
        // p.euros = 10.1;
        //System.out.println(p.euros);
        p.agregar(20.2);
        System.out.println(p.obtener());
    }

}
