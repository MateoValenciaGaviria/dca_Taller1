package valenciamateo;

import java.util.ArrayList;

import processing.core.PApplet;

public class PlataformaDeMuestras {

	private Main app;
	private int numero;
	private int[] posicionesX;
	private int[] posicionesY;
	private int velGiro;

	public PlataformaDeMuestras(Main app, int numero) {
		this.app = app;
		this.numero = numero;
		this.posicionesX = new int[numero];
		this.posicionesY = new int[numero];
		this.velGiro = 25;
	}

	public void pintar() {
		int colorAzul = app.color(1, 132, 202);
		app.fill(colorAzul);
		app.ellipseMode(app.CENTER);
		app.ellipse(app.width / 2, app.height / 2, 150, 150);
		app.fill(0);
		app.ellipse(app.width / 2, (app.height / 2) + 55, 30, 30);
	}

	public void girar(boolean derecha) {

	}

	public void acomodarMuestras() {
		for (int i = 0; i < numero; i++) {
			float angulo = (PApplet.PI * 2 / numero) * i;
			
			float hipo =40;
			
			float a = PApplet.sin(angulo+app.radians(velGiro))*hipo;
			float b = PApplet.cos(angulo+app.radians(velGiro))*hipo;
			
			
			
		//	petalos.get(i).mover((int) (x-b),(int)(y-a));
		}
	}

}
