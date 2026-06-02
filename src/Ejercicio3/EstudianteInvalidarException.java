package Ejercicio3;

public class EstudianteInvalidarException extends Exception {

    public EstudianteInvalidarException(String message) {
        super(message);
    }

    public static void ValidarEstudiante(String nombre, int edad, double indice) throws EstudianteInvalidarException{
        
        if (nombre.isEmpty()){
            throw new EstudianteInvalidarException("Error: El nombre no puede estar vacio");
        }
        System.out.println("Nombre Valido.");


        if (edad < 18 || edad > 100){
            throw new EstudianteInvalidarException(" Error: La edad debe ser mayor o igual a 18 anios");
        }
        System.out.println("Edad Valida.");

        if (indice < 0.0 || indice > 4.0){
            throw new EstudianteInvalidarException("Error: El indice debe estar entre 0 y 4");
        }


    }

    
}
