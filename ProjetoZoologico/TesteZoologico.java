import java.util.ArrayList;

public class TesteZoologico {
		 
	    public static void main(String[] args){
	        Zoologico zoo = new Zoologico();
	        Animal a1,a2,a3,a4;
	        a1 = new Animal("fifi", 3.0) ;
	        a2 = new Animal("rex", 12.0) ;
	        a3 = new Animal("felix", 5.0) ;
	        a4 = new Animal("toto", 15.0) ;
	        zoo.adicionar(a1);
	        zoo.adicionar(a2);
	        zoo.adicionar(a3);
	        zoo.adicionar(a4);
	 
	        System.out.println(zoo);
	 
	        //quantos animais tem peso inferior a 7kg ?
	        //System.out.println("\ntotal animais abaixo de 7kg = "+ zoo.totalAnimaisAbaixoPeso(7.0) );
	 
	        //quais animais tem peso inferior a 7kg 
	        System.out.println("\nanimais abaixo de 7kg ");
	        //ArrayList<Animal> resultados = zoo.consultarAnimaisAbaixoPeso(7.0);
	        //for(Animal a : resultados)
	        //    System.out.println("nome:"+ a.getNome() +" peso:" + a.getPeso());
	 
	         
	        //qual o peso médio dos animais
	        //System.out.println("\npeso medio do zoologico=" + zoo.getPesoMedio() );
	 
	        //quais animais estao acima da media de peso
	        System.out.println("\nanimais que estão acima do peso medio");
	        //resultados = zoo.consultarGrandinhos();
	        //for(Animal a : resultados)
	            //System.out.println("nome:"+ a.getNome() +" peso:" + a.getPeso());
	 
	 
	        //qual o peso do animal fifi
	        System.out.println("\npeso da fifi="+zoo.localizar("fifi").getPeso());
	 
	        //alterar o peso do animal rex para 13
	        zoo.localizar("rex").setPeso(13);
	 
	        //remover o animal "toto" do zoologico
	        Animal toto = zoo.localizar("toto");
	        zoo.remover(toto);
	 
	         
	        System.out.println(zoo);
	    }
	}

