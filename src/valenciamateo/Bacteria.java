package valenciamateo;

public class Bacteria {
	
	private Main app;
	private int posX;
	private int posY;
	private int cantPuntos;
	private int colorVerde;
	private int colorAmarillo;
	
	public Bacteria(Main app, int cantPuntos){
		this.app = app;
		this.cantPuntos = cantPuntos;
		this.posX = (int) app.random(1200);
		this.posY = (int) app.random(700);
		this.colorVerde = app.color(0, 176, 52);
		this.colorAmarillo = app.color(243, 193, 0);
	}
	
	public void pintar(){
		
	}

}
