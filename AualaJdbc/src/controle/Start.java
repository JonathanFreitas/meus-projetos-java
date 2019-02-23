package controle;

import bean.Pessoa;
import dao.PessoaDao;

public class Start {
   
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Liomar");
        p.setIdade("32");
        p.setCpf("234778");
        
        PessoaDao pd = new PessoaDao();
        pd.salvar(p);
        
        
    }
}
