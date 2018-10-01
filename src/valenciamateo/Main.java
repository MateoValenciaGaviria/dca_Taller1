package valenciamateo;

import processing.core.PApplet;

public class Main extends PApplet {

	private Logica log;

	public static void main(String[] args) {
		PApplet.main("valenciamateo.Main");
	}

	// Metodo Settings
	public void settings() {
		size(1200, 700);
	}

	// Metodo Setup
	public void setup() {
		log = new Logica(this);
	}

	// Metodo que dibuja los objetos en el lienzo
	public void draw() {
		background(255);
		fill(0);
		log.pintar();
		fill(0);
		text("mouse X: " + mouseX + "mouse Y: " + mouseY, mouseX, mouseY);
	}

	public void keyPressed() {
		log.keyBoard();
	}

	public void mousePressed() {
		log.mouse();
	}

}
