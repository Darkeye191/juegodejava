package pokes;

/**
 * Pokemon de tipo chikorita
 * @author Erick y Uriel
 */
public class Chikorita extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Chikorita (){
        super.nombre          = "Chikorita";
        super.tipo            = "Hierba";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Aromaterapia");
        super.nombresDeAtaques.add("Hoja afilada");
        super.nombresDeAtaques.add("Látigo cepa");
        super.nombresDeAtaques.add("Rayo solar");
        super.nombresDeAtaques.add("Reflejo");

    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return "";
    }
}
