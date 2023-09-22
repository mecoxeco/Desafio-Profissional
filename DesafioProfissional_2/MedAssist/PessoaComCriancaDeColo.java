public class PessoaComCriancaDeColo extends Paciente implements GrupoPrioritario {
    public PessoaComCriancaDeColo(String cpf, String nomeCompleto, int idade) {
        super(cpf, nomeCompleto, idade, true);
    }

    @Override
    public boolean temPrioridade() {
        return true;
    }
}
