package relaciones_ejeextra01;

import Servicio.PersonaServicio;
import java.util.Scanner;

/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a tener que contar con muchas personas y 
muchos perros. 
El programa deberá preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar al mismo perro, 
si la persona eligió un perro que ya estaba adoptado, se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las personas con sus respectivos perros.
 */
public class Relaciones_ejeExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio per1 = new PersonaServicio();

        per1.listadoAdoptantes();
        
        per1.CrearPersona(0);
       
        per1.listadoPerrosaAdoptar();

        per1.CrearPerro();
        System.out.println("--------------------------------");
        System.out.println("Personas que desean adoptar: ");
        System.out.println("--------------------------------");
        per1.mostrarPersonas();
        System.out.println("--------------------------------------");
        System.out.println("Perritos que quieren ser adoptados");
        System.out.println("--------------------------------------");
        per1.mostrarPerros();

        per1.adoptarPerro();
        per1.mostrarAdopciones();

    }

}
