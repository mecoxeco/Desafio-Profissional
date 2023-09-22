public class Gestante extends Paciente implements GrupoPrioritario {
    public Gestante(String cpf, String nomeCompleto, int idade) {
        super(cpf, nomeCompleto, idade, true);
    }

    @Override
    public boolean temPrioridade() {
        return true;
    }
}
