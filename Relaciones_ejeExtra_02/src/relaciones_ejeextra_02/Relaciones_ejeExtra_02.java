/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relaciones_ejeextra_02;

import Entidades.Cine;
import Entidades.Pelicula;
import Enums.Peliculas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Relaciones_ejeExtra_02 {
    Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {

       Cine c1 = new Cine();
       Pelicula peli = new Pelicula();
        System.out.println(" ");
    

        c1.mostrarPeli();
        System.out.println("    ___      \n" +
"   (o o)     \n" +
"ooO-(_)- Ooo");
       
       c1.CargarDatos();
      
       c1.Llenarcine();
         System.out.println("Espectadores en el cine");
    }
}
   
   

