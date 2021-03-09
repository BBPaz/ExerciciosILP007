package aula5;

//O objetivo da classe é representar uma conta corrente e realizar transações em tal conta.  
public class ContaCorrente {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	private double getSaldo() {
		return saldo;
	}
	
	//construtor com parametros para numero da conta, titular e saldo(sempre maior ou igual a 0)
	public ContaCorrente(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo >= 0 ? saldo : 0;
	}
	
	//atualiza saldo, adicionando quantia depositada
	public void depositar(double valor) {
		saldo += valor >= 0 ? valor : 0;
	}
	
	//atualiza saldo, decrescendo quantia sacada
	public void sacar(double valor) {
		saldo -= valor >= 0 ? valor : 0;
	}
	
	public void exibirDados() {
		System.out.printf("Numero da conta: %d\nTitular: %s\nSaldo: R$%.2f\n", getNumeroConta(), getTitular(), getSaldo());
		System.out.println("===========================================");
	}
}
