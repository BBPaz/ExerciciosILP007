/**
 * Atividade 13:
 * Teste da classe ContaCorrente.
 */
package aula6;

import aula6.ContaCorrente;

/**
 * @author Bruno Paz
 *
 */
public class TesteContaCorrente {
	public static void main(String args[]) {
		//abri nova conta
		ContaCorrente conta = new ContaCorrente(777, "Bruno Batista Lessa da Paz", 0);
		ContaCorrente conta2 = new ContaCorrente(123,"Juan Carlo Gonzalez", 100, 1500);
		ContaCorrente conta3 = new ContaCorrente(456, "Guilherme Consolete");
		
		conta.exibirDados();
		conta2.exibirDados();
		conta3.exibirDados();
		
		//teste do limite
		conta2.sacar(1600);
		
		conta2.exibirDados();
		
		//teste ultrapassando limite
		conta2.sacar(1600);
	}
}
