package academia;

public abstract class Pessoa {
	
	//Atributos da classe
	private String nome;
	private int idade;
	
	
	
	//M�todo construor da classe (para criarmos uma pessoa)
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	//M�todos getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}



	@Override
	public String toString() {
		return nome + ", idade: " + idade;
	}
	
	
	

}
