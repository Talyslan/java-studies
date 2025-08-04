package unima.aula1;

public class AnimalPassaro extends Animal {
    private String especie;
    private boolean estaVoando;

    public AnimalPassaro(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso, "Ave");
        this.especie = especie;
        this.estaVoando = false;
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está cantando: Piu Piu!");
    }

    public void voar() {
        if (estaVoando) {
            System.out.println(getNome() + " já está voando.");
            return;
        }
        System.out.println(getNome() + " começou a voar!");
        estaVoando = true;
    }

    public void pousar() {
        if (!estaVoando) {
            System.out.println(getNome() + " já está no chão.");
            return;
        }
        System.out.println(getNome() + " pousou.");
        estaVoando = false;
    }

    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.println("Espécie: " + especie);
        System.out.println("Está voando? " + (estaVoando ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }
}
