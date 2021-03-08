package aula4;
import java.util.Scanner;
public class Sequencia{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int n = 0;
      float elem = 0, menor = 0, maior = 0, media = 0;
      
      
      System.out.println("Insira o valor de n.");
      
      do{
         n = input.nextInt();
         if(n<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (n<=0);
      
      
      System.out.println("Insira os valores da sequencia:");
      
      elem = input.nextFloat();
      maior = elem;
      menor = elem;
      media += elem;
      for(int i = 1;i<n;i++){
         elem = input.nextFloat();
         menor = elem<menor?elem:menor;
         maior = elem>maior?elem:maior;
         media += elem;
      }
      
      media /= n;
      
      System.out.printf("Menor: %f\nMaior: %f\n Media: %f", menor, maior, media);
      input.close();
   }
}