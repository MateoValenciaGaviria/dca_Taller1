package valenciamateo;

import java.util.ArrayList;

import processing.core.PConstants;

public class Logica {
	
	private Main app;
	private String[] texto;
	private String textoCargado;
	
	private TuboDeMuestras tubos;
	private PlataformaDeMuestras plataforma;
	private AlarmaDeRadioactividad alarma;
	private Iman iman;
	private CadenaCarbonada cadenaCA;
	private CadenaAdn cadenaADN;
	private ArrayList<Bacteria> bacterias;
	private Pasta pasta;

	public Logica(Main app) {
		this.app = app;
		bacterias = new ArrayList<Bacteria>();
		texto = app.loadStrings("texto.txt");
		textoCargado = texto[0];
		
		tubos = new TuboDeMuestras(app,cantidadDeVocales()[0],
				cantidadDeVocales()[1],cantidadDeVocales()[2],
				cantidadDeVocales()[3],cantidadDeVocales()[4]);
		plataforma = new PlataformaDeMuestras(app, encontrarNumero());
		
		alarma = new AlarmaDeRadioactividad(app, encontrarMayus());
		iman = new Iman(app, cantidadPalabras());
		cadenaCA = new CadenaCarbonada(app, cantidadCA());
		cadenaADN = new CadenaAdn(app, cantEspacios());
	}
	
	public void pintar() {
	    tubos.pintar();
	    plataforma.pintar();
	    
	    alarma.pintar();
	    iman.pintar();
	    cadenaCA.pintar();
	    cadenaADN.pintar();
	    if(app.mouseX > 890 &&
	       app.mouseX < 1108 &&
	       app.mouseY > 350 &&
	       app.mouseY < 515){
	    	cadenaADN.cambiarMover(0);
	    }else{
	    	cadenaADN.cambiarMover(1);
	    }
	}
	
	public void cargarElementosLaboratorio() {
		
	}
	
	public void mouse(){
		switch (app.mouseButton) {
		case PConstants.RIGHT:
			if(app.mouseX > 988 &&
			   app.mouseX < 1070 &&
			   app.mouseY > 0 &&
			   app.mouseY < 240){				
				alarma.pintarSigno();
			}
			break;
		}
	}
	
	public void keyBoard(){
		switch (app.key) {
		case 'a':
			tubos.subirTubo('a');
			break;
        case 'e':
        	tubos.subirTubo('e');
			break;
        case 'i':
        	tubos.subirTubo('i');
			break;
        case 'o':
        	tubos.subirTubo('o');
			break;
        case 'u':
        	tubos.subirTubo('u');
			break;
        case 'c':
        	cadenaCA.cambiarColor();
			break;
		}
		
		switch (app.keyCode) {
		case 32:
			iman.moverEsferas();
			break;
		}
	}
	
	public int[] cantidadDeVocales(){
		int[] vocales = new int[5];
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		
		for (int j = 0; j < textoCargado.length(); j++) {
			switch (textoCargado.charAt(j)) {
			case 'a':
				a++;
				break;
            case 'e':
				e++;
				break;
            case 'i':
            	i++;
	            break;
            case 'o':
            	o++;
	            break;
            case 'u':
            	u++;
	            break;
			}
		}
		
		vocales[0] = a;
		vocales[1] = e;
		vocales[2] = i;
		vocales[3] = o;
		vocales[4] = u;
		
		return vocales;
	}
	
	public int encontrarNumero(){
		int numero = 0;
		boolean loEncontro = false;
		for (int i = textoCargado.length()-1; i > 0; i--) {
			if(textoCargado.charAt(i) == '0' || textoCargado.charAt(i) == '1' ||
			   textoCargado.charAt(i) == '2' || textoCargado.charAt(i) == '3' ||
			   textoCargado.charAt(i) == '4' || textoCargado.charAt(i) == '5' ||
			   textoCargado.charAt(i) == '6' || textoCargado.charAt(i) == '7' ||
			   textoCargado.charAt(i) == '8' || textoCargado.charAt(i) == '9' &&
			   !loEncontro){
				loEncontro = true;
				String elNumero = ""+textoCargado.charAt(i);
				numero = Integer.parseInt(elNumero);
			}
		}
		return numero;
	}
	
	public int encontrarMayus(){
		int cantidadMayusculas = 0;
		
		for (int i = 0; i < textoCargado.length(); i++) {
			if(Character.isUpperCase(textoCargado.charAt(i))){
				cantidadMayusculas ++;
			}
		}
		
		return cantidadMayusculas;
	}
	
	public int cantidadPalabras(){
		int cifra = 0;
		boolean palabra = false;

		for (int i = 0; i < textoCargado.length(); i++) {
	        if (Character.isLetter(textoCargado.charAt(i)) && i != textoCargado.length()) {
	            palabra = true;
	        } else if (!Character.isLetter(textoCargado.charAt(i)) && palabra) {
	            cifra++;
	            palabra = false;
	        } else if (Character.isLetter(textoCargado.charAt(i)) && i == textoCargado.length()) {
	            cifra++;
	        }
	    }
		return cifra;
	}
	
	public int cantidadCA(){
		int respuesta = 0;
		for (int i = 0; i < textoCargado.length(); i++) {
			if(textoCargado.charAt(i) == 'c' && textoCargado.charAt(i+1) == 'a' ){
				respuesta++;
			}
		}
		
		return respuesta;
	}
	
	public int cantEspacios(){
		int respuesta = 0;
		for (int i = 0; i < textoCargado.length(); i++) {
			if(textoCargado.charAt(i) == ' '){
				respuesta++;
			}
		}
		
		return respuesta;
	}
}
