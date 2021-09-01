package academia;

public class Instrutor extends Pessoa implements Carteira{

	private Carteira codigo;
	
	
	public Instrutor(String nome, int idade) {
		super(nome, idade);
	}
	
	
	
	//Métodos getters and setters
	public Carteira getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Carteira codigo) {
		this.codigo = codigo;
	}



	@Override
	public String toString() {
		return super.toString() + ", codigo da carteira: " + codigo;
	}
	
	
	
}
