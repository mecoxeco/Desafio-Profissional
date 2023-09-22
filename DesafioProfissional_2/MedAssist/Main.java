public class Main {
    public static void main(String[] args) {
    
        SistemaAtendimento sistemaAtendimento = new SistemaAtendimento();
 //     ---------------------------------------------------------------------------
      
        Paciente paciente1 = new Paciente("1234567890", "João da Silva", 45, true);
        Paciente paciente2 = new Paciente("9876543210", "Maria Santos", 70, false);
      
 //     ---------------------------------------------------------------------------
      
        Medico medico1 = new Medico("M12345", "Dr. José", 35, "Cardiologia");

  //     ---------------------------------------------------------------------------       
        sistemaAtendimento.adicionarPaciente(paciente1);
        sistemaAtendimento.adicionarPaciente(paciente2);
        sistemaAtendimento.adicionarMedico(medico1);

        sistemaAtendimento.realizarAtendimento(paciente1, medico1);
        sistemaAtendimento.realizarAtendimento(paciente2, medico1);
    }
}
