package aula05;

public class ControleRemoto implements Controlador{
  private int volume;
  private boolean ligado;
  private boolean tocando;
  
  public ControleRemoto(){
   this.setVolume(0);
   this.setLigado(false);
   this.setTocando(false);
  }
  
  private void setVolume(int v){
   this.volume=v;
   
   
   
  }
    private Integer getVolume(){
     return this.volume;   
    }
 private void setLigado(boolean l){   
  this.ligado= l;   
 }
    private Boolean getLigado()
    {
        return this.ligado;
    } 
 private void setTocando(boolean t){
     this.tocando=t;
 }
    private Boolean getTocando(){
     return this.tocando;   
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() +10);
            
        }
        else {
            System.out.println("Nao pode aumentar");
        }
       
    }

    @Override
    public void menosVolume() {
    if (this.getLigado()){
     this.setVolume(this.getVolume() -10);   
        
    }else{
        System.out.println("nao pode");
    }
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        this.setTocando(true);
        this.setVolume(50);
        
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0);
        
        
    }

    @Override
    public void abrirMenu() {
        System.out.println("__________Menu Principal________");
        System.out.println("Controle: " + this.getLigado());
        System.out.println("tocando: " + this.getTocando());
        System.out.println("volume: " + this.getVolume());
        for (int i = 0 ; i <=  this.getVolume(); i+=10){
            System.out.print("I");
        
        }
        
    }

    @Override
    public void play() {
    if (this.getTocando() && this.getLigado()){
        this.setTocando(true);}
    }

    @Override
    public void pausa() {
        if(this.getTocando() && this.getLigado()){
            this.setTocando(false);
        }
    }
 
    
    
}
