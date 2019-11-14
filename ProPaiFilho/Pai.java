import java.util.ArrayList;

public class Pai {
	private String nome;
	private ArrayList<Filho> filhos = new ArrayList<>();
	
	//Construtor
	public Pai(String nome) {
		super();
		this.nome = nome;
	}
	
	//M�todo Adicionar
	public void adicionar(Filho f) {
		filhos.add(f);
	}
	
	//M�todo Remover
	public void remover(Filho f) {
		filhos.remove(f);
		
	}
	
	//M�todo Localizar
	public Filho localizar(String nome) {
		for(Filho f : filhos) {
			if(f.getNome().equals(nome)) {
				return f;
			}
			
		}
		return null;
		
	}
	
	// M�todo ToString
	
	public String toString() {
		String texto = "\nPai: " + nome;
		if(filhos.isEmpty())
			texto += "n�o tem filhos";
		else
			for (Filho f: filhos)
				texto += "\n" + f;
		
		
		return texto;
		
		
	}
	
	//M�todo Ca�ula
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