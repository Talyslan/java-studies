package unima.aula1;

public class Animal {
    private String nome;
    private int idade;
    private double peso; // em kg
    private boolean estaComFome;
    private boolean estaComSono;
    private boolean estaDoente;
    private String tipo;

    public Animal(String nome, int idade, double peso, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.tipo = tipo;
        this.estaComFome = true;
        this.estaComSono = false;
        this.estaDoente = false;
    }

    public void comer(String comida) {
        if (!estaComFome) {
            System.out.println(nome + " não está com fome e não quer comer " + comida + ".");
            return;
        }
        System.out.println(nome + " está comendo " + comida + "...");
        estaComFome = false;
        System.out.println(nome + " agora está satisfeito(a).");
    }

    public void dormir(int horas) {
        if (horas < 1) {
            System.out.println(nome + " não dormiu o suficiente.");
            estaComSono = true;
            return;
        }
        System.out.println(nome + " está dormindo por " + horas + " horas...");
        estaComSono = false;
        System.out.println(nome + " acordou descansado(a).");
    }

    public void fazerBarulho() {
        System.out.println(nome + " está fazendo um barulho genérico de animal.");
    }

    public void mostrarStatus() {
        System.out.println("----- Status do Animal -----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Tipo: " + tipo);
        System.out.println("Está com fome? " + (estaComFome ? "Sim" : "Não"));
        System.out.println("Está com sono? " + (estaComSono ? "Sim" : "Não"));
        System.out.println("Está doente? " + (estaDoente ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }

    public void receberVacina() {
        if (!estaDoente) {
            System.out.println(nome + " está saudável e não precisa de vacina agora.");
            return;
        }
        System.out.println(nome + " está recebendo vacina...");
        estaDoente = false;
        System.out.println(nome + " agora está saudável.");
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }
}
