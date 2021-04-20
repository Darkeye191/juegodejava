package pokes;

/**
 * Pokemon de tipo Bulbasaur
 */
public class Bulbasaur extends Pokemon {
    
    
    
    /**
     * Inicia los atributos del pokemon
     * Agrega nombres de los ataques del pokemon
     */
    public Bulbasaur (){

        super.nombre          = "Bulbasaur";
        super.estado          = "Disponible";     
        super.estadoCombate   = "Sano";
        super.tipo            = "Hierba";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Hoja afilada");
        super.nombresDeAtaques.add("Latigazo");
        super.nombresDeAtaques.add("Látigo cepa");
        super.nombresDeAtaques.add("Megaagotar");
        super.nombresDeAtaques.add("Somnífero");

    }
    
    /**
     * 
     * @return Devuelve el apodo/nombre del pokemon
     */
    public String apodo(){
        return super.nombre;
    }

}
