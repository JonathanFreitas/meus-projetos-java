package aula08;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                        && l1 != l2){
            this.aprovada= true;
            this.desafiado= l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
        
        
        
    }
    public void Lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
           this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
           this.desafiante.apresentar();
           Random ale = new Random();
           int ven = ale.nextInt(3);
            System.out.println("=================RESULTADO===================");
           switch (ven){
               case 0: //empate
                   System.out.println("Empatou");
                   this.desafiado.empatarLutar();
                   this.desafiante.empatarLutar();
                   
                   break;
               case 1:// Desafiado vence
                   System.out.println("Vitoria do "+ this.desafiado.getNome());
                   this.desafiado.ganharLutar();
                   this.desafiante.pedeuLuta();
                   
                   
                   break;
                   
               case 2:// Desafiante ganhou
                   System.out.println("Vitoria do " + this.desafiante.getNome());
                   this.desafiante.ganharLutar();
                   this.desafiado.pedeuLuta();
                   
                   
                   
                   break;
                   
           }
           System.out.println("=============================================");
           
        }else{
            System.out.println("A luta nao pode acontecer");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
    
}
