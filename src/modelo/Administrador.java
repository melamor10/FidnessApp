/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

public class Administrador extends Usuario {

    public Administrador(int id, String nombre, String usuario, String contraseña) {
        super(id, nombre, usuario, contraseña);
    }

    public void agregarEjercicio(Ejercicio e, List<Ejercicio> lista) {
        lista.add(e);
    }

    public void eliminarEjercicio(Ejercicio e, List<Ejercicio> lista) {
        lista.remove(e);
    }
}
