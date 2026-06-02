package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroPaciente  {

   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Paciente> pacientes = new ArrayList<>();

        int opcion;
    

            do {

                System.out.println("===============================");
                System.out.println("      Registro De Paciente     ");
                System.out.println("===============================");
                System.out.println( "  1. Agregar Paciente");
                System.out.println( "  2. Mostrar informacion");
                System.out.println( "  3. Calcular IMC ");
                System.out.println( "  4. Determina el tipo de peso ");
                System.out.println( "  5. Mostrar todos los paciente registrados ");
                System.out.println( "  6. Salir");
                System.out.println("======================");
                System.out.println( "Seleccione una opcion:");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                
                    case 1:
                        System.out.println("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.println("Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Cedula: ");
                        String cedula = sc.nextLine();

                        System.out.println("Peso en kilogramos: ");
                        double peso = sc.nextDouble();

                        System.out.println("Altura en metros: ");
                        double altura = sc.nextDouble();

                        sc.nextLine();

                        Paciente nuevo = new Paciente(nombre, edad, cedula, peso, altura);
                        pacientes.add(nuevo);

                        System.out.println("Paciente Registrado");
                        break;

                    case 2:

                        for(int i = 0; i < pacientes.size(); i++){
                            System.out.println("Paciente numero:" + (i + 1));

                            pacientes.get(i).informacionPaciente();
                        }
                        break;
                    case 3:
                         
                           for(int i = 0; i < pacientes.size(); i++){
                            System.out.println(pacientes.get(i).getNombre() 
                            + " IMC: " 
                            + pacientes.get(i).CalcularIMC());  
                         }

                         break;
                    case 4:
                            for(int i = 0; i < pacientes.size(); i++){
                            System.out.println(pacientes.get(i).getNombre()  
                            + " esta en: " 
                            + pacientes.get(i).Clasificar());  
                        }

                        break;
                    case 5:

                         for(int i = 0; i < pacientes.size(); i++){
                            System.out.println("Paciente numero:" + (i + 1));

                            pacientes.get(i).informacionPaciente();
                        }

                        break;
                    case 6:

                        System.out.println("Saliendo...");
                        break;

                    default:
                         
                            System.out.println("Opcion invalida");
                    }
            }while(opcion != 6);
        }
    }                         
                        
      
      
    

    

