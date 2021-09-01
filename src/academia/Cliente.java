package academia;

public class Cliente extends Pessoa{
	
	//Atributos da classe
	private Equipamento equipamento;
	
	
	
	//Método construor (para criar um cliente)
	public Cliente(String nome, int idade,Equipamento equipamento) {
		super(nome, idade);
		this.equipamento = equipamento;
	}
	
	
	//Métodos getters and setters
		public Equipamento getEquipamento() {
			return equipamento;
		}


		public void setEquipamento(Equipamento equipamento) {
			this.equipamento = equipamento;
		}


		@Override
		public String toString() {
			return super.toString() + equipamento;
		}
	
	
	
	
}
