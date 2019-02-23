package aula10;


import java.util.Scanner;


public class Aula10 {

    public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
      int soma = 0,res;
      do{
          System.out.println("Digite um numero:");
           res =t.nextInt();
              soma +=res;
       }while(res != 0);
        System.out.println(soma);    
    }
    
}
