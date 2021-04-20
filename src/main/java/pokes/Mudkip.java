package pokes;

/**
 * Pokemon de tipo Mudkip
 * @author Erick y Uriel
 */
public class Mudkip extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Mudkip (){

        super.nombre          = "Mudkip";
        super.tipo            = "Agua";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);
        
        super.nombresDeAtaques.add("Bofetón lodo");
        super.nombresDeAtaques.add("Hidrobomba");
        super.nombresDeAtaques.add("Pistola agua");
        super.nombresDeAtaques.add("Venganza");
        super.nombresDeAtaques.add("Torbellino");
    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return super.nombre;
    }

}
