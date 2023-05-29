/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;



import java.util.Random;

/**
 *
 * @author user
 */

public enum Peliculas {
    
    DONTLOOKUP("Don't look up!", 2, "Adam McKay", 17),
    PARASITE("Parasite", 2, "Bong Joon-ho", 13),
    MYOCTOPUSTEACHER("My Octopus Teacher", 1.5, "James Reed", 1),
    LASIRENITA("La Sirenita", 2, "Rob Marshall", 1),
    XMEN("X-men", 2.5, "Bryan Singer", 18);

    

    private String titulo;
    private Double duracion;
    private String director;
    private int EdadMinima;
    private static final Random r = new Random();



    private Peliculas(String titulo, Double duracion, String director, int EdadMinima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.EdadMinima = (int) EdadMinima;
    }

    private Peliculas(String titulo, int duracion, String director, int EdadMinima) {
        this.titulo = titulo;
        this.duracion = (double) duracion;
        this.director = director;
        this.EdadMinima = (int) EdadMinima;
        
    }
        public String getTitulo() {
        return titulo;
    }

    public int getEdadMinima() {
        return EdadMinima;
    }

    @Override
    public String toString() {
        return  titulo + " -> Duración: " +duracion + " hs."+ " Director: " + director
                + " Edad Minima= " + EdadMinima;
    }


//        private Peliculas randomPeliculas() {
//        //Random r = new Random();
//        int movie = new Random().nextInt(Peliculas.values().length); 
//        return Peliculas.values()[movie];
//        }
//       private static final List<Peliculas> VALUES =
//    Collections.unmodifiableList(Arrays.asList(values()));
//  private static final int SIZE = VALUES.size();
//  private static final Random RANDOM = new Random();
//
//  public static Peliculas randomPelis()  {
//    return VALUES.get(RANDOM.nextInt(SIZE));
//  }
//        private static final RandomEnum<Peliculas> r =
//        new RandomEnum<Peliculas>(Peliculas.class);
//
//   
//
//    private static class RandomEnum<E extends Enum<E>> {
//
//        private static final Random RND = new Random();
//        private final E[] values;
//
//        public RandomEnum(Class<E> token) {
//            values = token.getEnumConstants();
//        }
//
//        public E random() {
//            return values[RND.nextInt(values.length)];
//        }
//    }
// public static Peliculas generateRandomMovie() {
//            Peliculas[] values = Peliculas.values();
//            int length = values.length;
//            int randIndex = new Random().nextInt(length);
//            return values[randIndex];
//        }
//     private static final Peliculas[] VALUES = values();
//	private static final int SIZE = VALUES.length;
//	private static final Random RANDOM = new Random();
//
//	public static Peliculas getRandomPelis() {
//		return VALUES[RANDOM.nextInt(SIZE)];
//	}
}
    

    

   


