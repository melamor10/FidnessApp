/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Ejercicio {
    private int id;
    private String nombre;
    private String tipo; // Pierna, Brazo, etc.
    private String descripcion;
    private String instrucciones;

    // Constructor con todos los campos necesarios
    public Ejercicio(String nombre, String tipo, String descripcion, String instrucciones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}
