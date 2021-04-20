package prin;

import java.util.Scanner;
import pokes.Pokemon;

/**
 * Clase que permite crear turnos dentro de la batalla
 * @author Erick y Uriel
 */
public class Turno {
    Jugador jugador1;
    Jugador jugador2;
    
    Scanner teclado = new Scanner(System.in);

    /**
     * Metodo constructor que permite asignar valores al turno en curso
     * @param jugador1 Recibe jugador con la informacion del jugador1
     * @param jugador2 Recibe jugador con la informacion del jugador2
     */
    public Turno(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    /**
     * Metodo que permite inicializar el primer turno
     */
    public void inicia(){
        System.out.println(jugador1.getNombre()+ " tiene:");
        System.out.println(jugador1.getListaPokes().element().getNombre()+" tiene " +jugador1.getListaPokes().element().getPuntosDeVida()+" de vida");
        System.out.println("\n\n");
        System.out.println(jugador2.getNombre()+ " tiene:");
        System.out.println(jugador2.getListaPokes().element().getNombre()+" tiene " +jugador2.getListaPokes().element().getPuntosDeVida()+" de vida");
        
        System.out.println("1 -> Atacar");
        System.out.println("2 -> Usar pocion");
        System.out.println("3 -> Cambiar pokemon");
        
        System.out.println(jugador1.getNombre()+ " que haras?");
        int op1 = teclado.nextInt();
        System.out.println(jugador2.getNombre()+ " que haras?");
        int op2 = teclado.nextInt();
        
        if (jugador1.getListaPokes().element().getVelocidad() > jugador2.getListaPokes().element().getVelocidad()) {
            System.out.println(jugador1.getNombre()+" ataca con: ");
            switch(op1){
                case 1:
                    if ((Math.random()*100) > 20 ){
                        System.out.println(jugador1.getListaPokes().element().getNombre()+ " ataca con "+ jugador1.getListaPokes().element().getNombreAtaque((int)Math.random()*3));
                        double res = jugador1.getListaPokes().element().ataque(jugador2.getListaPokes().element().getPuntosDeDefensa(), jugador2.getListaPokes().element().getTipo());
                        if (res >= 0) {
                            double aux = (jugador2.getListaPokes().element().getPuntosDeDefensa() + jugador2.getListaPokes().element().getPuntosDeVida()) - res;
                            jugador2.getListaPokes().element().setPuntosDeDefensa(0);
                            jugador2.getListaPokes().element().setPuntosDeVida(aux);
                            if (jugador2.getListaPokes().element().getPuntosDeVida() <= 0) {
                                System.out.println("Muere el pokemon "+jugador2.getListaPokes().element().getNombre());
                                jugador2.getListaPokes().removeFirst();
                            }
                        }else{
                            System.out.println("La defensa resiste");
//                            System.out.println("res "+res);
                            jugador2.getListaPokes().element().setPuntosDeDefensa((jugador2.getListaPokes().element().getPuntosDeDefensa()-Math.abs(res)));
                        }
                    }else{
                        System.out.println("Ataque fallido");
                    }

                    break;
                case 2:
                    jugador1.usarPocion();
                    break;
                case 3:
                    jugador1.elegirPoke();
                    break;
                default:
                    System.out.println(jugador1.getNombre()+ " Error al seleccionar, pierdes tu turno por babos@");
            } 
        }else{
            System.out.println(jugador2.getNombre()+" ataca con: ");
            switch(op2){
                case 1:
                    if ((Math.random()*100) > 20 ){
                        System.out.println(jugador2.getListaPokes().element().getNombre()+ " ataca con "+ jugador2.getListaPokes().element().getNombreAtaque((int)Math.random()*3));
                        double res = jugador2.getListaPokes().element().ataque(jugador1.getListaPokes().element().getPuntosDeDefensa(), jugador1.getListaPokes().element().getTipo());
                        if (res >= 0) {
                            double aux = (jugador1.getListaPokes().element().getPuntosDeDefensa() + jugador1.getListaPokes().element().getPuntosDeVida()) - res;
                            jugador1.getListaPokes().element().setPuntosDeDefensa(0);
                            jugador1.getListaPokes().element().setPuntosDeVida(aux);
                            if (jugador1.getListaPokes().element().getPuntosDeVida() <= 0) {
                                System.out.println("Muere el pokemon "+jugador1.getListaPokes().element().getNombre());
                                jugador1.getListaPokes().removeFirst();
                            }
                        }else{
                            System.out.println("La defensa resiste");
//                            System.out.println("res "+res);
                            jugador1.getListaPokes().element().setPuntosDeDefensa((jugador1.getListaPokes().element().getPuntosDeDefensa()-Math.abs(res)));
                        }
                    }else{
                        System.out.println("Ataque fallido");
                    }

                    break;
                case 2:
                    jugador2.usarPocion();
                    break;
                case 3:
                    jugador2.elegirPoke();
                    break;
                default:
                    System.out.println(jugador2.getNombre()+ " Error al seleccionar, pierdes tu turno por babos@");
            } 
        }        
    }

    /**
     * Metodo que permite inicializar turnos que posteriores al primero
     * @param tt
     */
    public int inicia(int tt){
        try {
            System.out.println(jugador1.getNombre()+ " tiene:");
            System.out.println(jugador1.getListaPokes().element().getNombre()+" tiene " +jugador1.getListaPokes().element().getPuntosDeVida()+" de vida");
        }catch (Exception e){
            return 1;
        }
        System.out.println("\n\n");
        System.out.println(jugador2.getNombre()+ " tiene:");
        try {
            System.out.println(jugador2.getListaPokes().element().getNombre()+" tiene " +jugador2.getListaPokes().element().getPuntosDeVida()+" de vida");
        }catch (Exception e){
            return 2;
        }

        
        System.out.println("1 -> Atacar");
        System.out.println("2 -> Usar pocion");
        System.out.println("3 -> Cambiar pokemon");
        
        System.out.println(jugador1.getNombre()+ " que haras?");
        int op1 = teclado.nextInt();
        System.out.println(jugador2.getNombre()+ " que haras?");
        int op2 = teclado.nextInt();
        
        if (jugador1.getListaPokes().element().getVelocidad() > jugador2.getListaPokes().element().getVelocidad()) {
            System.out.println(jugador1.getNombre()+" ataca con: ");
            switch(op1){
                case 1:
                    if ((Math.random()*100) > 20 ){
                        System.out.println(jugador1.getListaPokes().element().getNombre()+ " ataca con "+ jugador1.getListaPokes().element().getNombreAtaque((int)Math.random()*3));
                        double res = jugador1.getListaPokes().element().ataque(jugador2.getListaPokes().element().getPuntosDeDefensa());
                        if (res >= 0) {
                            double aux = (jugador2.getListaPokes().element().getPuntosDeDefensa() + jugador2.getListaPokes().element().getPuntosDeVida()) - res;
                            jugador2.getListaPokes().element().setPuntosDeDefensa(0);
                            jugador2.getListaPokes().element().setPuntosDeVida(aux);
                            jugador2.getListaPokes().element().setEstado("Dañado");
                            if (jugador2.getListaPokes().element().getPuntosDeVida() <= 0) {
                                System.out.println("Muere el pokemon "+jugador2.getListaPokes().element().getNombre());
                                jugador2.getListaPokes().removeFirst();
                            }
                        }else{
                            System.out.println("La defensa resiste");
//                            System.out.println("res "+res);
                            jugador2.getListaPokes().element().setPuntosDeDefensa((jugador2.getListaPokes().element().getPuntosDeDefensa()-Math.abs(res)));
                        }
                    }else{
                        System.out.println("Ataque fallido");
                    }

                    break;
                case 2:
                    jugador1.usarPocion();
                    break;
                case 3:
                    jugador1.elegirPoke();
                    break;
                default:
                    System.out.println(jugador1.getNombre()+" Error al seleccionar, pierdes tu turno por babos@");
            } 
        }else{
            System.out.println(jugador2.getNombre()+" ataca con: ");
            switch(op2){
                case 1:
                    if ((Math.random()*100) > 20 ){
                        System.out.println(jugador2.getListaPokes().element().getNombre()+ " ataca con "+ jugador2.getListaPokes().element().getNombreAtaque((int)Math.random()*3));
                        double res = jugador2.getListaPokes().element().ataque(jugador1.getListaPokes().element().getPuntosDeDefensa());
                        if (res >= 0) {
                            double aux = (jugador1.getListaPokes().element().getPuntosDeDefensa() + jugador1.getListaPokes().element().getPuntosDeVida()) - res;
                            jugador1.getListaPokes().element().setPuntosDeDefensa(0);
                            jugador1.getListaPokes().element().setPuntosDeVida(aux);
                            jugador1.getListaPokes().element().setEstado("Herido");
                            if (jugador1.getListaPokes().element().getPuntosDeVida() <= 0) {
                                System.out.println("Muere el pokemon "+jugador1.getListaPokes().element().getNombre());
                                jugador1.getListaPokes().removeFirst();
                            }
                        }else{
                            System.out.println("La defensa resiste");
//                            System.out.println("res "+res);
                            jugador1.getListaPokes().element().setPuntosDeDefensa((jugador1.getListaPokes().element().getPuntosDeDefensa()-Math.abs(res)));
                        }
                    }else{
                        System.out.println("Ataque fallido");
                    }

                    break;
                case 2:
                    jugador2.usarPocion();
                    break;
                case 3:
                    jugador2.elegirPoke();
                    break;
                default:
                    System.out.println(jugador2.getNombre()+ " Error al seleccionar, pierdes tu turno por babos@");
            } 
        }
        return 0;
    }
}
