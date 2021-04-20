package pokes;

/**
 * Pokemon de tipo Pikachu
 * @author Erick y Uriel
 */
public class Pikachu extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Pikachu (){
        super.nombre          = "Pikachu";
        super.tipo            = "Electrico";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Ataque rápido");
        super.nombresDeAtaques.add("Cola férrea");
        super.nombresDeAtaques.add("Impactrueno");
        super.nombresDeAtaques.add("Pantalla de luz");
        super.nombresDeAtaques.add("Tacleada de voltios");
    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return "mostaza";
    }
}
