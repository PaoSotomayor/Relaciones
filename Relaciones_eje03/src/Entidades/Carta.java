/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Enums.Numero;
import Enums.Palo;

/**
 *
 * @author user
 */
public class Carta {
    private Numero numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

//    public Palo getPalo() {
//        return palo;
//    }
//
//    public void setPalo(Palo palo) {
//        this.palo = palo;
//    }

    @Override
    public String toString() {
        return  "Número= " + numero + ", Palo= " + palo;
    }
    
    
}
