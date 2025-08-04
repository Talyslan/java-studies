package unima.aula1;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal animal = new Animal("Genérico", 5, 12.5, "Desconhecido");
        animal.mostrarStatus();
        animal.comer("ração");
        animal.dormir(0);
        animal.dormir(8);
        animal.receberVacina();
        animal.setEstaDoente(true);
        animal.receberVacina();
        animal.fazerBarulho();

        System.out.println("\n--- Cachorro ---");
        AnimalCachorro dog = new AnimalCachorro("Rex", 3, 20.0, "Pastor Alemão");
        dog.mostrarStatus();
        dog.fazerBarulho();
        dog.brincar();
        dog.setEstaDoente(true);
        dog.brincar();
        dog.pararDeLatir();

        System.out.println("\n--- Pássaro ---");
        AnimalPassaro passaro = new AnimalPassaro("Tweety", 1, 0.5, "Canário");
        passaro.mostrarStatus();
        passaro.fazerBarulho();
        passaro.voar();
        passaro.voar();
        passaro.pousar();
        passaro.pousar();
    }
}
