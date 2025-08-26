/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String usuario;
    private String contraseña;
    private List<Rutina> rutinas;

    // Constructor completo
    public Usuario(int id, String nombre, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rutinas = new ArrayList<>();
    }

    // Constructor simplificado para pruebas
    public Usuario(String usuario, String contraseña) {
        this.id = 0;
        this.nombre = "Usuario demo";
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rutinas = new ArrayList<>();
    }

    // Método para validar inicio de sesión
    public boolean iniciarSesion(String usuario, String contraseña) {
        return this.usuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    // Agrega una rutina al usuario
    public void agregarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    // Devuelve la lista de rutinas
    public List<Rutina> verRutinas() {
        return rutinas;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public List<Rutina> getRutinas() {
        return rutinas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " (" + usuario + ")";
    }
}
