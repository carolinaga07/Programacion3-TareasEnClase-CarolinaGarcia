package Ejercicio2;

public class Paciente {

    private String Nombre;
    private int Edad;
    private String Cedula;
    private double Peso;
    private double Altura;


    public Paciente (String nombre, int edad, String cedula, double peso, double altura){
        this.Cedula = cedula;
        this.Edad = edad;
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

    public String Clasificar(){
        double imc = CalcularIMC();

        if(imc < 18.5){
            return"Peso Bajo";
        }
        if(imc < 25.0){
            return "Peso Normal";
        }
        return "Sobrepeso";

    }

    public void informacionPaciente(){
    System.out.println("======================");
    System.out.println("  DATOS DEL PACIENTE  ");
    System.out.println("======================");
    System.out.println(    "Nombre: " + getNombre());
    System.out.println(    "Edad: " + getEdad());
    System.out.println(    "Cedula: " + getCedula());
    System.out.println(    "Peso: " + getPeso());
    System.out.println(    "Altura: " + getAltura());
    System.out.printf(    "IMC: %.2f\n " , CalcularIMC());
    System.out.println(    "Diagnostico: " + Clasificar());
    System.out.println("======================");
    }







    
}
