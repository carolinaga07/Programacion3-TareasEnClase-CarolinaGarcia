package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el indice:");
        Double indice = sc.nextDouble();

        try{
            ValidarEstudiante(nombre, edad, indice);
            System.out.println("Estudiante registrado correctamente");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Validacion de estudiante");
        }



    }

    public static void ValidarEstudiante(String nombre, int edad, double indice) throws Exception{
        
        if (nombre.isEmpty()){
            throw new Exception("Error: El nombre no puede estar vacio");
        }
        System.out.println("Nombre Valido.");


        if (edad < 18 || edad > 100){
            throw new Exception(" Error: La edad debe ser mayor o igual a 18 anios");
        }
        System.out.println("Edad Valida.");

        if (indice < 0.0 || indice > 4.0){
            throw new Exception("Error: El indice debe estar entre 0 y 4");
        }


    }

   
    
   
}
