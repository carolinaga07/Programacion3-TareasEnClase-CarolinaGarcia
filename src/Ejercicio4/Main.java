package Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        File Lista = new File("estudiante.txt");
        

        int opcion;

        do {

            System.out.println("============================");
            System.out.println( "  REGISTRO DE ESTUDIANTE   ");
            System.out.println("============================");
            System.out.println(" 1. Agregar estudiante ");
            System.out.println(" 2. Mostrar estudiante");
            System.out.println(" 3. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try{
                    FileWriter fw = new FileWriter("estudiante.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    String nombre = sc.nextLine();
                    bw.write(nombre);
                    bw.newLine();
                    bw.close();

                    }
                    catch(IOException e){
                        System.out.println(" hay un problema...");
                    }
                    break;
                case 2:
                    try{
                    FileReader read = new FileReader("estudiante.txt");
                    String linea;

                    BufferedReader buffer = new BufferedReader(read);
                    while ((linea = buffer.readLine()) != null) {
                        System.out.println(linea);
                        
                    }
                    buffer.close();
                
                    }
                    catch (Exception e){
                        System.out.println(" Anda algo mal");
                    }
                    break;
                
                case 3: 
                   System.out.println("Saliendo..");
                  break;
            
                default:
                    System.out.println("Opcion invalida");
                    break;
            }



        }while(opcion != 3);
    }

}