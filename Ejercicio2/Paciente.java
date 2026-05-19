package Ejercicio2;

public class Paciente {

    private String Nombre;
    private int Edad;
    private String Cedula;
    private String Enfermedad;
    private double Peso;
    private Double Altura;


    public Paciente (String nombre, int edad, String cedula, String enfermedad, double peso, double altura){
        this.Cedula = cedula;
        this.Edad = edad;
        this.Enfermedad = enfermedad;
        this.Nombre = nombre;
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

    public double CalcularIMC(){
        return Peso / (Altura * Altura);
    }

    public void Clasificar(){
        double imc = CalcularIMC();

        if(imc < 18.5){
            System.out.println("Peso Bajo");
        }
        if(imc < 25.0){
            System.out.println("Peso Normal");
        }
        System.out.println("Sobrepeso");

    }

    public void informacionPaciente(){
    System.out.println("======================");
    System.out.println("  DATOS DEL PACIENTE  ");
    System.out.println("======================");
    System.out.println(    "Nombre: " + getNombre());
    System.out.println(    "Edad: " + getEdad());
    System.out.println(    "Cedula: " + getCedula());
    System.out.println(    "Enfermedad: " + getEnfermedad());
    System.out.println("======================");
    }







    
}
