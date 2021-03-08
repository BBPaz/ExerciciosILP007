package aula4;
import java.util.Scanner;
public class Potencia{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int n = 0;
      float x = 0, res = 0;
      
      
      System.out.println("Insira o valor de n.");
      
      do{
         n = input.nextInt();
         if(n<=0){
            System.out.println("Insira um numero positivo.");
         }
      }
      while (n<=0);
      
      System.out.println("Insira o valor de x.");

      res = x = input.nextFloat();
      
      for(int i = 1;i<n;i++){
         res *= x;
      }
         
      System.out.printf("%f elevado a %d = %f", x, n, res);
      input.close();
   }
}