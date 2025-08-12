package unima.aula2_exercicio_Parque;

public class Animal {
	private String nome;
	private String especie;
	private String cor;
	private boolean sabeVoar;
	
	// método principal
	public static void main(String[] args) {
		Animal gato = new Animal("Floquinho", "siamês", "preto", true);
		
		gato.exibirInfo();
		
		gato.andar();
		gato.comer();
		gato.emiteSom();
	}
	
	// construtores
	public Animal (String nome, String especie, String cor, boolean sabeVoar) {
		this.nome = nome;
		this.especie = especie;
		this.cor = cor;
		this.sabeVoar = sabeVoar;
		System.out.println("A classe animal foi criada!\n");
	}
	
	public Animal() {
		this ("", "", "", false);
		System.out.println("A classe animal foi criada!\n");
	}
	
	// métodos
	public void emiteSom() {
		if (this.nome == "") {
			System.out.println("Animal sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println(this.nome + " está emitindo som.");
	}
	
	public void andar() {
		if (this.nome == "") {
			System.out.println("Animal sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println(this.nome + " está andando...");
	}
	
	public void comer() {
		if (this.nome == "") {
			System.out.println("Animal sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println(this.nome + " está comendo...");
	}
	
	public void exibirInfo() {
		System.out.println("============== INFO ==============");
		System.out.println("Nome: " + this.nome == "" ? "Não escolhido" : this.nome);
		System.out.println("Espécie: " + this.especie == "" ? "Não escolhida" : this.especie);
		System.out.println("Cor: " + this.cor == "" ? "Não escolhida" : this.cor);
		System.out.println("Sabe voar: " + this.sabeVoar);
	}
	
	// getters
	public String getNome() {

		return this.nome;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public boolean getsabeVoar() {
		return this.sabeVoar;
	}

	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setSabeVoar(boolean sabeVoar) {
		this.sabeVoar = sabeVoar;
	}
}
