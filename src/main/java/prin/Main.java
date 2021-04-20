package prin;

import java.util.Scanner;

/**
 * Clase principal
 * @author Erick y Uriel
 */
public class Main {
    public static void main(String[] args) {      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvendos a el juego");
        System.out.println("Jugador 1, introduce tu nombre");
        Jugador jugador1 = new Jugador(teclado.nextLine());
        System.out.println("Jugador 2, introduce tu nombre");
        Jugador jugador2 = new Jugador(teclado.nextLine());
                        
        Batalla.asignaPokes(jugador1, jugador2);
        Batalla.asignaPociones(jugador1, jugador2);
               
        jugador1.listarPokes();
        jugador2.listarPokes();
                                
        jugador1.elegirPoke();
        jugador2.elegirPoke();
        
        Turno turno1 = new Turno(jugador1, jugador2);
        turno1.inicia();

        int bandera = 0;
        while (bandera == 0){
            Turno turno2 = new Turno(jugador1, jugador2);
            bandera=turno2.inicia(2);
        }
        if (bandera == 1){
            System.out.println("Gana "+jugador2.getNombre());
        }
        if (bandera == 2){
            System.out.println("Gana "+jugador1.getNombre());
        }
        System.out.println("Gracias por jugar");
        
    }
}
