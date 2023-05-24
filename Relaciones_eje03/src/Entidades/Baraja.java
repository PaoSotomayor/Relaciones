/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Numero;
import Enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Baraja {

    Scanner leer = new Scanner(System.in);

    private ArrayList<Carta> mazo;
    private ArrayList<Carta> repartidas = new ArrayList<Carta>();

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public Baraja() {
        this.mazo = new ArrayList();
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public void crearBaraja() {
        for (Numero num_aux : Numero.values()) {
            for (Palo palo_aux : Palo.values()) {
                this.mazo.add(new Carta(num_aux, palo_aux));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(this.mazo);
        System.out.println("Mezclando cartas");
        for (Carta carta_aux : mazo) {
            System.out.println(carta_aux.toString());

        }
    }

    public void siguienteCarta() {
        if (mazo.isEmpty()) {
            System.out.println("No quedan cartas en el mazo");
        } else {
            Carta siguienteC = this.mazo.get(0);
            this.repartidas.add(siguienteC);
            this.mazo.remove(0);
            System.out.println("Su carta es: " + siguienteC);

        }

    }

    public int cartasDisponibles() {
        System.out.println("Cartas disponibles: " + mazo.size());
        return this.mazo.size();

    }

    public void darCartas(int cant) { 
        System.out.println("Cuántas cartas quiere?");
        cant = leer.nextInt();
        if (cant <= this.mazo.size()) {

            for (int i = 0; i < cant; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("Las cartas solicitadas exceden a las que hay disponibles");
        }
        

    }

    public void cartasMonton() {
        if (this.repartidas.isEmpty()) {
            System.out.println("No hay cartas en el mazo");
        } else {
            System.out.println("Las siguientes cartas son: ");
            for (Carta carta_aux : this.mazo) {
                System.out.println(carta_aux);
            }

        }

    }

    public void mostrarBaraja() {
        System.out.println("El mazo es: ");
        for (Carta carta_aux : mazo) {
              System.out.println(carta_aux.toString());

        }
    }
}
