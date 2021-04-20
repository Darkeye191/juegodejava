package pokes;

/**
 * Pokemon de tipo charmander
 * @author Erick y Uriel
 */
public class Charmander extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Charmander (){
        super.nombre          = "Charmander";
        super.tipo            = "Fuego";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Arañazo");
        super.nombresDeAtaques.add("Furia dragon");
        super.nombresDeAtaques.add("Infierno");
        super.nombresDeAtaques.add("Lanzallamas");
        super.nombresDeAtaques.add("Pantalla de humo");

    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con nombre del poke
     */
    public String apodo(){
        return super.nombre;
    }

}
