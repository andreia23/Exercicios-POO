import java.util.ArrayList;

public class Zoologico {
	private ArrayList<Animal> animais = new ArrayList<>();
	
	//Construtor
	public Zoologico() {
		super();
	
	}
	
	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	//Método Adicionar
	public void adicionar(Animal f) {
		animais.add(f);
	}
	
	//Método Remover
	public void remover(Animal f) {
		animais.remove(f);
		
	}
	
	//Método Localizar
	public Animal localizar(String nome) {
		for(Animal f : animais) {
			if(f.getNome().equals(nome)) {
				return f;
			}
			
		}
		return null;
		
	}
	
	// Método ToString
	
	public String toString() {
		String texto = "";
		if(animais.isEmpty())
			texto += "não tem animais";
		else
			for (Animal f: animais)
				texto += "\n" + f;
		
		
		return texto;
		
		
	}
	
	//Método Caçula
	/*public Animal obterCacula() {
		Animal cacula = null;
		int menoridade = 999;
		for (Animal f: animais) {
			if(f.getIdade()< menoridade) {
				menoridade = f.getIdade();
				cacula = f;
				
			}
		}
		return cacula;
		
	}*/


	
}