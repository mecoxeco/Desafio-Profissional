public class PessoaComDeficiencia extends Paciente implements GrupoPrioritario {
    public PessoaComDeficiencia(String cpf, String nomeCompleto, int idade) {
        super(cpf, nomeCompleto, idade, true);
    }

    @Override
    public boolean temPrioridade() {
        return true;
    }
}
