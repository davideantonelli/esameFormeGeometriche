public class Rettangolo {
private int altezza, larghezza;
private Punto vertice;
private String colore;
public Rettangolo(Punto vertice, int altezza,
int larghezza, String colore) {
 this.altezza = altezza;
 this.larghezza = larghezza;
 this.vertice = new Punto(vertice.getX(), vertice.getY());
 this.colore = colore;
}
public void trasla(int x, int y){
 this.vertice.setX(this.vertice.getX() + x);
 this.vertice.setY(this.vertice.getY() + y);
}

public String toString(){
//Utilizzo uno StringBuilder invece di una variabile String, in quanto più veloce e alloca meno risorse
StringBuilder stringaForme = new StringBuilder("");
		stringaForme.append("Cerchio:");
		stringaForme.append(" Altezza: ");
		stringaForme.append(this.altezza);
		stringaForme.append(" Larghezza: ");
		stringaForme.append(this.larghezza);
	    stringaForme.append("Vertice: X= ");
	    stringaForme.append(this.vertice.getX());
	    stringaForme.append("Y=");
	    stringaForme.append(this.vertice.getY());
	    stringaForme.append("Colore");
	    stringaForme.append(this.colore);					
	    return stringaForme.toString();
}
}