package prin;

import java.util.LinkedList;
import java.util.Scanner;
import pokes.Pokemon;

/**
 * Clase que permite crear Jugadores
 * @author erick
 */
public class Jugador {
    private String nombre;
    private LinkedList<Pokemon> listaPokes;
    private LinkedList<Pocion> listaPociones;
    Scanner teclado = new Scanner(System.in);
    
    public Jugador(String nombre){
        this.nombre=nombre;
    }
    
    
   /**
    * Metodo que permite obtener el contenido de la variable nombre
    * @return Devuelve el nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite asignar contenido a la variable nombre
     * @param nombre asigna el contenido de nombre en nombree
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que permite obtener la lista de Pokemones
     * @return Lista de pokes
     */
    public LinkedList<Pokemon> getListaPokes() {
        return listaPokes;
    }

    /**
     * Metodo que permite setear la lsita de Pokemones al jugador
     * @param listaPokes Recibe LinkedList de Pokemones
     */
    public void setListaPokes(LinkedList<Pokemon> listaPokes) {
        this.listaPokes = listaPokes;
    }

    /**
     * Metodo que permite obtener la lista de Pokemones del jugador
     * @return Devuelve una LinkedList con los Pokemones del jugador
     */
    public LinkedList<Pocion> getListaPociones() {
        return listaPociones;
    }

    /**
     * Metodo que setea la lista de Pociones del jugador
     * @param listaPociones Reciibe una LinkedList con las Pociones del jugador
     */
    public void setListaPociones(LinkedList<Pocion> listaPociones) {
        this.listaPociones = listaPociones;
    }

    /**
     * Metodo que permite escoger al pokemon que ira a batalla
     */
    public void elegirPoke(){
        System.out.println(nombre+" con que pokemon vas a jugar?");
        for (int i = 1; i <= listaPokes.size(); i++) {
            System.out.println(i + " -> "+ listaPokes.get(i-1).getNombre());
        }
        System.out.println("Introduce el numero del poke");
        int opcion = teclado.nextInt();
        if(opcion > 0 && opcion <= listaPokes.size()){
            Pokemon aux = listaPokes.get(opcion-1);
            listaPokes.remove(opcion-1);
            listaPokes.addFirst(aux);
        }else{
            System.out.println("Error al elegir poke");
        }

    }

    /**
     * Metodo que permite usar una pocion en el pokemon
     */
    public void usarPocion(){
        System.out.println("Tienes las siguientes pociones: ");
        for (int i = 0; i < listaPociones.size(); i++) {
            System.out.println((i+1)+" -> "+listaPociones.get(i).getTipo());
        }
        System.out.println("Cual usaras?");
        int op = teclado.nextInt();
        if (op > 0 && op <= listaPociones.size()){
            listaPokes.element().setPuntosDeAtaque(listaPokes.element().getPuntosDeAtaque()+listaPociones.get(op-1).getAtaque());
            listaPokes.element().setPuntosDeVida(listaPokes.element().getPuntosDeVida()+listaPociones.get(op-1).getVida());
            listaPokes.element().setPuntosDeDefensa(listaPokes.element().getPuntosDeDefensa()+listaPociones.get(op-1).getDefensa());
            listaPociones.remove(op-1);
        }else{
            System.out.println("Error al elegir pocion");
        }
    }

    /**
     * Metodo que imprime los pokemones vivos del jugador
     */
    public void listarPokes(){
        System.out.println(nombre+ " tiene");
        
        System.out.println("\tPokemones");
        for (Pokemon listaPoke : listaPokes) {
            System.out.print(listaPoke.getNombre()+" ");
        }
        System.out.println("");
        System.out.println("\tPociones");
        for (Pocion listaPoke : listaPociones) {
            System.out.print(listaPoke.getTipo()+" ");
        }
        System.out.println("\n\n");
    }
    
}


