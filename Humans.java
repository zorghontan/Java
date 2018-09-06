package Super_Code;

import javax.swing.JOptionPane;

public class Humans {
	
	private String name,rut,sexo,estadisticas,controller;
	
	private Boolean love,odio;
	
	private Long money;
	
	private Float strength,peso,altura,vida;
	
	private Byte edad;		
	
	
	Humans(){
		
		setName("No Name");
		
		vida=100f;
		
		rut="nothing";
				
		edad=0;
		
		money=0l;
		
		strength=100f;
		
		love=true;
		
		odio=false;
		
		peso=70f;
		
		altura=1.80f;
		

		
	}
	
	public void setSexo(char sexo) {
		
	/*	if (sexo=='h') {
			this.sexo="hombre";
		
		}
		
		if(sexo=='m') {
			this.sexo="mujer";
		}
	}*/
		
	do {
		controller=JOptionPane.showConfirmDialog(null, "Ingrese Sexo", "Identificador de sexo", JOptionPane.)
	}
		
		
		
		
	}
	public String getSexo() {
		return sexo;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Boolean getLove() {
		return love;
	}

	public void setLove(Boolean love) {
		this.love = love;
	}

	public Boolean getOdio() {
		return odio;
	}

	public void setOdio(Boolean odio) {
		this.odio = odio;
	}

	public Byte getEdad() {
		return edad;
	}

	public void setEdad(Byte edad) {
		this.edad = edad;
	}

	public Float getStrength() {
		return strength;
	}

	public void setStrength(Float strength) {
		this.strength = strength;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getVida() {
		return vida;
	}

	public void setVida(Float vida) {
		this.vida = vida;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getMoney() {
		return money;
	}

	public void setMoney(Long money) {
		this.money = money;
	}
	
	public String getEstadisticas() {
		
		estadisticas+= "Tu nombre es: " + name + "\n";
		
		estadisticas+= "Tu vida es: " + vida + "\n";
		
		estadisticas+= "Tu rut es: " + rut + "\n";

		estadisticas+= "Tu sexo es: " + sexo + "\n";
		
		estadisticas+= "Tu edad es: " + edad + "\n";
		
		estadisticas+= "Tu dinero es: " + money + "\n";
		
		estadisticas+= "Tu fuerza es: " + strength + "\n";
		
		estadisticas+= "Tu amor es: " + love + "\n";
		
		estadisticas+= "Tu odio es: " + odio + "\n";
		
		estadisticas+= "Tu peso es: " + peso + "\n";
		
		estadisticas+= "Tu altura es: " + altura + "\n";
		
		return estadisticas;
		
		
	}
	
}
