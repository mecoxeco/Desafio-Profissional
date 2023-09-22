public class Medico extends Pessoa {
    private String crm;
    private String especialidade;

    public Medico(String cpf, String nomeCompleto, int idade, String crm, String especialidade) {
        super(cpf, nomeCompleto, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
