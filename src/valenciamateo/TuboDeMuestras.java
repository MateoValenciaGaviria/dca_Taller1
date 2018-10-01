package valenciamateo;

public class TuboDeMuestras {
	
	private Main app;
	
	private int vocalA;
	private int vocalE;
	private int vocalI;
	private int vocalO;
	private int vocalU;
	
	private int posYa;
	private int posYe;
	private int posYi;
	private int posYo;
	private int posYu;
	
	public TuboDeMuestras(Main app, int vocalA, int vocalE, int vocalI, int vocalO, int vocalU){
		this.app = app;
		this.vocalA = vocalA;
		this.vocalE = vocalE;
		this.vocalI = vocalI;
		this.vocalO = vocalO;
		this.vocalU = vocalU;
		
		this.posYa = 700-100-vocalA;
		this.posYe = 700-100-vocalE;
		this.posYi = 700-100-vocalI;
		this.posYo = 700-100-vocalO;
		this.posYu = 700-100-vocalU;
	}
	
	public void pintar(){
		int colorVerde = app.color(13, 147, 22);
		int colorVioleta = app.color(158, 2, 208);
		app.noStroke();
		app.fill(colorVioleta);
		//tubo A
		app.rect(100, posYa, 20, 100+vocalA);
		//tubo E
		app.rect(140, posYe, 20, 100+vocalE);
		//tubo I
		app.rect(180, posYi, 20, 100+vocalI);
		//tubo O
		app.rect(220, posYo, 20, 100+vocalO);
		//tubo U
		app.rect(260, posYu, 20, 100+vocalU);
		
		//Barras verdes
		app.fill(colorVerde);
		app.rect(80, 580, 220, 20);
		app.rect(80, 680, 220, 20);
	}
	
	public void subirTubo(char letra){
		switch (letra) {
		case 'a':
			posYa -= 5;
			break;
        case 'e':
        	posYe -= 5;
			break;
        case 'i':
        	posYi -= 5;
			break;
        case 'o':
        	posYo -= 5;
			break;
        case 'u':
        	posYu -= 5;
			break;

		}
	}	
	

}
