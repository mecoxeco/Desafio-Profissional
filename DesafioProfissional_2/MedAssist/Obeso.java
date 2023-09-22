public class Obeso extends Paciente implements GrupoPrioritario {
    public Obeso(String cpf, String nomeCompleto, int idade) {
        super(cpf, nomeCompleto, idade, true);
    }

    @Override
    public boolean temPrioridade() {
        return true;
    }
}
