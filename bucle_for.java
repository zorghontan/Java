import javax.swing.JOptionPane;

public class bucle_for {

	public static void main(String[] args) {
		
		Boolean arroba=false,punto=false;
		
		Byte cont=0;
		
		System.out.println("Su mail debe contener un '.' ");
		
		String mail=JOptionPane.showInputDialog("Introdusca su mail");

		for( int x=0; x<mail.length(); x++) {
			
			if (mail.charAt(x)=='@'){
					
					arroba=true; 
					cont++;

			}
			if (mail.charAt(x)=='.') {
				
				punto=true;
			}
				
			
		}

	
		if (arroba==true && cont==1 && punto==true) {
			System.out.println("Su correo es valido");
		}
		else {
			System.out.println("Correo invalido");
		}
	}
}
