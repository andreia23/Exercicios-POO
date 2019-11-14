import java.util.ArrayList;

public class Pai {
	private String nome;
	private ArrayList<Filho> filhos = new ArrayList<>();
	
	//Construtor
	public Pai(String nome) {
		super();
		this.nome = nome;
	}
	
	//Método Adicionar
	public void adicionar(Filho f) {
		filhos.add(f);
	}
	
	//Método Remover
	public void remover(Filho f) {
		filhos.remove(f);
		
	}
	
	//Método Localizar
	public Filho localizar(String nome) {
		for(Filho f : filhos) {
			if(f.getNome().equals(nome)) {
				return f;
			}
			
		}
		return null;
		
	}
	
	// Método ToString
	
	public String toString() {
		String texto = "\nPai: " + nome;
		if(filhos.isEmpty())
			texto += "não tem filhos";
		else
			for (Filho f: filhos)
				texto += "\n" + f;
		
		
		return texto;
		
		
	}
	
	//Método Caçula
	public Filho obterCacula() {
		Filho cacula = null;
		int menoridade = 999;
		for (Filho f: filhos) {
			if(f.getIdade()< menoridade) {
				menoridade = f.getIdade();
				cacula = f;
				
			}
		}
		return cacula;
		
	}


	
}