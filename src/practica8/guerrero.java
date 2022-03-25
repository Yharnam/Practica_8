/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author tutu5
 */
public class guerrero extends combate{
    
    
        public guerrero() {
		super();
                nombre = "Guerrero";
		vida = 100;
		ataque = 10;
		defensa = 12;
		h = 0.7;
	}
	
	public int golpeRoca() {
		/*
		 * Nivel de ataque máximo, incrementado un 100%
		 */
		return (int)(ataque * 2);
	}
	

	public void esquivar() {
		 System.out.println (this.nombre + " ¡Sos muy lento che, ese churrito no me golpeara! ");
	}
    
}
