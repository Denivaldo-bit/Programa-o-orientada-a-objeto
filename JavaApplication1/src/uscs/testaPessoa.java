package uscs;


public class testaPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ();
        p1.nome = "deni";
        p1.idade = 19;
        p1.email = "deni09@gmail.com";
        
        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.email);
        
        //ou usar o metodo
        
        p1.imprime();
        
        Pessoa p2 = new Pessoa ();
        
        p2.nome = "jaque";
        p2.idade = 21;
        p2.email = "jaque00@gmail.com";
        
        System.out.println(p2.nome);
        System.out.println(p2.idade);
        System.out.println(p2.email);
        
        //ou metodo
        
        p2.imprime();
        
       
        
    }
    
    
}
