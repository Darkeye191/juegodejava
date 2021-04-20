package pokes;

/**
 * Pokemon de tipo Cyndaquil
 * @author Erick y Uriel
 */
public class Cyndaquil extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Cyndaquil (){

        super.nombre          = "Cyndaquil";
        super.tipo            = "Fuego";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Ataque rápido");
        super.nombresDeAtaques.add("Infierno");
        super.nombresDeAtaques.add("Lanzallamas");
        super.nombresDeAtaques.add("Llama final");
        super.nombresDeAtaques.add("Rueda fuego");
    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return super.nombre;
    }

}
