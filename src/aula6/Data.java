/**
 * Atividade 12:
 * Classe que representa data com dia, mês e ano.
 * Objetivo é criar método com retorno booleano que informa se o ano é bissexto
 */
package aula6;

/**
 * @author Bruno Paz
 *
 */
public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int diaMes[];
	
	public Data(int dia, int mes, int ano) {
		diaMes = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
		setData(dia,mes,ano);
	}
	
	public void setData(int dia, int mes, int ano){
		if(mes <= 12 && mes >= 1)
			this.mes = mes;
		else {
			System.out.println("Mes invalido. Mes definido para 1 por padrao.");
			this.mes = 1;			
		}
		
		if(ano>0) {
			this.ano = ano;
		}
		else {
			System.out.println("Ano invalido. Ano definido para 2000 por padrao.");
			this.ano = 2000;
		}
		
		if(bissexto())
			diaMes[2] = 29;
		
		if(checkDia(dia))
			this.dia = dia;
		else {
			System.out.println("Dia invalido. Dia definido para 1 por padrao.");
			this.dia = 1;
		}
	}
	
	public void exibirData() {
		System.out.printf("=============\n%d/%d/%d\n", dia, mes, ano);
	}
	
	public boolean checkDia(int dia) {
		return dia > 0 && dia <= diaMes[mes];
	}
	
	public boolean bissexto() {
		return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
	}
}
