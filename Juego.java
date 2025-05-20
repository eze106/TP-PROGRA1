package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Gondolf gondolf;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 1400, 1000);
		this.gondolf = new Gondolf(700, 500); // centro de la pantalla
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		//fondo blanco
		entorno.cambiarFont("Arial", 16, java.awt.Color.BLACK);
		entorno.dibujarRectangulo(700, 500, 1400, 1000, 0, java.awt.Color.DARK_GRAY);
		// Procesamiento de un instante de tiempo
		// ...
		
		//mover y dibujar a gondolf
		gondolf.mover(entorno);
		gondolf.dibujar(entorno);
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
