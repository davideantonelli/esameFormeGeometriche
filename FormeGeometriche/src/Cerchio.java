public class Cerchio {
private int raggio;
private Punto centro;
private String colore;
public Cerchio(Punto centro, int raggio, String colore) {
this.raggio = raggio;
this.centro = new Punto(centro.getX(), centro.getY());
this.colore = colore;
}
public void trasla(int x, int y){
this.centro.setX(this.centro.getX() + x);
this.centro.setY(this.centro.getY() + y);
}


//restituisce una descrizione testuale della forma o gruppo di forme
	public String toString(){
		
		//Utilizzo uno StringBuilder invece di una variabile String, in quanto più veloce e alloca meno risorse
		StringBuilder stringaForme = new StringBuilder("");
				stringaForme.append("Cerchio:");
				stringaForme.append(" Raggio: ");
				stringaForme.append(this.raggio);
			    
			    stringaForme.append("Centro: X= ");
			    stringaForme.append(this.centro.getX());
			    stringaForme.append("Y=");
			    stringaForme.append(this.centro.getY());
			    stringaForme.append("Colore");
			    stringaForme.append(this.colore);					
			    return stringaForme.toString();
		}
		
}