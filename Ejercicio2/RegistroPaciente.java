package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroPaciente  {

   public static void Ejecutar (Scanner sc){
        ArrayList<Paciente> lista = new ArrayList<>();
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
                System.out.println("Nombre:");
                String nombre = sc.nextLine();

                System.out.println("Cantidad:");
                int cantidad = sc.nextInt();

                System.out.println("Precio:");
                double precio = sc.nextDouble();

                lista.add(new Paciente());
                System.out.println("Producto Agregado"); 

                break;
            case 5:
                if(lista.isEmpty()){
                    System.out.println("no hay productos"); 
                }
                else{
                    for(int i = 0; i < lista.size(); i++){
                        Productos p = lista.get(i);
                        System.out.println("." + p.getNombre() + "|" + p.getCantidad() + "|" + p.getPrecio()); 
                    }
                }
                break;

         }

        }while (opcion != 6);
    }   
    
}
    

