/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

import java.util.Random;
import java.util.*;

/**
 *
 * @author tutu5
 */
public class Principal {
    
    public static void main(String args[]){
        
        guerrero guerrero = new guerrero (); // Crear un objeto guerrero
		 caballero caballero = new caballero (); // Crear un objeto de caballería
		 Mago Mago = new Mago (); // Crear un objeto mago
		 combate computer = new combate (); // Crear un objeto de computadora
		 Scanner Entrada = new Scanner (System.in); // Crear una entrada de objeto de escáner
		 // Declarando variables
		 String rol = ""; // Declara la variable cole, utilizada para obtener el rol de entrada desde la consola
		 String oponente = ""; // Declarante oponente variable, usado para seleccionar al oponente desde la consola
		 String batalla = ""; // Declara la variable de batalla para seleccionar el proceso de batalla
		 int numero = 0; // Para registrar el número de rondas
		 // Solicita al jugador que elija
		 System.out.println ("Seleccione un rol e ingrese el literal de rol: \n");
		 System.out.println ("A: Guerrero");
		 System.out.println ("B: Caballero");
		 System.out.println ("C: Mago");
		 rol = Entrada.nextLine (); // Obtener la selección de roles de la entrada del jugador
		 System.out.println ("Seleccione un oponente e ingrese el literal de oponente: \n");
		 System.out.println ("A: Guerrero");
		 System.out.println ("B: Caballero");
		 System.out.println ("C: Mago");
		 System.out.println ("D: Computadora");
		 oponente = Entrada.nextLine (); // Obtener el oponente seleccionado por el jugador
		 // Los personajes y los oponentes no pueden ser lo mismo
		 if (rol.equals (oponente)) {// Comparación entre cadenas
			 System.out.println ("\n Los roles y los oponentes no pueden ser iguales, elija otro oponente: \n");
			 oponente = Entrada.nextLine (); // Recuperar al oponente seleccionado de la consola
		}
		/*
		  * Elige a tu oponente
		 */
		 batalla = rol + oponente;
		switch(batalla) {
			 // Guerrero vs computadora
			case "AD": {
				 System.out.println (""); // línea vacía
				 System.out.println ("Computadora VS guerrero\n");
				 // int number = 0; // Para registrar el número de rondas
				 while (computer.muerte () && guerrero.muerte ()) {// Ambos lados están vivos, el ciclo continúa
					 numero ++; // Incremento en 1 para el número de rondas
					 System.out.println (" # " + numero + "ronda: "); // Número de rondas de salida por ronda
					 if (aciertos (guerrero.getH ()) == 1) {// El guerrero golpea la computadora
						 computer.defensa (guerrero.getAtaque ()); // La computadora hace una defensa
					}else {
						 computer.esquivar (); // El guerrero no golpeó la computadora y llamó a la función de esquivar de la clase padre
					}
					 if (aciertos (computer.getH ()) == 1 && computer.getVida ()> 0) {// La computadora todavía está viva y la computadora golpea al guerrero
						 guerrero.defensa (computer.getAtaque ()); // El guerrero hace una defensa
					}
					 if (aciertos (computer.getH ()) == 0 && computer.getVida ()> 0) {// La computadora todavía está viva, pero perdió al guerrero
						 guerrero.esquivar (); // Llama a la función esquivar reescrita por la subclase guerrero
					}
				}
				break;
			}
			 // Caballería vs computadora
			case "BD":{
				System.out.println("");
				System.out.println ("Caballero vs Computadora\n");
				 while (computer.muerte () && caballero.muerte ()) {// ambos lados están vivos, el ciclo continúa
					 numero ++; // Incremento en 1 para el número de rondas
					 System.out.println (" # " + numero + " ronda: "); // Número de rondas de salida por ronda
					 if (aciertos (caballero.getH ()) == 1) {// El caballero golpea la computadora
                                             
                                             
						 computer.defensa (caballero.getAtaque ()); // defensa de la computadora
					}else {
						 computer.esquivar (); // El caballero no golpeó la computadora, llamando a la función de esquivar de la clase padre
					}
					 if (aciertos (computer.getH ()) == 1 && computer.getVida ()> 0) {// La computadora está viva y golpea a el caballero
						 caballero.defensa (computer.getAtaque ()); // defensa de caballero
					}
					 if (aciertos (computer.getH ()) == 0 && computer.getVida ()> 0) {// La computadora está viva y no ha golpeado a El caballero
						 caballero.esquivar (); // Llamar a la función esquivar reescrita por la subclase de el caballero
					}
				}
				break;
			}
			 // Mago vs computadora
			case "CD":{
				System.out.println("");
				 System.out.println ("Mago vs Computadora\n");
				 while (computer.muerte () && Mago.muerte ()) {// Ambas partes están vivas, el ciclo continúa
					 numero ++; // Incremento en 1 para el número de rondas
					 System.out.println (" # " + numero + " ronda: "); // Número de rondas de salida por ronda
					 if (aciertos (Mago.getH ()) == 1) {// Mago golpea la computadora
						 computer.defensa (Mago.getAtaque ()); // defensa de la computadora
					}else {
						 computer.esquivar (); // Mago no golpeó la computadora, llama a la función de función de esquivar de la clase padre
					}
					 if (aciertos (computer.getH ()) == 1 && computer.getVida ()> 0) {// La computadora está viva y golpea al mago
						 Mago.defensa (computer.getAtaque ()); // Defensa de mago
					}
					 if (aciertos (computer.getH ()) == 0 && computer.getVida ()> 0) {// La computadora está viva y no ha golpeado al mago
						 Mago.esquivar (); // Llama a la función esquivar reescrita por la subclase Mago
					}
				}
				break;
			}
			 // Guerrero vs Caballero
			case "AB":{
				System.out.println("");
				 System.out.println ("Guerrero vs Caballero\n");
				 while (caballero.muerte () && guerrero.muerte ()) {// ambos lados están vivos, el ciclo continúa
					 numero ++; // Incremento en 1 para el número de rondas
					 System.out.println (" # " + numero + " ronda: "); // Número de rondas de salida por ronda
					 if (aciertos (guerrero.getH ()) == 1) {// El guerrero golpea a el Caballero
						 caballero.defensa (guerrero.getAtaque ()); // Defensa de Caballero
					}else {
						 caballero.esquivar (); // El guerrero no golpeó a el Caballero, llama a la función de esquivar anulada por Caballero
					}
					 if (aciertos (caballero.getH ()) == 1 && caballero.getVida ()> 0) {// La salud actual de el Caballero es mayor que 0 (es decir, vivo) y golpea al guerrero
						guerrero.defensa (caballero.getAtaque ()); // Defensa guerrera
					}
					 if (aciertos (caballero.getH ()) == 0 && caballero.getVida ()> 0) {// El Caballero está viva y no golpeó al guerrero
						 guerrero.esquivar (); // Llama a la función esquivar reescrita por la subclase guerrero
					}
				}
				break;
			}
			 // Guerrero vs mago
			case "AC":{
				System.out.println("");
				 System.out.println ("Guerrero contra mago\n");
				 while (Mago.muerte () && guerrero.muerte ()) {// Ambos lados están vivos, el ciclo continúa
					 numero ++; // Incremento en 1 para el número de rondas
					 System.out.println (" # " + numero + " ronda: "); // Número de rondas de salida por ronda
					 if (aciertos (guerrero.getH ()) == 1) {// El guerrero golpea al mago
						 Mago.defensa (guerrero.getAtaque ()); // Defensa de magos
					}else {
						 Mago.esquivar (); // El guerrero no golpeó al mago, llama a la función esquivar reescrita por la subclase Mago
					}
					 if (aciertos (Mago.getH ()) == 1 && Mago.getVida ()> 0) {// Mage está vivo y golpea al soldado
						 guerrero.defensa (Mago.getAtaque ()); // Defensa guerrero
					}
					 if (aciertos (Mago.getH ()) == 0 && Mago.getVida ()> 0) {// El mago está vivo. Guerrero perdido
						 guerrero.esquivar (); // Llama a la función esquivar reescrita por la subclase guerrero
					}
				}
				break;
			}
			 // Caballero vs mago
			case "BC":{
				System.out.println("");
				 System.out.println ("Caballero contra mago\n");
				 while (Mago.muerte () && caballero.muerte ()) {// ambos lados o, el ciclo continúa
					 numero ++; // Incremento en 1 para el número de rondas
					 System.out.println (" # " + numero + " ronda: "); // Número de rondas de salida por ronda
					 if (aciertos (caballero.getH ()) == 1) {// La caballería golpea al mago
						 Mago.defensa (caballero.getAtaque ()); // Defensa de magos
					}else {
						 Mago.esquivar (); // Para que la caballería golpee a la caballería, llame a la función esquivar reescrita por la subclase Magain
					}
					 if (aciertos (Mago.getH ()) == 1 && Mago.getVida ()> 0) {// El mago está vivo y golpea a la caballería
						 caballero.defensa (Mago.getAtaque ()); // defensa de caballería
					}
					 if (aciertos (Mago.getH ()) == 0 && Mago.getVida ()> 0) {// El mago está vivo y está golpeando a la caballería
						 caballero.esquivar (); // Llamar a la función esquivar reescrita por la subclase de Caballería
					}
				}
				break;
			}
		}	
	}
	 // Implementa la función que especifica la tasa de aciertos
	public static int aciertos(double hr) {
		Random r = new Random();
		 int result = 0; // significa que no hay ataque
		 // generado aleatoriamente [0; 1], la probabilidad de ocurrencia de 0 es hora, la probabilidad de ocurrencia de 1 es 1 hora
		 int a = r.nextInt (100); // enteros generados aleatoriamente de [0,100), la probabilidad de que aparezca cada número es 1%
		 if (a <(int) (hr * 100)) {// El primer intervalo numérico de hr * 100, la probabilidad
			 result = 1; // significa ataque
		}else{
			result=0;
		}
            return result;
        
    }
    
}
