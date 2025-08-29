package unima.aula4_heranca_polimorfismo;

public class TesteFrota {
    public static void main(String[] args) {
        Veiculo[] frota = new Veiculo[4];

        frota[0] = new Carro("Gol", "ABC1234", 2018, 2019, 4, 45000);
        frota[1] = new Caminhao("Volvo FH", "XYZ9876", 2020, 18.5, 3, 350000);
        frota[2] = new Moto("Honda CG", "MOT2025", 2022, 160, 12000);
        frota[3] = new Bicicleta("Caloi Elite", 2023, "Mountain Bike", 5000);

        System.out.println("=== Frota de Veículos ===");
        for (Veiculo v : frota) {
            v.imprime();
        }

        System.out.println("\n--- Teste de Depreciação (Sobrecarga) ---");
        frota[0].deprecia(10); // 10%
        frota[1].deprecia(5, 2); // 5% ao ano por 2 anos

        frota[0].imprime();
        frota[1].imprime();
    }
}
