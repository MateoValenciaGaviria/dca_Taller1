package valenciamateo;

public class AlarmaDeRadioactividad {

	private Main app;
	private int colorRojo;
	private int cantMayus;
	private boolean pintarElementos;
	private String signo;

	public AlarmaDeRadioactividad(Main app, int cantMayus) {
		this.app = app;
		this.cantMayus = cantMayus;
		this.colorRojo = app.color(cantMayus + 200, 0, 0);
		this.pintarElementos = false;
	}

	public void pintar() {
		app.fill(colorRojo);
		// Base
		app.rect(950, 0, 150, 20);
		app.rect(987, 0, 82, 200);
		app.ellipseMode(app.CENTER);
		app.ellipse(1028, 200, 82, 82);
		app.ellipseMode(app.CORNER);

		if (pintarElementos) {
			app.fill(0);
			app.textSize(40);
			app.text(cantMayus, 1005, 150);
			app.text(signo, 1020, 80);
		}
	}

	public void pintarSigno() {
		if (!pintarElementos) {
			int numero = (int) app.random(9);
			switch (numero) {
			case 0:
				signo = "!";
				break;
			case 1:
				signo = "#";
				break;
			case 2:
				signo = "$";
				break;
			case 3:
				signo = "%";
				break;
			case 4:
				signo = "&";
				break;
			case 5:
				signo = "/";
				break;
			case 6:
				signo = "¡";
				break;
			case 7:
				signo = "¿";
				break;
			case 8:
				signo = "=";
				break;
			case 9:
				signo = "?";
				break;
			}
			pintarElementos = true;
		}
	}
}
