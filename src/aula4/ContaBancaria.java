package aula4;
import java.util.Scanner;
public class ContaBancaria{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int n,n2,s,d;
      n = input.nextInt();
      n2 = n;
      s = 0;
      d = 0;
      
      if(n<=1000000 && n>0){
         while(n!=0){
            s += n % 10;
            System.out.println(n % 10);
            System.out.println(s);
            n /= 10;
         }
         
         d = s % 10;
         
         System.out.printf("%06d-"+d, n2);
      }
      else{
         System.out.println("Numero de conta invalido.");
      } 
      input.close();
   }
}