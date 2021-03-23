/**
 * Atividade 14:
 * O objetivo da classe é representar um retângulo e fornecer diversas informações referente ao mesmo.
 */
package aula7;

/**
 * @author Bruno Paz
 *
 */
public class Retangulo {
	private double base, altura;
	
	//construtor vazio com valores padrão
	public Retangulo() {
		base = 2;
		altura = 1;
	}
	
	//construtor com verificação de negativos e atribuição de valores padrão
	public Retangulo(double base, double altura) {
		this.base = base >= 1 ? base : 2;
		this.altura = altura >= 1? altura : 1;
	}
	
	//informa se o retângulo é um quadrado válido
	public boolean isQuadrado() {
		return base == altura;
	}
	
	//calcula area do retângulo
	public double calcArea() {
		return base * altura;
	}
	
	//calcula perimetro do retângulo
	public double calcPerimetro() {
		return base * 2 + altura * 2;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void exibeDados()
	{
		System.out.printf("Base: %.2f\nAltura: %.2f\nPerimetro: %.2f\nArea: %.2f\nQuadrado? %s\n", getBase(), getAltura(), calcPerimetro(), calcArea(), isQuadrado());
		System.out.println("==================");
	}
}
