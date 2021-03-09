package aula5;
import java.lang.Math;
//Declaracao da classe Circulo.java
//O objetivo da classe é representar um círculo e fornecer diversas informações referente ao mesmo.
public class Circulo {
	
	//atributo privado
	private double raio;
	
	//metodo alterar raio
	public void setRaio(double r) {
		raio = r;
	}
	
	//metodo informar raio
	public double getRaio() {
		return raio;
	}
	
	//metodo calcular diametro
	public double calcDiametro() {
		return raio*2;
	}
	
	//metodo calcular perimetro
	public double calcPerimetro() {
		return 2*Math.PI*raio;
	}
	
	//metodo calcular area
	public double calcArea() {
		return Math.PI*Math.pow(raio, 2);
	}
	
	//metodo exibir dados
	public void exibeDados()
	{
		System.out.printf("Raio: %.2f\nDiametro: %.2f\nPerimetro: %.2f\nArea: %.2f\n", getRaio(), calcDiametro(), calcPerimetro(), calcArea());
		System.out.println("==================");
	}
	
	//construtor aceitando raio como parametro
	public Circulo(double raio) {
		this.raio = raio;
	}
	
}//fim da classe
