package juego;

import java.awt.Image;
import entorno.Entorno;
import entorno.Herramientas;

public class Gondolf {
	private double x;
	private double y;
	private Image imagen;
	private double velocidad;
	private int ancho = 40; //ancho imagen mago
	private int alto = 40; //alto imagen mago
	private Image imagenAbajo;
	private Image imagenArriba;
	private Image imagenDerecha;
	private Image imagenIzquierda;
	private Image imagenActual;
	public static final int ANCHO_PANTALLA = 1400; //estas tres variantes las ajustamos segun la resolucion
	public static final int ALTO_PANTALLA = 1000;
	public static final int ANCHO_MENU = 300; //esto es el ancho de la botonera
	
	public Gondolf(double x, double y) {
		this.x = x;
		this.y = y;
		this.velocidad = 3;
		
		this.imagenDerecha = Herramientas.cargarImagen("Imagenes TP Programacion 1/Mago Derecha Opcion 2.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		this.imagenIzquierda = Herramientas.cargarImagen("Imagenes TP Programacion 1/Mago Izquierda Opcion 2.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		this.imagenAbajo = Herramientas.cargarImagen("Imagenes TP Programacion 1/Mago Abajo Opcion 2.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		this.imagenArriba = Herramientas.cargarImagen("Imagenes TP Programacion 1/Mago Arriba Opcion 2.png").getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		//empezamos con la imagen a la derecha
		this.imagenActual = imagenDerecha;
	
	}
	
	public void mover(Entorno entorno) {
		if(entorno.estaPresionada('w') || entorno.estaPresionada(entorno.TECLA_ARRIBA)) {
			if(y - velocidad > alto / 2) {//este if se puede hacer con &&
				y -= velocidad;
			}
			imagenActual = imagenArriba;
		}
		if(entorno.estaPresionada('s') || entorno.estaPresionada(entorno.TECLA_ABAJO)) {
			if(y + velocidad < ALTO_PANTALLA - alto/2 ) { //600 es el limite inferior
				y += velocidad;
			}
			imagenActual = imagenAbajo;
		}
		if(entorno.estaPresionada('a') || entorno.estaPresionada(entorno.TECLA_IZQUIERDA)) {
			if(x - velocidad > ancho / 2) {
				x -= velocidad;
			}
			imagenActual = imagenIzquierda;
		}
		if(entorno.estaPresionada('d') || entorno.estaPresionada(entorno.TECLA_DERECHA)) {
			if(x + velocidad < ANCHO_PANTALLA - ANCHO_MENU - ancho / 2) { //200 es el ancho de la botonera
				x += velocidad;
			}
			imagenActual = imagenDerecha;
		}
	}
	public void dibujar(Entorno entorno) {
		entorno.dibujarImagen(imagenActual, x, y, 0);
	}
	
	public double getX() { return x; }
	public double getY() { return y; }

}
