package pokes;

/**
 * Pokemon de tipo Chimchar
 * @author Erick y Uriel
 */
public class Chimchar extends Pokemon {   

    public Chimchar (){

        super.nombre          = "Chimchar";
        super.tipo            = "Fuego";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Arañazo");
        super.nombresDeAtaques.add("Golpes furia");
        super.nombresDeAtaques.add("Lanzallamas");
        super.nombresDeAtaques.add("Relajo");
        super.nombresDeAtaques.add("Rueda fuego");
    }

    public String apodo(){
        return super.nombre;
    }

}
