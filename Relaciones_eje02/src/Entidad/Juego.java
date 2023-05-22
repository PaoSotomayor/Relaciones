/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira el agua 
el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. 
Al final del juego, se debe mostrar que jugador se mojó.
 */
public class Juego {

    Scanner leer = new Scanner(System.in);
    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego() {
        System.out.println("---------Ruleta Rusa de Agua-----------");
        System.out.println("       ╾━╤デ╦︻(▀̿Ĺ̯▀̿ ̿)");
        System.out.println("---------------------------------------");
        System.out.println("Ingrese la cantidad de jugadores(1-6): ");
        int cant = leer.nextInt();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("  Comienza el juego!");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        while (cant > 6) {
            System.out.println("Error. Ingrese una opción válida (1-6): ");
            cant = leer.nextInt();
        }
        jugadores = new Jugador[(cant)];
        for (int i = 0; i < cant; i++) {

            System.out.println("Ingrese ID deljugador");
            Jugador j = new Jugador();
            j.setId(leer.nextInt());
            System.out.println("Ingrese el nombre del jugador");
            j.setNombre(leer.next());
            jugadores[i] = new Jugador(j.getId(), j.getNombre());
            System.out.println(j);
        }
        revolver = new Revolver();

    }

    public boolean finaldeJuego() {
        for (Jugador jug : jugadores) {
            if (jug.ismojado()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jug2 : jugadores) {
            jug2.disparo(revolver);
            if (!jug2.ismojado()) {
                break;
            }
        }
    }
}
