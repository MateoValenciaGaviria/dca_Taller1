package valenciamateo;

import java.util.ArrayList;
import java.util.Scanner;

import processing.core.PShapeOBJ;

public class Iman {

	private Main app;
	private int cifra;
	private int sumaNumerosCifra;
	private int colorRojo;
	private int colorGris;
	private int colorGris2;
	private int[][] posicionEsferas;
	
	public Iman(Main app, int cifra) {
		this.app = app;
		this.cifra = cifra;
		this.sumaNumerosCifra = 0;
		sumarNumerosCifra();
		this.colorRojo = app.color(210, 2, 2);
		this.colorGris = app.color(149, 149, 149);
		this.colorGris2 = app.color(75, 75, 75);	
		this.posicionEsferas = new int[sumaNumerosCifra][2]; 
		
		for (int i = 0; i < sumaNumerosCifra; i++) {
			int xrand = (int) app.random(600, 800);
			int yrand = (int) app.random(530, 650);
			posicionEsferas[i][0] = xrand;
			posicionEsferas[i][1] = yrand;
		}
		
	}
	
	public void sumarNumerosCifra(){
		while (cifra != 0) {
			sumaNumerosCifra = sumaNumerosCifra + (cifra % 10);
			cifra = cifra / 10;
		}
	}
	
	public void pintar(){
		app.fill(colorRojo);
		app.rect(420, 530, 120, 120);
		app.fill(colorGris);
		app.rect(510, 530, 30, 120);
		app.fill(255);
		app.rect(445, 555, 120, 70);
		
		for (int i = 0; i < sumaNumerosCifra; i++) {
			int xrand = (int) app.random(600, 800);
			int yrand = (int) app.random(530, 650);
			app.fill(colorGris2);
			app.ellipse(posicionEsferas[i][0], posicionEsferas[i][1], 20, 20);
		}
		
	}
	
	public void moverEsferas(){
		
		for (int i = 0; i < sumaNumerosCifra; i++) {
			if(posicionEsferas[i][0] >540){				
				posicionEsferas[i][0] -= 3;
			}
		}
	}
}
