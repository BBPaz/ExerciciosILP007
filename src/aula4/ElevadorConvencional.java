package aula4;
import java.util.Scanner;
public class ElevadorConvencional{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int viagens = 0, qte = 0, qte2, transportavel = 0;
      float x = 0, peso = 0;
      
      System.out.println("Insira a capacidade(Kg) do elevador.");
      do{
         x = input.nextFloat();
         if(x<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (x<=0);
      
      System.out.println("Insira a quantidade de pessoas.");
      do{
         qte = input.nextInt();
         if(qte<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (qte<=0);
      qte2 = qte;
      
      System.out.println("Insira o peso das pessoas.");
      do{
         peso = input.nextFloat();
         if(peso<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (peso<=0);
      
      while(true){
         transportavel += 1;
         if(((transportavel + 1) * peso)>x)
            break;
      }
      
      System.out.println(transportavel);
      
      while(qte2>0){
         qte2 -= transportavel;
         viagens += 1;
      }
         
      System.out.printf("%d viage%s necessaria%s para transportar todas as pessoas", viagens, (viagens>1?"ns":"m"), (viagens>1?"s":""));
      input.close();
   }
}