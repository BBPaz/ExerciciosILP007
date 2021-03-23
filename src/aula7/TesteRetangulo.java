/**
 * Atividade 14:
 * Teste da classe Retangulo.
 */
package aula7;

import aula7.Retangulo;

/**
 * @author Bruno Paz
 *
 */
public class TesteRetangulo {
	
	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		ret.exibeDados();
		
		Retangulo ret2 = new Retangulo(4, 4);
		ret2.exibeDados();
	}
	
}
