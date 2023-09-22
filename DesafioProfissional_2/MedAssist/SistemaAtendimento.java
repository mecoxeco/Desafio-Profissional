import java.util.ArrayList;
import java.util.List;


// CÓDIGO EM CONSTRUÇÃO!!

public class SistemaAtendimento {
    private List<Paciente> listaPacientes;
    private List<Medico> listaMedicos;

    public SistemaAtendimento() {
        listaPacientes = new ArrayList<>();
        listaMedicos = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void adicionarMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    public void realizarAtendimento(Paciente paciente, Medico medico) {
        System.out.println("Iniciando atendimento para " + paciente.getNomeCompleto() +
                           " com o médico " + medico.getNomeCompleto());

        // Timer
        try {
            Thread.sleep(3600000); // 1 hora de atendimento.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Atendimento encerrado para " + paciente.getNomeCompleto());
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }
}
