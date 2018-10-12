/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

/**
 *
 * @author Victoria
 */
public class Principal {

    public static void main(String[] args) {
        Precio p;
        p = new Precio();

        Precio n = new Precio(25.9);
        // p.euros = 10.1;
        //System.out.println(p.euros);

        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }

}
