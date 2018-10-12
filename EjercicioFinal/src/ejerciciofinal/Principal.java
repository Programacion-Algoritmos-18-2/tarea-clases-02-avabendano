/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author Victoria
 */
public class Principal {

    public static void main(String[] args) {
        // Instanciacion del primer equipo
        Equipo e1 = new Equipo();
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e1.obtener_nombre(), e1.obtener_num_jugadores(), e1.obtener_ciudad());

        // Instanciacion del segundo equipo
        Equipo e2 = new Equipo("Emelec");
        e2.agregar_num_jugadores(17);
        e2.agregar_ciudad("Cuenca");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e2.obtener_nombre(), e2.obtener_num_jugadores(), e2.obtener_ciudad());

        // Instanciacion del tercer equipo
        Equipo e3 = new Equipo("Barcelona", 18);
        e3.agregar_ciudad("Guayaquil");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e3.obtener_nombre(), e3.obtener_num_jugadores(), e3.obtener_ciudad());

        // Instanciacion del cuarto equipo
        Equipo e4 = new Equipo("Liga de Loja", 24, "Loja");
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e4.obtener_nombre(), e4.obtener_num_jugadores(), e4.obtener_ciudad());
    }
}
