public class Paciente extends Pessoa {
    private boolean prioridade;

    public Paciente(String cpf, String nomeCompleto, int idade, boolean prioridade) {
        super(cpf, nomeCompleto, idade);
        this.prioridade = prioridade;
    }

    public boolean isPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }
}
