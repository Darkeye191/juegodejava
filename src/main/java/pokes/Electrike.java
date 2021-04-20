package pokes;

/**
 * Pokemon de tipo Electrike
 * @author Erick y Uriel
 */
public class Electrike extends Pokemon {

    public Electrike (){

        super.nombre          = "Electrike";
        super.tipo            = "Electrico";
        super.estado          = "Disponible";
        super.estadoCombate   = "Sano";
        super.puntosDeVida    = (Math.random()*(250-150)+150);
        super.puntosDeAtaque  = (Math.random()*(200-150)+150);
        super.puntosDeDefensa = (Math.random()*(200-150)+150);
        super.velocidad       = (Math.random()*(200-100)+100);

        super.nombresDeAtaques.add("Ataque rápido");
        super.nombresDeAtaques.add("Colmillo rayo");
        super.nombresDeAtaques.add("Onda trueno");
        super.nombresDeAtaques.add("Rugido");
        super.nombresDeAtaques.add("Trueno");

    }

    public String apodo(){
        return super.nombre;
    }

}
