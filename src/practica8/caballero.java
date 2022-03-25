/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

import java.util.*;

/**
 *
 * @author tutu5
 */
public class caballero extends combate {

    public caballero() {
		super();
		nombre = "Caballero";
		vida = 80;
		ataque = 15;
		defensa = 12;
		h = 0.75;
	}
	

	
        public void esquivar() {
		 System.out.println (this.nombre + " ¡Escapo de sus manos, igual que como lo hizo su ex...! ");
	}
        
    
}
