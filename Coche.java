package poo;

public class Coche {
	
	private int ruedas,largo,ancho,motor,peso;
	
	private String color;
	
	Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso=500;
				
	}
	
	public void setcolor(String color) {//setter / color es el argumento
		this.color = color; //this solo es necesario ocuparlo para diferenciar la variable de clase
	}
	
	public String getcolor() {//getter
		return color;
	}

}
