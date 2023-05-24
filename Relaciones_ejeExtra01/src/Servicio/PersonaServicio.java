/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personasA = new ArrayList();
    ArrayList<Perro> perrosA = new ArrayList();
    String op;

    public void listadoAdoptantes() {
        Persona pe1 = new Persona();
        Persona p1 = new Persona("Leo", "Juarez", 23, 12345, null);
        Persona p2 = new Persona("Leo", "Juarez", 23, 12345, null);
        Persona p3 = new Persona("Andrea", "Perez", 21, 5454543, null);
        Persona p4 = new Persona("Juan", "Lopez", 47, 1434243, null);
        Persona p5 = new Persona("Jimena", "Baez", 18, 13214243, null);
        personasA.add(p1);
        personasA.add(p2);
        personasA.add(p3);
        personasA.add(p4);
        personasA.add(p5);
        System.out.println("------------------------------");
        System.out.println("Listado de personas adoptantes:");
        System.out.println("------------------------------");

        personasA.forEach((aux) -> System.out.println(aux));
        System.out.println(" ");

    }

    public void CrearPersona(int cant) {
        do {
            System.out.println("Desea agregar otra persona al listado de  adoptantes? s/n: ");
            op = leer.next();
            while (op.equalsIgnoreCase("s")) {
                Persona pe1 = new Persona();

                System.out.println("Ingrese nombre de la persona");
                pe1.setNombre(leer.next());
                System.out.println("Ingrese apellido");
                pe1.setApellido(leer.next());
                System.out.println("Ingrese DNI");
                pe1.setDocumento(leer.nextInt());
                System.out.println("Ingrese la edad");
                pe1.setEddad(leer.nextInt());
                personasA.add(pe1);
                System.out.println("Desea ingresar otra persona?: ");
                op = leer.next();
                while (op == "n") {
                }
            }

        } while (op.equalsIgnoreCase("s"));

    }

    public void mostrarPersonas() {

        personasA.forEach((aux) -> System.out.println(aux));

    }

    public void listadoPerrosaAdoptar() {
        do {
            Perro perros = new Perro();
            Perro gu1 = new Perro("Bobby", "perro", 10, "mediano");
            Perro gu2 = new Perro("Mambo", "Pastor", 9, "grande");
            Perro gu3 = new Perro("Nikita", "OPastor", 11, "mediano");
            Perro gu4 = new Perro("Stumpa", "Husky", 3, "grande");
            Perro gu5 = new Perro("Kaahlisi", "perro", 5, "pequeño");
            Perro gu6 = new Perro("Fernando", "collie", 6, "grande");
            perrosA.add(gu1);
            perrosA.add(gu2);
            perrosA.add(gu3);
            perrosA.add(gu4);
            perrosA.add(gu5);
            perrosA.add(gu6);
            System.out.println("-----------------------------");
            System.out.println("Listado de perros en adopción:");
            System.out.println("-----------------------------");

            perrosA.forEach((aux) -> System.out.println(aux));
            System.out.println(" ");

        } while (op.equalsIgnoreCase("s"));

    }

    public void CrearPerro() {
        do {
            System.out.println("Desea agregar otro perro al listado de perros en adopción? (s/n): ");
            op = leer.next();
            while (op.equalsIgnoreCase("s")) {
                Perro perros = new Perro();
                System.out.println("Ingrese el nombre del perro: ");
                perros.setNombre(leer.next());
                System.out.println("Ingrese la raza del perro: ");
                perros.setRaza(leer.next());
                System.out.println("Ingrese la edad del perro: ");
                perros.setEdad(leer.nextInt());
                System.out.println("Ingrese el tamaño del perro: ");
                perros.setTamanio(leer.next());
                perrosA.add(perros);
                System.out.println("Desea ingresar otro perro? (s/n): ");
                op = leer.next();
                 while (op == "n") {
                }
            }

        } while (op.equalsIgnoreCase("s"));

    }

    public void mostrarPerros() {

        perrosA.forEach((aux_2) -> System.out.println(aux_2));

    }

    public void adoptarPerro() {
        String nmP;
        System.out.println(" ");
        System.out.println("Ingrese el nombre del adoptante: ");
        String nm = leer.next();

//        for (Persona adoptante : personasA) {
//            if (adoptante.getNombre().equalsIgnoreCase(nm)) {
        for (Iterator<Persona> iterator = personasA.iterator(); iterator.hasNext();) {
            Persona nextP = iterator.next();
            if (nextP.getNombre().equalsIgnoreCase(nm)) {
                iterator.remove();

            }

        }

        System.out.println("Ingrese el nombre del perro que desea adoptar: ");
        System.out.println(" ");
        this.mostrarPerros();
        nmP = leer.next();

        for (Iterator<Perro> iterator = perrosA.iterator(); iterator.hasNext();) {
            Perro next = iterator.next();
            if (next.getNombre().equalsIgnoreCase(nmP)) {
                //adoptante.setPerro(next);

                iterator.remove();
                System.out.println("------------------");
                System.out.println("Adopción exitosa!! ");
                System.out.println("------------------");
                System.out.println(" ,'.-.'. \n"
                        + "'\\~ o/` ,,\n"
                        + " { @ } f\n"
                        + " /`-'\\$ \n"
                        + "(_/-\\_) ");
                System.out.println(next +   " \n HA SIDO ADOPTADO POR " + nm);

            }
        }

    }

    public void mostrarAdopciones() {
        System.out.println("---------------------------------------------");
        System.out.println("Lista de perros que aún quedan por adoptar: ");
        System.out.println("---------------------------------------------");
        perrosA.forEach((aux_2) -> System.out.println(aux_2));
        System.out.println("---------------------------------------------");
        System.out.println("Lista de personas que aún quedan en condición de adoptantes: ");
        System.out.println("---------------------------------------------");
        personasA.forEach((aux) -> System.out.println(aux));
    }
}
