/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.util.ArrayList;


public class Aula {
    
    private ArrayList<Estudiante> estudiantes;
    private String nombreClase;

    public Aula(String nombreClase) {
        this.nombreClase = nombreClase;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, String curso, String turno) 
    {
        Estudiante estudiante = new Estudiante(nombre, curso, turno);
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }
    
    
}
