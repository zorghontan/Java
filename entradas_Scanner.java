import java.util.Scanner;

public class entradas_Scanner {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Ingrese edad :");
		
		Byte edad=entrada.nextByte();
		
		System.out.println("ingrese el pago :");
		
		Float pago=entrada.nextFloat();
		
		System.out.println("su nombre es: "+nombre+" su edad es: "+edad+" el pago que resiviras sera de: "+pago);
		
		
	}

}
