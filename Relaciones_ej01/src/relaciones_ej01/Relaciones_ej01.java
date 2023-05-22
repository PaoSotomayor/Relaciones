/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relaciones_ej01;

import Entidad.Perro;
import Entidad.Persona;


/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos clases. Perro, que tendrá como atributos: 
nombre, raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que pensar la lógica necesaria para asignarle a 
cada Persona un Perro y por ultimo, mostrar desde la clase Persona, la información del Perro y de la Persona
 */
public class Relaciones_ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op;

        Perro gu1 = new Perro("Bobby", "perro", 10, "mediano");
        Perro gu2 = new Perro("Mambo", "Pastor", 9, "grande");
        Persona p1 = new Persona("Leo", "Juarez", 45, 2433371, gu1);
        Persona p2 = new Persona("Andrea", "Perez", 21, 5454543, gu2);
        
        System.out.println(p1.toString() +"");

    }

}


