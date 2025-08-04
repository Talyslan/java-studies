package unima.aula1;

public class AnimalCachorro extends Animal {
    private String raca;
    private boolean estaLatindo;

    public AnimalCachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso, "Mamífero");
        this.raca = raca;
        this.estaLatindo = false;
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " está latindo: Au Au!");
        estaLatindo = true;
    }

    public void pararDeLatir() {
        if (estaLatindo) {
            System.out.println(getNome() + " parou de latir.");
            estaLatindo = false;
        } else {
            System.out.println(getNome() + " não está latindo.");
        }
    }

    public void brincar() {
        if (isEstaDoente()) {
            System.out.println(getNome() + " está doente e não quer brincar.");
            return;
        }
        System.out.println(getNome() + " está brincando feliz!");
        setEstaDoente(false);
    }

    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.println("Raça: " + raca);
        System.out.println("Está latindo? " + (estaLatindo ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }
}
