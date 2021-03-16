/**
 * Atividade 13:
 * Classe baseada em ContaCorrente da aula5
 * Objetivo é criar variável limite e sobrecargas para os construtores com parâmetro limite/sem parâmetros limite e saldo.
 */
package aula6;

/**
 * @author Bruno Paz
 *
 */
  
public class ContaCorrente {
	private int numeroConta;
	private String titular;
	private double saldo;
	private double limite;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	//construtor com parametros para numero da conta, titular e saldo(sempre maior ou igual a 0)
	public ContaCorrente(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo >= 0 ? saldo : 0;
		limite = 1000;//limite nao declarado, por padrao se torna 1000
	}
	
	public ContaCorrente(int numeroConta, String titular, double saldo, double limite) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	//construtor com parametros para numero da conta e titular
	public ContaCorrente(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;//saldo nao declarado = 0
		limite = 0;//limite nao declarado = 0
	}
		
	
	//atualiza saldo, adicionando quantia depositada
	public void depositar(double valor) {
		saldo += valor >= 0 ? valor : 0;
	}
	
	//atualiza saldo, decrescendo quantia sacada
	public void sacar(double valor) {
		if(valor > saldo + limite)
			System.out.printf("Nao foi possivel realizar o saque de R$%.2f por falta de recursos\n===========================================\n", valor);
		else
			saldo -= valor >= 0 ? valor : 0;
	}
	
	public void exibirDados() {
		System.out.printf("Numero da conta: %d\nTitular: %s\nSaldo: R$%.2f\nLimite R$%.2f\n", getNumeroConta(), getTitular(), getSaldo(),getLimite());
		System.out.println("===========================================");
	}
}
