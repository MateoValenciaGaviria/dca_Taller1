package valenciamateo;

public class Bacteria {
	
	private Main app;
	private int posX;
	private int posY;
	private int colorVerde;
	private int colorAmarillo;
	int x;
	int y;
	
	public Bacteria(Main app){
		this.app = app;
		this.posX = (int) app.random(1200);
		this.posY = (int) app.random(700);
		this.colorVerde = app.color(0, 176, 52);
		this.colorAmarillo = app.color(243, 193, 0);
	}
	
	public void pintar(){
		
		app.stroke(0);
		app.line(posX, posY, posX-32, posY-40);
		app.line(posX, posY, posX+25, posY-43);
		app.line(posX, posY, posX-40, posY+8);
		app.line(posX, posY, posX+30, posY+10);
		app.noStroke();
		app.ellipseMode(app.CENTER);
		app.fill(colorVerde);
		app.ellipse(posX,posY, 40, 40);
		app.fill(colorAmarillo);
		app.ellipse(posX - 32, posY - 40, 20, 20);
		app.ellipse(posX  + 25, posY - 43, 20, 20);
		app.ellipse(posX - 40, posY + 8, 20, 20);
		app.ellipse(posX + 40, posY + 15, 20, 20);
		app.ellipseMode(app.CORNER);
	}
	
	public boolean validar(int mx, int my){
		boolean valido = false;
		if(app.dist(mx, my, posX, posY) < 40){
			valido = true;
		}
		return valido;
	}

}
