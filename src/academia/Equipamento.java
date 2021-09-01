package academia;

public class Equipamento {
	private String nome;

	
	
	
	
	
	
	//Método construtor (para criarmos um equipamento) 
	public Equipamento(String nome) {
		this.nome = nome;
	}
	
	

	//Método getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return ", equipamento: " + nome + "\n";
	}
	
	
	
	
	
}
