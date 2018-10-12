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
public class Equipo {

    // Atributos globales
    private String nombre;
    private int num_jugadores;
    private String ciudad;

    // Constructor vacio
    public Equipo() {
        agregar_nombre("S/N");
        agregar_num_jugadores(0);
        agregar_ciudad("S/N");
    }

    // Constructor con 1 parametro
    public Equipo(String nombre) {
        agregar_nombre(nombre);
    }

    // Constructor con 2 parametros
    public Equipo(String nombre, int num_jugadores) {
        agregar_nombre(nombre);
        agregar_num_jugadores(num_jugadores);
    }

    // Constructor con 3 parametros
    public Equipo(String nombre, int num_jugadores, String ciudad) {
        agregar_nombre(nombre);
        agregar_num_jugadores(num_jugadores);
        agregar_ciudad(ciudad);
    }

    // Metodo para agregar nombre
    public void agregar_nombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo para agregar numero de jugadores
    public void agregar_num_jugadores(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }

    // Metodo para agregar ciudad
    public void agregar_ciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Metodo para obtener nombre
    public String obtener_nombre() {
        return nombre;
    }

    // Metodo para obtener numero de jugadores
    public int obtener_num_jugadores() {
        return num_jugadores;
    }

    // Metodo para obtener ciudad
    public String obtener_ciudad() {
        return ciudad;
    }
}
