/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relaciones_eje03;

import Entidades.Baraja;
import java.util.Scanner;

/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo. 

La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que 
las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no 
mostrara esa primera carta.
 */
public class Relaciones_eje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   Baraja mazo = new Baraja();
        mazo.crearBaraja();
        int op;
        System.out.println("        _             _                                 _     \n" +
"  _ __ | | __ _ _   _(_)_ __   __ _    ___ __ _ _ __ __| |___ \n" +
" | '_ \\| |/ _` | | | | | '_ \\ / _` |  / __/ _` | '__/ _` / __|\n" +
" | |_) | | (_| | |_| | | | | | (_| | | (_| (_| | | | (_| \\__ \\\n" +
" | .__/|_|\\__,_|\\__, |_|_| |_|\\__, |  \\___\\__,_|_|  \\__,_|___/\n" +
" |_|            |___/         |___/");
        do {
            System.out.println("-----MENU-----");
            System.out.println("1- Barajar");
            System.out.println("2- Disponibles");
            System.out.println("3- Dar cartas");
            System.out.println("4- Eliminadas");
            System.out.println("5- Mostrar mazo");
            System.out.println("6- Siguiente carta");
            System.out.println("7- SALIR");
            System.out.println("-----------------");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Mezclando cartas");
                    mazo.barajar();
                    break;
                case 2:
                    mazo.cartasDisponibles();
                    break;
                case 3:
                    mazo.darCartas(op);
                    break;
                case 4:
                    mazo.cartasMonton();
                    break;
                case 5:
                    mazo.mostrarBaraja();
                    break;
                case 6:
                    mazo.siguienteCarta();
                    break;
                case 7:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (op !=7);
    }

}
