package unima.aula_7.exercicio_2_interface;

public class Main {
    public static void main(String[] args) {
        Cliente pf = new Cliente("João", "Rua das Flores, 123", new InfoClientePessoaFisica("123.456.789-00"));
        Cliente pj = new Cliente("Empresa X", "Av. Central, 999", new InfoClientePessoaJuridica("12.345.678/0001-99"));

        ClienteFidelizacao fidel = new ClienteFidelizacao("Maria", "Rua Azul, 55",
                new InfoClientePessoaFisica("98765432100"), 200.0, "12/2026");

        System.out.println("=== Cliente Pessoa Física ===");
        pf.exibirCliente();

        System.out.println("\n=== Cliente Pessoa Jurídica ===");
        pj.exibirCliente();

        System.out.println("\n=== Cliente Fidelização ===");
        fidel.exibirCliente();

        // Exemplo de polimorfismo real
        System.out.println("\n>>> Testando polimorfismo:");
        InfoCliente info = fidel.getInfo();
        System.out.println("Documento genérico: " + info.getIdentificador());
    }
}
