package unima.aula2_exercicio_Parque;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Programa programa = new Programa();
	}
}


class Programa {
	Scanner sc;

	public Programa() {
		this.sc = new Scanner(System.in);
		System.out.println("========= SEJA BEM VINDO =========");
		System.out.println("========= Aperte 1 para iniciar ou 0 para encerrar =========");

		int response = this.sc.nextInt();
		this.sc.nextLine();

		while (response != 1 && response != 0) {
			System.out.println("Digite 1 ou 0, por favor.");
			response = this.sc.nextInt();
			this.sc.nextLine();
		}

		switch (response) {
			case 1: iniciar();
				break;
			case 0: encerrar();
				break;
		}
	}

	public void encerrar() {
		System.out.println("Programa encerrado!");
		return;
	}

	public void iniciar() {
		System.out.println("Digite o número de qual classe deseja criar: ");
		System.out.println(
				"1 - Pessoa\n" +
				"2 - Animal\n" +
				"3 - Cachorro\n" +
				"4 - Urso\n" +
				"5 - Brinquedo\n" +
				"6 - Evento\n"
		);

		int response = this.sc.nextInt();
		this.sc.nextLine();

		switch (response) {
			case 1:
				gerenciarPessoa();
				break;
			case 2:
				gerenciarAnimal();
				break;
			case 3:
				gerenciarCachorro();
				break;
			case 4:
				gerenciarUrso();
				break;
			case 5:
				gerenciarBrinquedo();
				break;
			case 6:
				gerenciarEvento();
				break;
		}
	}

	public void gerenciarPessoa() {
		Pessoa pessoa = new Pessoa();

		System.out.println("Qual o nome desta pessoa?");
		String nome = this.sc.nextLine();
		while (nome.length() <= 2) {
			System.out.println("*** Que nome pequeno é esse que tem menos de 3 letras? Tente novamente. ***");
			nome = this.sc.nextLine();
		}
		pessoa.setName(nome);

		System.out.println("Qual a idade (anos)?");
		int idade = this.sc.nextInt();

		while (idade < 0) {
			System.out.println("*** Idade negativa não existe. Coloque outra idade. ***");
			idade = this.sc.nextInt();
		}

		while (idade < 10) {
			System.out.println("*** " + idade + " anos? Você é muito novo, não deveria está aqui. ***");
			idade = this.sc.nextInt();
		}

		while (idade > 150) {
			System.out.println("*** " + idade + " ANOS? Coloque uma idade aceitável. ***");
			idade = this.sc.nextInt();
		}
		pessoa.setAge(idade);

		System.out.println("Qual sua altura (metros)?");
		float altura = this.sc.nextFloat();
		pessoa.setHeight(altura);

		System.out.println("Qual sua massa (em kg)?");
		float massa = this.sc.nextFloat();
		pessoa.setMass(massa);

		System.out.println("Qual seu sexo?");
		String sexo = this.sc.nextLine();
		pessoa.setSex(sexo);

		System.out.print("Pessoa criada com sucesso!");

		int response = 0;

		while (response != 5) {
			System.out.println("\nDigite o número do que deseja fazer: ");
			System.out.println(
					"1 - Andar\n" +
					"2 - Falar\n" +
					"3 - Ver informações\n" +
					"4 - Reiniciar\n" +
					"5 - Encerrar"
			);

			List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

			response = this.sc.nextInt();

			while (!this.sc.hasNextInt()) {
				System.out.println("Digite um número válido!");
				this.sc.next();

				response = this.sc.nextInt();
				this.sc.nextLine();
			}

			while (!values.contains(response)) {
				System.out.println("Digite um dos números, por favor.");
				response = this.sc.nextInt();
				this.sc.nextLine();
			}

			switch (response) {
				case 1:
					pessoa.walk();
					break;
				case 2:
					pessoa.speak();
					break;
				case 3:
					pessoa.status();
					break;
				case 4:
					iniciar();
					break;
				case 5:
					encerrar();
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

	public void gerenciarAnimal() {
		Animal animal = new Animal();

		System.out.println("Qual o nome deste animal?");
		String nome = this.sc.nextLine();
		while (nome.length() <= 1) {
			System.out.println("*** Nome muito pequeno, digite novamente. ***");
			nome = this.sc.nextLine();
		}
		animal.setNome(nome);

		System.out.println("Qual a espécie?");
		String especie = this.sc.nextLine();
		while (especie.length() <= 1) {
			System.out.println("*** Espécie inválida, tente novamente. ***");
			especie = this.sc.nextLine();
		}
		animal.setEspecie(especie);

		System.out.println("Qual a cor?");
		String cor = this.sc.nextLine();
		while (cor.length() <= 1) {
			System.out.println("*** Cor inválida, tente novamente. ***");
			cor = this.sc.nextLine();
		}
		animal.setCor(cor);

		System.out.println("Este animal sabe voar? (s/n)");
		String resposta = this.sc.nextLine().trim().toLowerCase();
		while (!resposta.equals("s") && !resposta.equals("n")) {
			System.out.println("Digite apenas 's' para sim ou 'n' para não:");
			resposta = this.sc.nextLine().trim().toLowerCase();
		}
		animal.setSabeVoar(resposta.equals("s"));

		System.out.println("Animal criado com sucesso!");

		int response = 0;
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		while (response != 6) {
			System.out.println("\nDigite o número do que deseja fazer: ");
			System.out.println(
					"1 - Andar\n" +
					"2 - Comer\n" +
					"3 - Emitir som\n" +
					"4 - Ver informações\n" +
					"5 - Reiniciar\n" +
					"6 - Encerrar"
			);

			while (!this.sc.hasNextInt()) {
				System.out.println("Digite um número válido!");
				this.sc.next();
			}
			response = this.sc.nextInt();
			this.sc.nextLine();
			while (!values.contains(response)) {
				System.out.println("Digite um dos números acima, por favor.");
				response = this.sc.nextInt();
				this.sc.nextLine();
			}

			switch (response) {
				case 1:
					animal.andar();
					break;
				case 2:
					animal.comer();
					break;
				case 3:
					animal.emiteSom();
					break;
				case 4:
					animal.exibirInfo();
					break;
				case 5:
					iniciar();
					return;
				case 6:
					encerrar();
					break;
			}
		}
	}

	public void gerenciarCachorro() {
		System.out.println("Digite o nome do cachorro:");
		String nome = this.sc.nextLine();

		System.out.println("Digite a raça:");
		String especie = this.sc.nextLine();

		System.out.println("Digite a cor:");
		String cor = this.sc.nextLine();

		Cachorro cachorro = new Cachorro(nome, especie, cor, false);

		int opcao = 0;

		do {
			System.out.println("\nO que deseja fazer?");
			System.out.println("1 - Andar");
			System.out.println("2 - Comer");
			System.out.println("3 - Latir");
			System.out.println("4 - Cavar");
			System.out.println("5 - Ver informações");
			System.out.println("6 - Encerrar");

			System.out.print("Digite a opção: ");
			opcao = this.sc.nextInt();
			this.sc.nextLine();

			switch (opcao) {
				case 1:
					cachorro.andar();
					break;
				case 2:
					cachorro.comer();
					break;
				case 3:
					cachorro.emiteSom();
					break;
				case 4:
					cachorro.cavar();
					break;
				case 5:
					cachorro.exibirInfo();
					break;
				case 6:
					System.out.println("Encerrando gerenciamento do cachorro...");
					break;
				default:
					System.out.println("Opção inválida, tente novamente.");
			}
		} while (opcao != 6);
	}


	public void gerenciarUrso() {
		System.out.println("Informe o nome do urso: ");
		String nome = this.sc.nextLine();
		System.out.println("Informe a espécie: ");
		String especie = this.sc.nextLine();
		System.out.println("Informe a cor: ");
		String cor = this.sc.nextLine();

		Urso urso = new Urso(nome, especie, cor, false);

		int opcao = 0;
		while (opcao != 6) {
			System.out.println("\nO que deseja fazer com " + urso.getNome() + "?");
			System.out.println("1 - Andar");
			System.out.println("2 - Comer");
			System.out.println("3 - Emitir som");
			System.out.println("4 - Caçar");
			System.out.println("5 - Ver informações");
			System.out.println("6 - Encerrar");
			opcao = this.sc.nextInt();

			switch (opcao) {
				case 1:
					urso.andar();
					break;
				case 2:
					urso.comer();
					break;
				case 3:
					urso.emiteSom();
					break;
				case 4:
					urso.cacar();
					break;
				case 5:
					urso.exibirInfo();
					break;
				case 6:
					System.out.println("Encerrando gerenciamento do urso...");
					break;
				default:
					System.out.println("Opção inválida!");
			}
		}
	}


	public void gerenciarBrinquedo() {
		Brinquedo brinquedo = new Brinquedo();
		int opcao = 0;

		List<Integer> opcoesValidas = Arrays.asList(1, 2, 3, 4, 5, 6);

		while (opcao != 6) {
			System.out.println("\nDigite o número do que deseja fazer:");
			System.out.println("1 - Criar/Alterar brinquedo");
			System.out.println("2 - Fazer barulho");
			System.out.println("3 - Girar");
			System.out.println("4 - Cair");
			System.out.println("5 - Exibir informações");
			System.out.println("6 - Encerrar");

			while (!opcoesValidas.contains(opcao)) {
				System.out.print("Escolha uma opção válida: ");
				opcao = this.sc.nextInt();
				this.sc.nextLine();
			}

			switch (opcao) {
				case 1:
					System.out.print("Digite o nome: ");
					String nome = this.sc.nextLine();
					System.out.print("Digite a cor: ");
					String cor = this.sc.nextLine();
					System.out.print("Digite a idade mínima: ");
					int idade = this.sc.nextInt();
					System.out.print("É perigoso? (true/false): ");
					boolean perigoso = this.sc.nextBoolean();
					brinquedo = new Brinquedo(nome, cor, idade, perigoso);
					break;

				case 2:
					brinquedo.fazBarulho();
					break;

				case 3:
					brinquedo.gira();
					break;

				case 4:
					brinquedo.cair();
					break;

				case 5:
					brinquedo.exibirInfo();
					break;

				case 6:
					System.out.println("Encerrando...");
					break;
			}

			if (opcao != 6) {
				opcao = 0;
			}
		}
	}


	public void gerenciarEvento() {
		Evento evento = new Evento();

		System.out.println("Qual o nome do evento?");
		String nome = this.sc.nextLine();
		while (nome.length() <= 1) {
			System.out.println("*** Nome inválido, digite novamente. ***");
			nome = this.sc.nextLine();
		}
		evento.setNome(nome);

		System.out.println("Qual a duração do evento (em horas)?");
		int duracao = lerIntValido(this.sc);
		evento.setDuracao(duracao);

		System.out.println("Há quantos anos o evento existe?");
		int tempoExistencia = lerIntValido(this.sc);
		evento.setTempoDeExistencia(tempoExistencia);

		System.out.println("O evento é público? (s/n)");
		boolean ePublico = lerBooleanSimNao(this.sc);
		evento.setEPublico(ePublico);

		System.out.println("Qual o horário do evento?");
		String horario = this.sc.nextLine();
		while (horario.length() <= 0) {
			System.out.println("*** Horário inválido, digite novamente. ***");
			horario = this.sc.nextLine();
		}
		evento.setHorario(horario);

		System.out.println("O evento é iluminado? (s/n)");
		boolean eIluminado = lerBooleanSimNao(this.sc);
		evento.setEIluminado(eIluminado);

		System.out.println("Evento criado com sucesso!");

		int opcao = 0;
		List<Integer> valoresValidos = Arrays.asList(1, 2, 3, 4, 5, 6);

		while (opcao != 6) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Começar evento");
			System.out.println("2 - Terminar evento");
			System.out.println("3 - Adicionar atração");
			System.out.println("4 - Exibir informações");
			System.out.println("5 - Reiniciar");
			System.out.println("6 - Encerrar");

			while (!this.sc.hasNextInt()) {
				System.out.println("Digite um número válido!");
				this.sc.next();
			}
			opcao = this.sc.nextInt();
			this.sc.nextLine();

			while (!valoresValidos.contains(opcao)) {
				System.out.println("Digite uma opção válida.");
				opcao = this.sc.nextInt();
				this.sc.nextLine();
			}

			switch (opcao) {
				case 1:
					evento.comecar();
					break;
				case 2:
					evento.terminar();
					break;
				case 3:
					System.out.println("Digite o nome da atração a adicionar:");
					String atracao = this.sc.nextLine();
					evento.addAtracao(atracao);
					System.out.println("Atração adicionada!");
					break;
				case 4:
					evento.exibirInfo();
					break;
				case 5:
					iniciar();
					return;
				case 6:
					encerrar();
					break;
			}
		}
	}

	private int lerIntValido(Scanner sc) {
		while (!sc.hasNextInt()) {
			System.out.println("Digite um número válido!");
			sc.next();
		}
		int valor = sc.nextInt();
		sc.nextLine();
		return valor;
	}

	private boolean lerBooleanSimNao(Scanner sc) {
		String resp = sc.nextLine().trim().toLowerCase();
		while (!resp.equals("s") && !resp.equals("n")) {
			System.out.println("Digite 's' para sim ou 'n' para não:");
			resp = sc.nextLine().trim().toLowerCase();
		}
		return resp.equals("s");
	}

}