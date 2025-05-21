package juego;


import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Gondolf gondolf;
	private Image fondo;
	private Image botonera;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Proyecto para TP", 1400, 1000);
		this.gondolf = new Gondolf(700, 500); // centro de la pantalla
		this.fondo = Herramientas.cargarImagen("Imagenes TP Programacion 1/Fondo.jpg").getScaledInstance(1100, 1000, Image.SCALE_SMOOTH);
		this.botonera = Herramientas.cargarImagen("Imagenes TP Programacion 1/Botonera.jpeg").getScaledInstance(300, 1000, Image.SCALE_SMOOTH);
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
		
		entorno.dibujarImagen(fondo ,550, 500, 0);
		entorno.dibujarImagen(botonera,1250,500,0);
		
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
