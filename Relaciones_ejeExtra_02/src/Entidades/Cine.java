/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Peliculas;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user
 */
public class Cine {
    private Peliculas edad_minima;
    private char sala[][];
    private double Precio;
    private Pelicula Peliculaactual;
    private ArrayList<Espectador> Espectadores;

    public Cine() {
    }

    public Cine(char sala[][], Double Precio, Pelicula Peliculaactual, ArrayList<Espectador> Espectadores) {
        this.sala = sala;
        this.Precio = Precio;
        this.Peliculaactual = Peliculaactual;
        this.Espectadores = Espectadores;
       
        
    }
    public void carcarPelis() {
       
    }

    public void CargarDatos() {
        //Espectadores
        Espectadores = new ArrayList();
        Espectador e1 = new Espectador("José", 18, 10.00);
        Espectador e2 = new Espectador("Manuela", 37, 10.00);
        Espectador e3 = new Espectador("Tito", 19, 5.00);
        Espectador e4 = new Espectador("Maria", 50, 10.00);
        Espectador e5 = new Espectador("Daniela", 23, 8);
        Espectador e6 = new Espectador("Miguel", 67, 22);
        Espectador e7 = new Espectador("Cacho", 32, 12);
        Espectadores.add(e1);
        Espectadores.add(e2);
        Espectadores.add(e3);
        Espectadores.add(e4);
        Espectadores.add(e5);
        Espectadores.add(e6);
        Espectadores.add(e7);

        Pelicula p1 = new Pelicula();
        Peliculaactual = p1;
    }

    public void Llenarcine() {
 this.edad_minima = edad_minima;
        this.Precio = 10.00;
        int n = 6;
        int m = 8;
        
        sala = new char[n][m];
        for ( int i = 0; i < n; i++) {
            for (int  j = 0; j < m; j++) {
                sala[i][j] = ' ';

            }

        }
        System.out.println(" SALA VACIA");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println(" ");
        }
        Boolean asiento = true;
        System.out.println(" ");
        System.out.println("ESPECTADORES");
        for (Espectador es : Espectadores) {            
                if (es.getDinero() >= this.Precio && Peliculaactual.getEdadMinima()< es.getEdad()) {
                  
                    
                   
                    System.out.println(es);
                    do {
                    int i = (int) (Math.random() * 6);
                     int j = (int) (Math.random() * 8);
                            
                        System.out.println((i+1)+" "+(j+1));
                        //System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
                        
                    if (sala[i][j] == ' ') {
                        sala[i][j] = 'x';
                       
                        asiento= false;
                    }
                } while (asiento=false);
               }

            
        }
        System.out.println(" ");
        System.out.println("    ___      \n" +
"   (o o)     \n" +
"ooO-(_)- Ooo");
        System.out.println(" SALA LLENA ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
    
    public void mostrarPeli() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            
            
        }
{
    Peliculas randomX = Peliculas.values()[random.nextInt(Peliculas.values().length)];
    
    System.out.println("En esta sala se proyecta: ");
    System.out.println(randomX);
}
    }
    

}
    

