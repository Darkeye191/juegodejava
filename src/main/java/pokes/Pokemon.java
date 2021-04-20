package pokes;
import  java.util.ArrayList;

/**
 * Clase de tipo Pokemon de la cual heredaran las clases anexas
 */
public class Pokemon {

    String  nombre;
    String  tipo;
    String  estado;
    String  estadoCombate;
    double   puntosDeVida;
    double   puntosDeAtaque;
    double   puntosDeDefensa;
    double   velocidad;

    ArrayList<String> nombresDeAtaques;

    /**
     * Metodo constructor, no recibe parametros
     */
    public Pokemon(){
        nombresDeAtaques = new ArrayList<String>();
    }

    /**
     * Metodo que permite obtener el nombre del Pokemon
     * @return String con el contenido de nombre
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Metodo que permite obtener el tipo del Pokemoon
     * @return String con el contenido de tipo
     */
    public String getTipo(){
        return this.tipo;
    }

    /**
     * Metodo que permite optener el estado del Pokemon
     * @return String con el contenido de estado
     */
    public String getEstado(){
        return this.estado;
    }

    /**
     * Metodo que permite obtener los puntos de vida del Pokemon
     * @return double con el contenido de puntos de vida
     */
    public double getPuntosDeVida(){
        return this.puntosDeVida;
    }

    /**
     * Metodo que permite obtener los puntos de ataque del Pokemon
     * @return double con el contenido de puntos de ataque
     */
    public double getPuntosDeAtaque(){
        return this.puntosDeAtaque;
    }

    /**
     * Metodo que permite obtener los puntos de defensa del Pokemon
     * @return double con el contenido de puntos de defensa
     */
    public double getPuntosDeDefensa(){
        return this.puntosDeDefensa;
    }

    /**
     * Metodo que permite obtener la velocidad del pokemon
     * @return double con el contenido de velocidad
     */
    public double getVelocidad(){
        return this.velocidad;
    }

    /**
     * Metodo que devuelve el nombre del ataque
     * @param posicion int para conocer el indice del arreglo
     * @return String con el contenido del indice del arregl0
     */
    public String getNombreAtaque(int posicion){
        return this.nombresDeAtaques.get(posicion);
    }

    /**
     * Metodo que setea el nombre del Pokemon
     * @param nombre Recibe Sstring con el contenido de nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo que setea el estado del Pokemon
     * @param estado Recibe String con el contenido de estado
     */
    public void setEstado(String estado){
        this.estado = estado;
    }

    /**
     * Metodo que setea los puntos de vida del Pokemon
     * @param puntosDeVida Recibe double con el contenido de puntos de vida
     */
    public void setPuntosDeVida(double puntosDeVida){
        if (puntosDeVida < 0)
            this.puntosDeVida = 0;
        else
            this.puntosDeVida = puntosDeVida;
    }

    /**
     * Metodo que seteea los puntos de ataque del Pokemon
     * @param puntosDeAtaque Recibe double con el contenido de puntos de ataque
     */
    public void setPuntosDeAtaque(double puntosDeAtaque){
        this.puntosDeAtaque = puntosDeAtaque;
    }

    /**
     * Metodo que setea los puntos de defensa del Pokemon
     * @param puntosDeDefensa Recibe double con el contenido de puntos de defensa
     */
    public void setPuntosDeDefensa(double puntosDeDefensa){
        this.puntosDeDefensa = puntosDeDefensa;
    }

    /**
     * Metodo que setea la velocidad del Pokemon
     * @param velocidad Recibe double con el contenido de velocidad
     */
    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    /**
     * Metodo que permite calcular el multiplicador elemental del Pokemon con base en su tipo
     * @param tipo Recibe String con el contenido de tipo de Pokemon
     * @param tipoRival Recibe String con el contenido del tipo de Pokemon contrincante
     * @return Devuelve un double con el resultado del multiplicador
     */
    public double multiplicadorElemental(String tipo, String tipoRival){
        if ( tipo.equals("Fuego") ){
            if ( tipoRival.equals("Hierba") )
                return 2;
            else if ( tipoRival.equals("Agua") || tipoRival.equals("Fuego") )
                return 0.5;
            else if ( tipoRival.equals("Electrico") )
                return 1;
        }
        else if ( tipo.equals("Agua")){
            if ( tipoRival.equals("Fuego") )
                return 2;
            else if ( tipoRival.equals("Agua") || tipoRival.equals("Hierba") )
                return 0.5;
            else if ( tipoRival.equals("Electrico") )
                return 1;
        }
        else if ( tipo.equals("Hierba")){
            if ( tipoRival.equals("Agua") )
                return 2;
            else if ( tipoRival.equals("Fuego") || tipoRival.equals("Hierba") )
                return 0.5;
            else if ( tipoRival.equals("Electrico") )
                return 1;
        }
        else if ( tipo.equals("Electrico")){
            if ( tipoRival.equals("Agua") )
                return 2;
            else if ( tipoRival.equals("Electrico") || tipoRival.equals("Hierba") )
                return 0.5;
            else if ( tipoRival.equals("Fuego") )
                return 1;
        }

        // Si no se encuentra el tipo de pokemon del jugador actual o del rival,
        // entonces se envia un valor para identificar el error:
        return -1;

    }

    /**
     * Metodo que permite imprimir las estadisticas del Pokemon
     */
    public void estadisticas(){
        System.out.print("\n Pokemon:         " + this.getClass().getSimpleName());
        System.out.print("\n Nombre:          " + this.nombre);
        System.out.print("\n Tipo:            " + this.tipo);
        System.out.print("\n Estado:          " + this.estado);
        System.out.print("\n P. de vida:      " + this.puntosDeVida);
        System.out.print("\n P. de ataque:    " + this.puntosDeAtaque);
        System.out.print("\n P. de defensa:   " + this.puntosDeDefensa);
        System.out.print("\n P. de velocidad: " + this.velocidad);

    }

    /**
     * Metodo que permite realizar un tipo de ataque
     * @param defensaRival De tipo double contiene el valor de la defensa contraria
     * @return De tipo double, contiene la resta de ataque menos defensa rival
     */
    public double ataque(double defensaRival) {
        return (this.puntosDeAtaque - defensaRival);
    }

    /**
     * Metodo que realiza un tipo de ataque
     * @param defensaRival De tipo double contiene el valor de la defensa contrariav
     * @param tipoRival De tipo String contiene el tipo de Pokemon contrario
     * @return De tipo double, contiene la resta de ataque menos defensa rival, con el valor
     * del multiplicador
     */
    public double ataque(double defensaRival, String tipoRival) {       
        Pokemon pokemon = new Pokemon();

        return ( (this.puntosDeAtaque - defensaRival) * pokemon.multiplicadorElemental(this.tipo, tipoRival));
    }

}
