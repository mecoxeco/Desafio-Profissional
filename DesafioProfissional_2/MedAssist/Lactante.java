public class Lactante extends Paciente implements GrupoPrioritario {
    public Lactante(String cpf, String nomeCompleto, int idade) {
        super(cpf, nomeCompleto, idade, true);
    }

    @Override
    public boolean temPrioridade() {
        return true;
    }
}
