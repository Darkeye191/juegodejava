/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

/**
 * Clase que peremite crear Pociones
 * @author erick
 */
public class Pocion {
    private String tipo;
    private double vida;
    private double ataque;
    private double defensa;

    /**
     * Metodo constructor
     * @param tipo String con el contenido de tipo
     */
    public Pocion(String tipo){
        switch (tipo){
            case "vida":
                this.tipo = tipo;
                this.ataque = 0;
                this.vida = 30;
                this.defensa = 0;
                break;
            case "ataque":
                this.tipo = tipo;
                this.ataque = 15;
                this.vida = 0;
                this.defensa = 0;
                break;
            case "defensa":
                this.tipo = tipo;
                this.ataque = 0;
                this.vida = 0;
                this.defensa = 15;
                break;
        }
    }

    /**
     * Metodo que permite obtener el tipo de pocion
     * @return String con el contenido de tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que setea el contenido de tipo
     * @param tipo Recibe un String con el contenido de tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que permite obtener la cantidad de vida de la pocion
     * @return Devuelve double con el contenido de vida de la pocion
     */
    public double getVida() {
        return vida;
    }

    /**
     * Metodo que setea el contenido de vida
     * @param vida Recibe un double con el contenido de vida
     */
    public void setVida(double vida) {
        this.vida = vida;
    }

    /**
     * Metodo que permite obtener la cantidad de ataque de la pocion
     * @return double con el contenido de ataque de la pocion
     */
    public double getAtaque() {
        return ataque;
    }

    /**
     * Metodo que setea el contenido de ataque
     * @param ataque recibe un double con el contenido de ataque de la pocion
     */
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    /**
     * Metodo que permite obtener el la cantidad de defensa de la pocion
     * @return double con el contenido de de defensa
     */
    public double getDefensa() {
        return defensa;
    }

    /**
     * Metodo que setea el contenido de defensa
     * @param defensa Recibe double con el contenido de defensa de la pocion
     */
    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }
    
}
