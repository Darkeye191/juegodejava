package pokes;

/**
 * Pokemon de tipo Shinx
 * @author Erick y Uriel
 */
public class Shinx extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Shinx (){

        super.nombre          = "Shinx";
        super.tipo            = "Electrico";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Cara susto");
        super.nombresDeAtaques.add("Chispa");
        super.nombresDeAtaques.add("Colmillo rayo");
        super.nombresDeAtaques.add("Rugido");
        super.nombresDeAtaques.add("Voltio cruel");
    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return super.nombre;
    }

}
