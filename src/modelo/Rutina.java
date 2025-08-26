/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private int id;
    private String nombreRutina;
    private int usuarioId; // ID del usuario al que pertenece la rutina
    private LocalDate fechaCreacion;
    private List<Ejercicio> ejercicios;

    // Constructor
    public Rutina(String nombreRutina, int usuarioId) {
        this.nombreRutina = nombreRutina;
        this.usuarioId = usuarioId;
        this.fechaCreacion = LocalDate.now();
        this.ejercicios = new ArrayList<>();
    }

    // Métodos
    public void agregarEjercicio(Ejercicio e) {
        ejercicios.add(e);
    }

    public void eliminarEjercicio(Ejercicio e) {
        ejercicios.remove(e);
    }

    public void exportarRutina(String nombreUsuario) {
        String nombreArchivo = "Rutina_" + nombreUsuario + ".txt";

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Rutina: " + nombreRutina + "\n");
            writer.write("Fecha: " + fechaCreacion + "\n");
            writer.write("Usuario ID: " + usuarioId + "\n");
            writer.write("Ejercicios:\n");
            for (Ejercicio e : ejercicios) {
                writer.write("- " + e.getNombre() + " (" + e.getTipo() + "): " + e.getInstrucciones() + "\n");
            }
            System.out.println("✅ Rutina exportada con éxito a: " + nombreArchivo);
        } catch (IOException ex) {
            System.out.println("❌ Error al exportar la rutina: " + ex.getMessage());
        }
    }

    // Getters
    public String getNombreRutina() {
        return nombreRutina;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    @Override
    public String toString() {
        return nombreRutina + " (" + ejercicios.size() + " ejercicios)";
    }
}