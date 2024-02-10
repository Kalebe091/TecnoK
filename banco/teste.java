
package banco;

import banco.Comercio;
import banco.DAOGenerico;

public class teste {
    public static void main(String[] args) {
        Comercio c = new Comercio();
        
       
        c.setNome("Ryzen 3600");
        c.setMarca("AMD");
        c.setDescricao("Processador");
        c.setPreco("3.500");
        c.setQtd(3);
        
        DAOGenerico<Comercio> dao = new DAOGenerico<Comercio>();
        dao.create(c);
        
    }
}
