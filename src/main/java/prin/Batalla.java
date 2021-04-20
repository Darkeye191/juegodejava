package prin;

import java.util.LinkedList;
import java.util.Scanner;
import pokes.Bulbasaur;
import pokes.Charmander;
import pokes.Chikorita;
import pokes.Chimchar;
import pokes.Cyndaquil;
import pokes.Electrike;
import pokes.Mudkip;
import pokes.Pikachu;
import pokes.Pokemon;
import pokes.Shinx;
import pokes.Squirtle;
import pokes.Totodile;
import pokes.Treecko;

/**
 *Clase de tipo Batalla, aloja los metodos para un correcto control de la batalla
 * @author Erick y Uriel
 */
public class Batalla {
    Scanner teclado = new Scanner(System.in);
    
    /**
     * Metodo que permite asignar pokemones a los jugadores de manera aleatoria
     * @param jugador1 Recibe un parametro de tipo Jugador
     * @param jugador2 parametro de tipo jugador
     */
    public static void asignaPokes(Jugador jugador1, Jugador jugador2){
        LinkedList<Pokemon> listaaux = new LinkedList<>();
        listaaux.add(new Bulbasaur());
        listaaux.add(new Charmander());
        listaaux.add(new Chikorita());
        listaaux.add(new Chimchar());
        listaaux.add(new Cyndaquil());
        listaaux.add(new Electrike());
        listaaux.add(new Mudkip());
        listaaux.add(new Pikachu());
        listaaux.add(new Shinx());
        listaaux.add(new Squirtle());
        listaaux.add(new Totodile());
        listaaux.add(new Treecko());
                       
        LinkedList<Pokemon> lista = new LinkedList<>();
        
        for (int i = 0; i < 6; i++) {
            int aux = (int) Math.random()*12+1;
            lista.add(listaaux.get(aux));
            listaaux.remove(aux);
        }
        
        jugador1.setListaPokes(lista);
        jugador2.setListaPokes(listaaux);
    }
    
    /**
     * Metodo que permite adignar pociones a los jugadores
     * @param jugador1 Recibe un parametro de tipo Jugador
     * @param jugador2 Recibe un parametro de tipo Jugador
     */
    public static void asignaPociones(Jugador jugador1, Jugador jugador2){
        LinkedList<Pocion> posiones = new LinkedList<>();
        Pocion vida = new Pocion("vida");
        Pocion ataque = new Pocion("ataque");
        Pocion defensa = new Pocion("defensa");
        posiones.add(vida);
        posiones.add(vida);
        posiones.add(ataque);
        posiones.add(ataque);
        posiones.add(defensa);
        posiones.add(defensa);
        
        jugador1.setListaPociones(posiones);
        jugador2.setListaPociones(posiones);
    }    
}
