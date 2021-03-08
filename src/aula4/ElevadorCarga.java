package aula4;
import java.util.Scanner;
public class ElevadorCarga{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int viagens = 0;
      float x = 0, y2, y = 0;
      
      System.out.println("Insira a capacidade(Kg) do elevador.");
      do{
         x = input.nextFloat();
         if(x<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (x<=0);
      
      System.out.println("Insira a quantidade de areia.");
      do{
         y = input.nextFloat();
         if(y<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (y<=0);
      
      y2 = y;
      
      while(y2>0){
         y2-=x;
         viagens+=1;
      }
      
      System.out.printf("%d viage%s necessaria%s para transportar todo o peso", viagens, (viagens>1?"ns":"m"), (viagens>1?"s":""));
      input.close();
   }
}