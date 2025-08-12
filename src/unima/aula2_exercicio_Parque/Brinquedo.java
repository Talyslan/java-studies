package unima.aula2_exercicio_Parque;

public class Brinquedo {
	private String nome;
	private String cor;
	private int idadeMinima;
	private boolean ePerigoso;
	
	public static void main(String[]args) {
		Brinquedo rodaGigante= new Brinquedo("roda gigante","branca",12,true);
		
        rodaGigante.exibirInfo();
		
		rodaGigante.fazBarulho();
		rodaGigante.gira();
		rodaGigante.cair();
	}

	public Brinquedo(String nome, String cor, int idadeMinima, boolean ePerigoso) {
		this.nome=nome;
		this.cor=cor;
		this.idadeMinima= idadeMinima;
		this.ePerigoso= ePerigoso;
		
		System.out.println("A classe brinquedos foi criada\n");
	}
	
	public Brinquedo() {
		this("","",0,false);
		System.out.println("A classe brinquedos foi criada\n");
	}
	
	public void fazBarulho() {
		if (this.nome == "") {
			System.out.println("Brinquedo sem nome, por favor, coloque um nome.");
			return;
		}
	
		System.out.println(this.nome +" está fazendo barulho");
	}
	public void gira() {
		if (this.nome == "") {
			System.out.println("Brinquedo sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println(this.nome + " está girando");
	}
	public  void cair() {
		if (this.nome == "") {
			System.out.println("Brinquedo sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println(this.nome +" esta caindo");
		
	}
	public void exibirInfo() {
		System.out.println("============== INFO ==============");
		System.out.println("Nome: " + this.nome == "" ? "Não escolhido" : this.nome);
		System.out.println("Cor: " + this.cor == "" ? "Não escolhida" : this.cor);
		System.out.println("Idade minima: " + this.idadeMinima);
		System.out.println("Tem perigo: " + this.ePerigoso);
	}
	
	// getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public int getIdadeMinima() {
		return this.idadeMinima;
	}
	
	public boolean getePerigoso () {
		return this.ePerigoso;
	}
}
