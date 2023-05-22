/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;
import java.util.Random;

/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición del tambor que se dispara, puede que esté el 
agua o no) y posición agua (la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:

 */
public class Revolver {

    private int posicionAgua;
    private int posicionActual;
    private Random rnd = new Random();

    public Revolver() {
    }

    public Revolver(int posicionAgua, int posicionActual) {
        this.posicionAgua = posicionAgua;
        this.posicionActual = posicionActual;

//        this.posicionAgua =   1+rnd.nextInt(20);
//        this.posicionActual =  1+rnd.nextInt(20);
//        this.posicionAgua = (int) (Math.random()*10);
//        this.posicionActual = (int) (Math.random()*10);
    }

    public void llenarRevolver() {

        posicionActual = 1;
        posicionAgua = (int) 1 + rnd.nextInt(6 - 1);
        System.out.println(posicionActual + posicionAgua + "");
    }

    public Boolean mojar() {
        boolean mojado = false;
        if (posicionActual == posicionAgua) {
            mojado = true;
        }
        siguienteChorro();
        return mojado;
    }

    public void siguienteChorro() {
        posicionActual++;
    }

    @Override
    public String toString() {
        return "Posición Actual " + posicionActual + " Posición Agua " + posicionAgua;
    }

}
