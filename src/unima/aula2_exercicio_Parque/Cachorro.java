package unima.aula2_exercicio_Parque;

public class Cachorro extends Animal {
	
	public static void main(String[] args) {
		Cachorro lili = new Cachorro("Lili", "labrador", "preto", false);
		
		lili.andar();
		lili.comer();
		lili.emiteSom();
		
		lili.cavar();
		
		lili.exibirInfo();
	}
	
	public Cachorro(String nome, String especie, String cor, boolean sabeVoar) {
		super(nome, especie, cor, sabeVoar);
		System.out.println("A classe cachorro foi criada!\n");
	}
	
	public Cachorro() {
		super("", "", "", false);
	}
	
	@Override 
	public void emiteSom() {
		System.out.println(this.getNome() + " está latindo.");
	}
	
	public void cavar() {
		System.out.println(this.getNome() + " está cavando.");
	}
}
