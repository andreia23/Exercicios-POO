 
public class Teste {
 
    public static void main(String[] args){
        Pai p1 = new Pai("Donald");
        Filho f1 = new Filho("Zezinho", 6);
        Filho f2 = new Filho("Huguinho", 7);
        Filho f3 = new Filho("Luisinho", 5);
        p1.adicionar(f1);
        p1.adicionar(f2);
        p1.adicionar(f3);
         
        System.out.println(p1);   //pai e filhos
 
        //remoção
        Filho f = p1.localizar("Luisinho");
        if(f==null)
            System.out.println("não localizou ");
        else
            p1.remover(f);      //remover Luisinho
 
        System.out.println(p1);   //exibe os dados de pai e filhos
 
 
        //consulta
        Filho cacula = p1.obterCacula();
        if(cacula==null)
            System.out.println("\nnão tem filho ");
        else
            System.out.println("\ncacula é " + cacula.getNome());
 
    }
}