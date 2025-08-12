package unima.aula2_exercicio_Parque;

import java.util.ArrayList;

public class Evento {
	private String nome;
	private int duracao; // em hora
	private int tempoDeExistencia; // em anos
	private boolean ePublico;
	private boolean eIluminado;
	private String horario;
	private ArrayList<String> atracoes;
	
	public static void main(String[] args) {
		Evento circo = new Evento("Cheirosinho", 355, 90, true, "Noturno", true, new ArrayList<String>());
		
		circo.comecar();
		
		circo.addAtracao("Luan Santana");
		circo.addAtracao("Anitta");
		circo.addAtracao("Robinson");
		
		circo.terminar();
		
		circo.exibirInfo();
	}
	
	// construtores
	public Evento(String nome, int duracao, int tempoDeExistencia, boolean ePublico, String horario, boolean eIluminado, ArrayList<String> atracoes) {
		this.nome = nome;
		this.duracao = duracao;
		this.tempoDeExistencia = tempoDeExistencia;
		this.ePublico = ePublico;
		this.horario = horario;
		this.eIluminado = eIluminado;
		this.atracoes = atracoes;
		System.out.println("A classe evento foi criada!\n");
	}
	
	public Evento() {
		this("", 0, 0, false, "", false, new ArrayList<String>());
		System.out.println("A classe evento foi criada!\n");
	}
	
	// métodos
	public void comecar() {
		if (this.nome == "") {
			System.out.println("Evento sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println("O evento " + this.nome + " está começando.");
	}
	
	public void terminar() {
		if (this.nome == "") {
			System.out.println("Evento sem nome, por favor, coloque um nome.");
			return;
		}
		
		System.out.println("O evento " + this.nome + " está terminando.");
	}
	
	public void addAtracao(String atracao) {	
		this.atracoes.add(atracao);
	} 
	
	public void exibirInfo() {
		System.out.println("============== INFO ==============");
		System.out.println("Nome: " + this.nome=="" ? "Nao escolhida" : this.nome);
		System.out.println("Duração: " + this.duracao + " horas");
		System.out.println("Existe há: " + this.tempoDeExistencia + " anos");
		System.out.println("O evento é público: " + this.ePublico);
		System.out.println("Horário: " + this.horario);
		System.out.println("O evento é iluminado: " + this.eIluminado);
		System.out.println("Atrações principais: " + this.atracoes);
	}
	// getters
	public String getNome() {
		return this.nome;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public int getTempodeExistecia() {
		return this.tempoDeExistencia;
	}
	
	public boolean getePublico() {
		return this.ePublico;
	}

	public boolean geteIluminado() {
		return this.eIluminado;
	}

	public String getHorario() {
		return this.horario;
	}

	public ArrayList<String> getatracoes(){
		return this.atracoes;
	}
		
	// setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAtracoes(ArrayList<String> atracoes) {
		this.atracoes = atracoes;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setEIluminado(boolean eIluminado) {
		this.eIluminado = eIluminado;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setEPublico(boolean ePublico) {
		this.ePublico = ePublico;
	}

	public void setTempoDeExistencia(int tempoDeExistencia) {
		this.tempoDeExistencia = tempoDeExistencia;
	}
}

