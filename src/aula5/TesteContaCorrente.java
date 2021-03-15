package aula5;

public class TesteContaCorrente {
	public static void main(String args[]) {
		//abri nova conta
		ContaCorrente conta = new ContaCorrente(777, "Bruno Batista Lessa da Paz", 0);
		conta.exibirDados();
		//caiu pagamento do freela
		conta.depositar(500);
		conta.exibirDados();
		//ops saque não vai rolar
		conta.sacar(1000);
		conta.exibirDados();
		//caiu salario do estagio
		conta.depositar(1500);
		conta.exibirDados();
		//hora de despesa
		conta.sacar(1000);
		conta.exibirDados();
	}
}
