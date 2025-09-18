package unima.aula_7.exercicio_2_interface;

public class InfoClientePessoaFisica implements InfoCliente {
    private String cpf;

    public InfoClientePessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo: Pessoa Física");
        System.out.println("CPF : " + cpf);
    }

    @Override
    public boolean validarDocumento() {
        // validação fake só pra exemplo: CPF deve ter 11 dígitos
        return cpf != null && cpf.replaceAll("\\D", "").length() == 11;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }
}

