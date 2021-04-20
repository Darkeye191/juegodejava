package pokes;

/**
 * Pokemon de tipo Treecko
 */
public class Treecko extends Pokemon {

    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Treecko (){

        super.nombre          = "Treecko";
        super.tipo            = "Hierba";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Ataque rápido");
        super.nombresDeAtaques.add("Energibola");
        super.nombresDeAtaques.add("Gigadrenado");
        super.nombresDeAtaques.add("Malicioso");
        super.nombresDeAtaques.add("Persecución");

    }

    /**
     * Metodo que devuelve el nombre del poke
     * @return String con el nommbre del poke
     */
    public String apodo(){
        return super.nombre;
    }

}
