import javax.swing.*;
import java.util.Scanner;
public class condicionales {

	public static void main(String[] args) {
		//Definiendo el objeto scanner
		Scanner entrada=new Scanner(System.in);
		//Inicio del code
		
		Boolean ornah;
		
		String controller=JOptionPane.showInputDialog("Sos puto: ");
		
		if(controller.equals("yes")) {
			ornah=true;
		}
		else {
			ornah=false;
		}
		
		//Boolean ornah=Boolean.parseBoolean(JOptionPane.showInputDialog("Ingresa True or False :"));
				
		Byte edad=Byte.parseByte(JOptionPane.showInputDialog("ingresar edad: "));
				
		String name=JOptionPane.showInputDialog("Ingrese nombre: ");
		
		System.out.println("Su name is "+name+" La edad "+edad+" this is "+ornah);
		
		if (edad>=20) {
			System.out.print("Tay viejo "+name+" ctmree, ya tenes: "+edad);
		}
		else if(edad>25) {
			System.out.println("segunda opcion");
		}
		else {
			System.out.println("Todavia estai bien zii");
		}
	}

}
