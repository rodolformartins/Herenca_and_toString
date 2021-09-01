package academia;

public class Academia {
	
	
	public static void main(String[] args) {
		
		
		Equipamento halteres = new Equipamento("Halteres");
		Equipamento estacao = new Equipamento("Estacao de musculucao");
		Equipamento esteira = new Equipamento("Esteira");
		
		Pessoa igor = new Instrutor ("Igor", 27);
		
		
		//Mulheres
		Pessoa carla = new Mulher ("Carla Souza", 28, esteira);
		
		Pessoa rafaela = new Mulher ("Rafaela", 32, esteira);
		
		Pessoa maria = new Mulher ("Maria", 27, esteira);
		
		
		
		//Homens
		Pessoa rafael = new Homem("Rafael", 25, halteres);
		
		Pessoa fernando = new Homem("Fernando", 26, estacao);
		
		Pessoa Joao = new Homem("Joao", 32, esteira);
		
		
		//Criando a sessão
		
		Sessao sabado = new Sessao("2 horas", igor, carla, rafaela, maria);
		
		System.out.println(sabado.toString());
		
		Sessao sexta = new Sessao("3 horas", igor, rafael, fernando, Joao);
		
		System.out.println(sexta.toString());
		
	}



}
