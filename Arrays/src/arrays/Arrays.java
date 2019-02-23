package arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {
        List<Pessoa> list = new ArrayList<Pessoa>();
        Pessoa p1 = new Pessoa("joao",24);
        Pessoa p2 = new Pessoa("pedro",12);
        Pessoa p3 = new Pessoa("vitor",23);
        Pessoa p4 = new Pessoa("maria",45);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        
        for(Pessoa Pessoa : list){
            System.out.println(Pessoa);
        }
              //System.out.println(list);
        
            
        }
    
    
    
    }
    

