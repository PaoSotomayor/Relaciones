/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;



/**
 *
 * @author user
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int eddad;
    private int documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int eddad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.eddad = eddad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEddad() {
        return eddad;
    }

    public void setEddad(int eddad) {
        this.eddad = eddad;
    }

    public int getDocumento() {
        return documento;

    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + ", edad= " + eddad + ", documento= " + documento ;
    }

    

}
