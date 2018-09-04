import javax.swing.*;
public class matrices {

	public static void main(String[] args) {
		
		String [] datos=new String[3];
		
		String [] u_datos= {"nombre","rut","mail"};
		
		System.out.println("aca " + datos.length);
				
		for(Byte x=0; x<u_datos.length; x++) {
			
			datos[x]=JOptionPane.showInputDialog("Ingrese su " + u_datos[x]); 
			
		}
		
		/*for (Byte y=0; y<datos.length; y++) {
	
			System.out.println("Su " + u_datos[y] + " es "+ datos[y]);
			
			System.out.println("su indice es =" + y); 

					
		}*/
		
		for (String datoss:datos) {
						
			System.out.println(datoss);
	}
		
  }		
	
}
