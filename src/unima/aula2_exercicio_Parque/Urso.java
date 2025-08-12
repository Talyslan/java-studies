package unima.aula2_exercicio_Parque;

public class Urso extends Animal {
	public static void main(String[] args) {
		Urso alberto = new Urso("Alberto", "polar", "branco", false);
		
		alberto.andar();
		alberto.cacar();
		alberto.comer();
		alberto.emiteSom();
		
		alberto.exibirInfo();
	}
	
	public Urso(String nome, String especie, String cor, boolean sabeVoar) {
		super(nome, especie, cor, sabeVoar);
		System.out.println("A classe urso foi criada!\n");
	}
	
	public Urso() {
		super("", "", "", false);
		System.out.println("A classe urso foi criada!\n");
	}
	
	@Override 
	public void emiteSom() {
		System.out.println(this.getNome() + " está rugindo.");
	}
	
	public void canta() {
		System.out.println(this.getNome() + " está cantando.");
	}
	
	public void cacar() {
		System.out.println(this.getNome() + " está caçando.");
	}
}
