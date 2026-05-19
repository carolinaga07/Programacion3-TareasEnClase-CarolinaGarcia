package Ejercicio2;

public class Paciente {

    private String Nombre;
    private int Edad;
    private String Cedula;
    private boolean Seguro;
    private String Enfermedad;
    private double Peso;
    private Double Altura;


    public Paciente (String nombre, int edad, String cedula, boolean seguro, String enfermedad, double peso, double altura){
        this.Cedula = cedula;
        this.Edad = edad;
        this.Enfermedad = enfermedad;
        this.Nombre = nombre;
        this.Seguro = seguro;
        this.Peso = peso;
        this.Altura = altura;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;

    }

     public int getEdad(){
        return Edad;
    }

    public void setEdad(int Edad ){
        this.Edad = Edad;

    }

    public String getCedula(){
        return Cedula;
    }

    public void setCedula(String Cedula){
        this.Cedula = Cedula;

    }

    public boolean GetSeguro(){
        return Seguro;
    }

    public void setSeguro(boolean Seguro){
        this.Seguro = Seguro;

    }

     public String getEnfermedad(){
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad){
        this.Enfermedad = Enfermedad;

    }

    public double getPeso(){
        return Peso;
    }

    public void setPeso(double Peso){
        this.Peso = Peso;
    }

     public double getAltura(){
        return Altura;
    }

    public void setAltura(double Altura){
        this.Altura = Altura;
    }

    







    
}
