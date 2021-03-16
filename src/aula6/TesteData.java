/**
 * Atividade 12:
 * Teste da classe Data.
 */
package aula6;

import aula6.Data;

/**
 * @author Bruno Paz
 *
 */
public class TesteData {
	
	public static void main(String[] args) {
		//teste data comum
		Data data = new Data(20,03,1996);
		data.exibirData();
		System.out.println(data.bissexto()?"Ano bissexto\n":"Ano nao bissexto\n");
		//teste data ano bissexto
		Data data2 = new Data(18,02,2000);
		data2.exibirData();
		System.out.println(data2.bissexto()?"Ano bissexto\n":"Ano nao bissexto\n");
		//teste data com valores invalidos
		Data data3 = new Data(-1,-1,-1);
		data3.exibirData();
		System.out.println(data3.bissexto()?"Ano bissexto\n":"Ano nao bissexto\n");
		//teste data com dia 29 em ano nao bissexto
		Data data4 = new Data(29,02,1997);
		data4.exibirData();
		System.out.println(data4.bissexto()?"Ano bissexto\n":"Ano nao bissexto\n");
	}
	
}
