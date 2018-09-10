package valencia_mateo_taller1;

import java.util.ArrayList;

public class Pasta {
	
	private Main app;
	private ArrayList<String> combinaciones;
	
	public Pasta(Main app){
		this.app = app;
		combinaciones = new ArrayList<String>();
	}
	
	public void pintar(int cantCombinaciones){
		
	}
	
	public void agregarNuevaCombinacion(String nuevaCombinacion){
		combinaciones.add(nuevaCombinacion);
	}
	
	public void pintarCombinacion(){
		
	}

}
