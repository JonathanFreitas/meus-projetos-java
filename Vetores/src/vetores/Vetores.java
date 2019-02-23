package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
     /*String res;
        do{Scanner t = new Scanner(System.in);
        int n[];
         System.out.println("Digite um nome: ");
         n[0]=t.nextInt();
        
         System.out.println("Deseja continuar [s] ou [n]");
         res = t.next();
                 }while(res.equals("s"));{
        
    }
           for (int m=0; m<= n.length-1; m++ ){
            System.out.println("Na posição " + m + " temos o valor"+ n[m]);
        }*/
        //-----------------------------------------------------------------------------
        /*String mes[] ={"jan" , "fev", "mar", "abril", "mai", "jun", "jul", "ago", "set", "out", "nov" ,"dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int v= 0; v<=mes.length-1; v++){
                  System.out.println("O mes de " + mes[v]+ " tem "+ dias[v]+ " dias");
        }
        */
        //-----------------------------------------------------------------------------------------------------------------
        double v[]= {3.4, 5.6, 2.3, 56.5, -76.5};
        for(double valor: v){
            System.out.print(valor + "\n ");   
        }
        // para por em ordem 
        
        double b[]= {3.4, 5.6, 2.3, 56.5, -76.5};
        Arrays.sort(b);
        for (double valor1: b){
            System.out.print(valor1 +" ");   
        }
        
        // para encontrar vetores
        
        int n[] = {1,2,3,4,5,6,7,8};
        for(int valor2: n){
            System.out.print(valor2 +" ");  
        }
        System.out.println("");
        int p = Arrays.binarySearch(n, 4);
        System.out.println("Achei o 4 na posição " + p);
        
        // pre-encher o vetor com um so numero
        int novo[] = new int [5];
        Arrays.fill(novo, 8);
        for(int e: novo){
            System.out.println(e + " ");
        }
        
        
        
        
        
        // Amazenado os vetores
     /* Scanner t = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n[0]=t.nextInt();
       System.out.println("Digite um numero: ");
        n[1]=t.nextInt();
         System.out.println("Digite um numero: ");
        n[2]=t.nextInt();
         System.out.println("Digite um numero: ");
        n[3]=t.nextInt();
         System.out.println("Digite um numero: ");
        n[4]=t.nextInt();
        System.out.println("---------------------------------------------");
        System.out.print("Os numeros sao ");
        System.out.print(n[0]+" "+n[1]+ " "+n[2]+" "+n[3]+" "+ n[4]);
    */}
    
}
