package aula05;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {
        ControleRemoto r1 = new ControleRemoto();
        Scanner t =  new Scanner(System.in);
        String res;
        
        System.out.println("Bem vido ao controle remoto");
        System.out.println("_____________________________");
        do{
            System.out.println("Menu[0]");
        System.out.println("Ligar [1]");
        System.out.println("Desligar [2]");
        System.out.println("Aumentar volume[3]");
        System.out.println("Diminuir volume [4]");
        System.out.println("play [5]");
            System.out.println("pausa [6]");
        int resp = t.nextInt();
        switch (resp){
            
            case 1: 
                r1.ligar();
                System.out.println("Controle ligado");
                r1.abrirMenu();
            break;
                
            case 2:
                r1.desligar();
                
                System.out.println("Controle desligado");
                r1.abrirMenu();
                break;
                
            case 3:
                
                r1.maisVolume();
                r1.abrirMenu();
                break;
            case 4:
               
                r1.menosVolume();
                r1.abrirMenu();
                break;
            case 5:
                r1.play();
                r1.abrirMenu();
                break;
            case 6:
                r1.pausa();
                r1.abrirMenu();
                break;
            case 0: 
                r1.abrirMenu();
                
                break;
            
        }
            System.out.println("________________________________________");
            System.out.println("Você deseja continuar [s] ou [n] ?");
            System.out.println("________________________________________");
             res=t.next();
           
        }while(res.equals("s"));{
        System.out.println("Good bye");
        
        r1.abrirMenu();
    }
        
        
        
        
    }
    
}
