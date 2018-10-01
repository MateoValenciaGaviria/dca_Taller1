package valenciamateo;

public class CadenaCarbonada {
	
	private Main app;
	private int color1;
	private int color2;
	private int cantCA;
	
	public CadenaCarbonada(Main app, int cantCA){
		this.app = app;
		this.cantCA = cantCA;
		this.color1 = app.color(231, 101, 21);
		this.color2 = app.color(242, 175, 0);
	}
	
	public void pintar(){
		app.ellipseMode(app.CENTER);
		switch (cantCA) {
		case 1:
			app.fill(color2);
			app.rect(164, 375, 100, 20);
			app.fill(color1);
			app.ellipse(164, 384, 30, 30);
			break;
		case 2:
			app.fill(color2);
			app.rect(164, 375, 100, 20);
			app.fill(color1);
			app.ellipse(164, 384, 30, 30);
			
			app.fill(color2);
			app.quad(260, 374, 331, 301, 348, 314, 280, 385 );
			app.fill(color1);
			app.ellipse(264, 384, 30, 30);
			break;
		case 3:
			app.fill(color2);
			app.rect(164, 375, 100, 20);
			app.fill(color1);
			app.ellipse(164, 384, 30, 30);
			
			app.fill(color2);
			app.quad(260, 374, 331, 301, 348, 314, 280, 385 );
			app.fill(color1);
			app.ellipse(264, 384, 30, 30);
			
			app.fill(color2);
			app.quad(270, 231, 345, 296, 334, 313, 258, 250 );
			app.fill(color1);
			app.ellipse(338, 305, 30, 30);
			
			app.fill(color2);
			app.rect(164, 232, 100, 20);
			app.fill(color1);
			app.ellipse(263, 243, 30, 30);
			break;
		case 4:
			app.fill(color2);
			app.rect(164, 375, 100, 20);
			app.fill(color1);
			app.ellipse(164, 384, 30, 30);
			
			app.fill(color2);
			app.quad(260, 374, 331, 301, 348, 314, 280, 385 );
			app.fill(color1);
			app.ellipse(264, 384, 30, 30);
			
			app.fill(color2);
			app.quad(270, 231, 345, 296, 334, 313, 258, 250 );
			app.fill(color1);
			app.ellipse(338, 305, 30, 30);
			
			app.fill(color2);
			app.rect(164, 232, 100, 20);
			app.fill(color1);
			app.ellipse(263, 243, 30, 30);
			
			app.fill(color2);
			app.quad(90, 305, 156, 235, 173, 244, 105, 315);
			app.fill(color1);
			app.ellipse(164, 243, 30, 30);
			break;
		case 5:
			app.fill(color2);
			app.rect(164, 375, 100, 20);
			app.fill(color1);
			app.ellipse(164, 384, 30, 30);
			
			app.fill(color2);
			app.quad(260, 374, 331, 301, 348, 314, 280, 385 );
			app.fill(color1);
			app.ellipse(264, 384, 30, 30);
			
			app.fill(color2);
			app.quad(270, 231, 345, 296, 334, 313, 258, 250 );
			app.fill(color1);
			app.ellipse(338, 305, 30, 30);
			
			app.fill(color2);
			app.rect(164, 232, 100, 20);
			app.fill(color1);
			app.ellipse(263, 243, 30, 30);
			
			app.fill(color2);
			app.quad(90, 305, 156, 235, 173, 244, 105, 315);
			app.fill(color1);
			app.ellipse(164, 243, 30, 30);
			
			app.fill(color2);
			app.quad(108, 300, 172, 378, 158, 390, 95, 313);
			app.fill(color1);
			app.ellipse(103, 305, 30, 30);
			app.ellipse(164, 384, 30, 30);
			break;
		}
		app.ellipseMode(app.CORNER);	
	}
	
	public void cambiarColor(){
		int r = (int)app.random(255);
		int g = (int)app.random(255);
		int b = (int)app.random(255);
		this.color1 = app.color(r,g,b);
		
		int r2 = (int)app.random(255);
		int g2 = (int)app.random(255);
		int b2 = (int)app.random(255);
		this.color2 = app.color(r2,g2,b2);
	}

}
