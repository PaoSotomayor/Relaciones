/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;
import java.util.Scanner;

import Enums.Peliculas;
/**
 *
 * @author user
 */
public class Pelicula {
    private String titulo, director;
    private int duracion;
    private int edadmin ;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int EdadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadmin = EdadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }

    @Override
    public String toString() {
        return "La peli" + titulo + ", dirigida por: " + director + ", dura" + duracion + " hs , apta para mayores de: " + edadmin ;
    }


}
    


