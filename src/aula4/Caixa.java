package aula4;
import java.util.Scanner;
public class Caixa{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      float preco = 0, total = 0;
      
      do{
         preco = input.nextInt();
         if(preco<0){
            System.out.println("Valor invalido.");
         }
         else{
            total += preco;
         }
      }
      while (preco!=0);
      
      if(total>200){
         total *= 0.8;
      }
      else if(total>100)
      {
         total *= 0.85;
      }
      else if(total>50)
      {
         total *= 0.9;
      }
      else{
         total *= 0.95;
      }
      
      System.out.printf("R$%.2f",total);
      input.close();
   }
}