package academia;

public class Equipamento {
	private String nome;

	
	
	
	
	
	
	//M�todo construtor (para criarmos um equipamento) 
	public Equipamento(String nome) {
		this.nome = nome;
	}
	
	

	//M�todo getters and setters
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
