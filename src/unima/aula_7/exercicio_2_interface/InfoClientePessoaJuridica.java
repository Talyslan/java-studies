package unima.aula_7.exercicio_2_interface;

public class InfoClientePessoaJuridica implements InfoCliente {
    private String cnpj;

    public InfoClientePessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo: Pessoa Jurídica");
        System.out.println("CNPJ: " + cnpj);
    }

    @Override
    public boolean validarDocumento() {
        // validação fake só pra exemplo: CNPJ deve ter 14 dígitos
        return cnpj != null && cnpj.replaceAll("\\D", "").length() == 14;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }
}