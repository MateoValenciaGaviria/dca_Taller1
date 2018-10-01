package valenciamateo;

public class CadenaAdn {

	private Main app;
	private boolean mover;
	private int[] posX;
	private boolean[] estados;
	private int cantEspacios;
	private int colorBarras;
	private int colorAzul;
	private int colorAmarillo;

	public CadenaAdn(Main app, int cantEspacios) {
		this.app = app;
		this.cantEspacios = cantEspacios;
		this.posX = new int[11];
		this.estados = new boolean[11];
		this.posX[0] = 900; this.estados[0] = true;
		this.posX[1] = 1100;this.estados[1] = false;
		this.posX[2] = 920; this.estados[2] = true;
		this.posX[3] = 1080;this.estados[3] = false;
		this.posX[4] = 1000;this.estados[4] = false;
		this.posX[5] = 1040;this.estados[5] = true;
		this.posX[6] = 1000;this.estados[6] = false;
		this.posX[7] = 920; this.estados[7] = true;
		this.posX[8] = 1080;this.estados[8] = false;
		this.posX[9] = 900; this.estados[9] = true;
		this.posX[10] = 1100;this.estados[10] = false;
		this.colorBarras = app.color(5, 106, 178);
		this.colorAzul = app.color(6, 23, 101);
		this.colorAmarillo = app.color(243, 193, 0);
		this.mover = false;
	}

	public void pintar() {

		app.fill(colorBarras);
		app.rect(900, 350, 200, 15);
		app.rect(920, 375, 160, 15);
		app.rect(940, 400, 120, 15);
		app.rect(960, 425, 80, 15);
		app.rect(940, 450, 120, 15);
		app.rect(920, 475, 160, 15);
		app.rect(900, 500, 200, 15);

		app.fill(colorAzul);
		app.ellipseMode(app.CENTER);
		app.ellipse(posX[0], 357, 25, 25);
		app.ellipse(posX[2], 382, 25, 25);
		app.ellipse(posX[5], 432, 25, 25);
		app.ellipse(posX[7], 483, 25, 25);
		app.ellipse(posX[9], 509, 25, 25);

		app.fill(colorAmarillo);
		app.ellipse(posX[1], 357, 25, 25);
		app.ellipse(posX[3], 382, 25, 25);
		app.ellipse(posX[4], 407, 25, 25);
		app.ellipse(posX[6], 457, 25, 25);
		app.ellipse(posX[8], 482, 25, 25);
		app.ellipse(posX[10], 507, 25, 25);

		app.ellipseMode(app.CORNER);
		
		mover(mover);

	}

	public void mover(boolean mover){
		if(mover){
		for (int i = 0; i < posX.length; i++) {
			if(posX[i] > 880 && posX[i] < 1200){
				if(estados[i]){					
					posX[i] += 0.1*cantEspacios;
				}else{
					posX[i] -= 0.1*cantEspacios;
				}
			}if(posX[i] > 1080){
				estados[i] = false;
			}if(posX[i] < 900){
				estados[i] = true;
			}
		}	
		}
	}
	
	public void cambiarMover(int estado){
		if(estado == 0){			
			mover = true;
		}else if(estado == 1){
			mover = false;
		}
	}

}
