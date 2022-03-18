/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

import java.util.Random;

/**
 *
 * @author tutu5
 */
public class Mago extends combate{
    
    private final int VIDA_MAX; //Los hechizos de curación no pueden rebasar este límite

	public Mago() {
		super();
                nombre = "Mago";
		vida = 80;
		ataque = 15;
		defensa = 12;
		h = 0.75;
		VIDA_MAX = vida; //Vida inicial es el límite máximo
	}
	
	public void recuperarVida() {
		/*
		 * 20% posibilidad de recuperar 1 punto de vida
		 * en cada turno de juego.
		 * Pero solo sí no se tiene ya la vida al máximo
		 */
		if (vida < VIDA_MAX) {
			Random azar = new Random();
			int valor = azar.nextInt(100);
			if (valor%5 == 0) {//Comprobamos si es múltiplo de 5
				System.out.println("¡" + nombre + "  recupera 1 punto de vida! ");
				vida++;
			}
		}
	}
	
	
	
	public void esquivar() {
		 System.out.println (this.nombre + " ¡con la ayuda de los espiritus logro esquivar el ataque del oponente! ");
	}
    
}
