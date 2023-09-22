public class Pessoa {
    private String cpf;
    private String nomeCompleto;
    private int idade;

    public Pessoa(String cpf, String nomeCompleto, int idade) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    // Get + set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
