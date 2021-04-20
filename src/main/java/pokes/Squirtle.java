package pokes;

/**
 * Pokemon de tipo Squirtle
 * @author Erick y Uriel
 */
public class Squirtle extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Squirtle (){

        super.nombre          = "Squirtle";
        super.tipo            = "Agua";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Burbuja");
        super.nombresDeAtaques.add("Giro rápido");
        super.nombresDeAtaques.add("Hidrobomba");
        super.nombresDeAtaques.add("Hidropulso");
        super.nombresDeAtaques.add("Placaje");
    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return "Vamo a calmarno";
    }

}
