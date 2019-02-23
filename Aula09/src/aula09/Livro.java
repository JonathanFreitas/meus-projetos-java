package aula09;

public class Livro implements Publicacao{
   private String tiltulo;
   private String autor;
   private int totPaginas;
   private int pagAtual;
   private boolean aberto;
   private Pessoa leitor;

    
    public String detalhes() {
        return "Livro{" + "tiltulo=" + tiltulo
                + "\n, autor=" + autor 
                + "\n, totPaginas=" + totPaginas 
                + ", pagAtual=" + pagAtual + "\n, aberto=" 
                + aberto + "\n, leitor=" + leitor.getNome() 
                +"\n, idade=" + leitor.getIdade() +
                "\n, sexo=" + leitor.getSexo() +'}';
    }
   
   
      

    public Livro(String tiltulo, String autor, int totPaginas, Pessoa leitor) {
        this.tiltulo = tiltulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto=false;
        this.pagAtual= 0;
        this.leitor = leitor;
    }

    public String getTiltulo() {
        return tiltulo;
    }

    public void setTiltulo(String tiltulo) {
        this.tiltulo = tiltulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
                this.aberto=false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual= 0;
        } else {
            this.pagAtual= p;
        }
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
   
   
   
}
