/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author tutu5
 */
public class combate {

    	 String nombre = "Computadora"; // Nombre
	 int vida = 80; // vida
	 int ataque = 15; // ataque
	 int defensa = 5; // fuerza defensiva
	 double h = 0.75; // tasa de aciertos

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefend() {
        return defensa;
    }

    public void setDefend(int defend) {
        this.defensa = defensa;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

         
         
	 // Función de procesamiento cuando es atacado
	public void defensa(int ataque) {
		 int daño = 0; // daño
		 int Vida_restante; // Vida restante
		 if (muerte ()) {// Llame a la siguiente función de manejo de muerte
			 if (ataque> defensa) {// Si el poder de ataque del oponente es mayor que su propio poder de defensa, se lesionará, de lo contrario el valor de la lesión es 0
				daño = ataque-defensa;
			}else {
				daño = 0;
			}
				 Vida_restante = vida-daño; // Calcular el valor de vida restante por ronda
				 System.out.println (this.nombre + " hizo una defensa y recibió " + daño + " daño! "); // ¿Cuánto daño se imprimió?
				if(Vida_restante<0)
					Vida_restante = 0;
				 System.out.println (" resto " + Vida_restante + " salud del punto "); // imprime el estado restante
				 vida = Vida_restante; // vida actual
		}else {
			
		}
	}
	 // La función de procesamiento cuando se elimina, devuelve un valor booleano, que representa si morir
	public boolean muerte() {
		boolean muerte = true; // Inicialización, viva
		 if (vida <= 0) {// asesinado si el valor de la vida es menor o igual a 0
			 System.out.println (this.nombre + " Muere, game over! ");
			muerte = false;
		}
		 return muerte; // Regreso al estado de supervivencia
	}
	 // Sin golpe, función de escape
	public void esquivar() {
		 System.out.println ("No hit" + this.nombre + " ¡Evítalo! ");
	}
    
}
