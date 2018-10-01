package valenciamateo;

import java.util.ArrayList;

public class Pasta {
	
	private Main app;
	private int cantCombinaciones;
	private ArrayList<String> combinaciones;
	private boolean combinacionEncontrada;
	private int colorAzul;
	private int colorGris;
	private int combinacion;
	
	
	public Pasta(Main app, int cantCombinaciones){
		this.app = app;
		this.cantCombinaciones = cantCombinaciones;
		this.colorGris = app.color(149, 149, 149);
		this.colorAzul = app.color(5, 106, 178);
		combinaciones = new ArrayList<String>();
		combinacionEncontrada = false;
		combinacion = (int) app.random(combinaciones.size());
	}
	
	public void pintar(){
		
		app.fill(colorGris);
		app.ellipse(450, 74, 60, 60);
		app.rect(480, 74, 100, 60);
		app.fill(colorAzul);
		app.ellipse(650, 74, 60, 60);
		app.rect(580, 74, 100, 60);
		app.fill(0);
		app.textSize(40);
		app.text(cantCombinaciones, 600, 120);
		
		if(combinacionEncontrada){
			app.fill(0);
			app.text(combinaciones.get(combinacion), 490, 120);
		}
		
	}
	
	public void agregarNuevaCombinacion(String nuevaCombinacion){
		combinaciones.add(nuevaCombinacion);
	}
	
	public void pintarCombinacion(){
		combinacionEncontrada = true;		
	}

}
