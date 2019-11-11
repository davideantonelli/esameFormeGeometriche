
public class GruppoDiForme implements Forma {
	
	/*
	Un gruppo di forme è composto da un array di riferimenti a 	oggetti che implementano Forma
	*/
	private int i=0; // contatore che scorre tutto l'array
	private Forma[] gruppo = new Forma[10];// questoarray raggruppa le 10 tipologie di forme possibili
	//Costruttore che popola l'array
	public void gruppodiForme(Forma F1,Forma F2,Forma F3,Forma F4,Forma F5,Forma F6,Forma F7,Forma F8,Forma F9,Forma F10) {
		this.gruppo[0]=F1;
		this.gruppo[1]=F2;
		this.gruppo[2]=F3;
		this.gruppo[3]=F4;
		this.gruppo[4]=F5;
		this.gruppo[5]=F6;
		this.gruppo[6]=F7;
		this.gruppo[7]=F8;
		this.gruppo[8]=F9;
		this.gruppo[9]=F10;
	}
	
	public void trasla(int x, int y) {
		for (i=0;i<10;i++) {
			if(this.gruppo[i]!=null)
				this.gruppo[i].trasla(x,y);
		}
		
		
	}
	
	//restituisce una descrizione testuale della forma o gruppo di forme
		public String toString(){
			
			//Utilizzo uno StringBuilder invece di una variabile String, in quanto più veloce e alloca meno risorse
			StringBuilder stringaForme = new StringBuilder("");
			for(i=0; i<10; i++){
				if(this.gruppo[i]!=null){
					stringaForme.append("\n");
					stringaForme.append(this.gruppo[i].toString());
				}
				
				
			}
			return stringaForme.toString();	

}
}
