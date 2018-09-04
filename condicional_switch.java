import java.util.*;
import javax.swing.*;
public class condicional_switch {

	public static void main(String[] args) {
		Float valor,valor1;
		int test;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu: \n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Sacar Raices\n6-Elevar numeros\n7-Logaritmos");
		Byte controller=Byte.parseByte(JOptionPane.showInputDialog("Ingrese la opcion: "));
		
		switch(controller){
			case 1:
				valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				valor1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				System.out.println(valor+valor1);
				break;
			
				
			case 2:
				valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				valor1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				System.out.println(valor-valor1);
				break;

			case 3:
				valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				valor1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				System.out.println(valor*valor1);
				break;

			case 4:
				valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				valor1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
				System.out.println(valor/valor1);
				break;

			case 5:
				Double raiz=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor que le qieres extraer la raiz :"));
				Double raiz1=Math.sqrt(raiz);
				System.out.println("La raiz de "+raiz+" es "+Math.sqrt(raiz));
				int redondeo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de decimales a mostrar"));
				System.out.printf("%1."+redondeo+"f", raiz1);
				break;
				
			case 6:
				valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor a elevar: "));
				valor1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el exponente: "));
				System.out.println(Math.pow(valor, valor1));
				break;
			
			case 7:
				Double logaritmo=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor: "));
				System.out.println("El logaritmo de: "+logaritmo+"es "+Math.log10(logaritmo));
				
				default:
					System.out.println("Entrada no valida");

		    }

	}

}
