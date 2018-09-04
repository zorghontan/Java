import javax.swing.*;
public class random {

	public static void main(String[] args) {
		
		byte controller;
		
		byte num=10;
		
		byte r_edadB=(byte)(Math.random()*100);
		
		System.out.println("Su edad aleatoria generada es: "+r_edadB);
		
		do {
			controller=Byte.parseByte(JOptionPane.showInputDialog("Introduce su sexo(H/M)"));
			
		}while(controller ==0 );
		System.out.println("nn");
	}

}
