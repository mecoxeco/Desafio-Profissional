public class MaiorDe80Anos extends Paciente implements GrupoPrioritario {
    public MaiorDe80Anos(String cpf, String nomeCompleto, int idade) {
        super(cpf, nomeCompleto, idade, true);
    }

    @Override
    public boolean temPrioridade() {
        return true;
    }
}
