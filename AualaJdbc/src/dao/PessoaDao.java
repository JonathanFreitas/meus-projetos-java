package dao;
import java.sql.PreparedStatement;
import bean.Pessoa;
import java.sql.SQLException;


public class PessoaDao {
    public void salvar(Pessoa p){
        String sql = "INSERT INTO pessoa (nome ,idade, cpf) values (?,?,?)";
            
        try {
            PreparedStatement ps;
            ps = Conector.conector().prepareStatement(sql);
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getIdade());
            ps.setString(3, p.getCpf());
            System.out.println("salvo");
            ps.execute();
        } catch (SQLException e) {
            System.out.println("nao salvo");
            System.out.println(e);
        }
    
    
    
    }
}
