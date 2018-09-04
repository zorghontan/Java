import javax.swing.JOptionPane;

public class matrices_bidimensionales {

	public static void main(String[] args) {
		
		Byte cont=0;
		
		Byte f=Byte.parseByte(JOptionPane.showInputDialog("Ingrese la cantidad de filas de la matriz"));
		
		Byte c=Byte.parseByte(JOptionPane.showInputDialog("Ingrese cantidad de columnas"));

		String [][] matrix=new String[f][c];		
		
		String [] datos= {"Nombre","Edad","Rut","Sexo (H/M)","Mail"};
		
		/*for (Byte x=0; x<matrix.length; x++) {
			
			for(Byte y=0; y<4; y++) {
			
		}
		
	}*/
		
		for (Byte x=0; x<f; x++) {
			
			
			for (Byte y=0; y<c; y++) {
				
				matrix[x][y]=JOptionPane.showInputDialog("Ingrese su "+datos[y]);				
				
			}
		}

		for (String[] progra:matrix) {
			
			System.out.println();
			
			cont=0;
			
			for(String wea:progra) {
				
				System.out.println("Su "+datos[cont]+" es: "+wea + " ");
				
				cont++;
				
			}	
		}
		
	}
}
	
