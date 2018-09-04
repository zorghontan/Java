import javax.swing.*;
public class entradas_joptionpanel {

	public static void main(String[] args) {
		Boolean ornah=Boolean.parseBoolean(JOptionPane.showInputDialog("Ta bien Or Nah´"));
		Byte edad=Byte.parseByte(JOptionPane.showInputDialog("ingrese la edad :"));
		System.out.println("tu edad es: "+edad);
		
		System.out.println("ta bien or nah ?: "+ornah+" tu eda es :"+edad);
		
		
		
		
		
	}

}
