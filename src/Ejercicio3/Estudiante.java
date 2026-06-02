package Ejercicio3;

public class Estudiante {

    private String Nombre;
    private int Edad;
    private double IndiceAcademico;
    
    public Estudiante(String nombre, int edad, double indiceAcademico) {
        Nombre = nombre;
        Edad = edad;
        IndiceAcademico = indiceAcademico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getIndiceAcademico() {
        return IndiceAcademico;
    }

    public void setIndiceAcademico(double indiceAcademico) {
        IndiceAcademico = indiceAcademico;
    }

    

    
    
}
