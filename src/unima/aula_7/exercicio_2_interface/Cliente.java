package unima.aula_7.exercicio_2_interface;

public class Cliente {
    private String nome;
    private String endereco;
    private InfoCliente info;  // composição, não herança!

    public Cliente(String nome, String endereco, InfoCliente info) {
        this.nome = nome;
        this.endereco = endereco;
        this.info = info;
    }

    public void exibirCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        info.exibirInfo();
        System.out.println("Documento válido? " + (info.validarDocumento() ? "✅ Sim" : "❌ Não"));
    }

    public InfoCliente getInfo() {
        return info;
    }
}