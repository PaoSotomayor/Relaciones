/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PerrosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> perrosA = new ArrayList();
    String op;
    public void CrearPerro() {
        
        do {
            Perro perros = new Perro();
            System.out.println("Ingrese el nombre del perro: ");
            perros.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro: ");
            perros.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro: ");
            perros.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamanio del perro: ");
            perros.setTamanio(leer.next());
            perrosA.add(perros);
            System.out.println("Desea ingresar otro perro? (s/n): ");
            op = leer.next();

        } while (op.equalsIgnoreCase("s"));

    }
    public void mostrarPerros() {

        perrosA.forEach((aux_2) -> System.out.println(aux_2));

    }
    public void elegirPerro() {
         System.out.println("Ingrese el nombre del perro que desea adoptar: ");
        String op = leer.next();
    }
}
