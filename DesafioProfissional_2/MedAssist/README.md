O Sistema de Atendimento realizado por Videoconferência do SUS é uma aplicação que utiliza java atendimento para otimizar o atendimento médico por videoconferência para pacientes do SUS
 que não possuem acesso direto para atendimento ou possuem dificuldades para receber atendimento presencial. 
 
O sistema é composto por classes que desempenham papéis diferentes na organização e execução dos atendimentos via código.

// —

```Classes:

Pessoa: A classe base Pessoa contém atributos compartilhados por pacientes e médicos, como CPF, nome completo e idade. Ela serve como uma classe pai para as classes Paciente e Medico.

Paciente
 A classe Paciente herda da classe Pessoa e implementa a interface GrupoPrioritario;
 Ela possui um atributo adicional prioridade que indica se o paciente tem prioridade para atendimento;
 Os pacientes podem ser registrados no sistema e, quando atendidos, é verificado se possuem prioridade;

Medico
 A classe Medico também herda da classe Pessoa e representa os médicos registrados no sistema;
 Ela contém informações como CRM e especialidade, que são relevantes para os atendimentos médicos;

AtendimentoVideoconferencia
 Esta classe não está definida, mas é assumida como uma classe que lida com a lógica de videoconferência;
 Ela é usada para iniciar e encerrar as videoconferências durante os atendimentos;

SistemaAtendimento
 é o ponto central do sistema;
 Mantem listas de pacientes e médicos registrados;
 Os voids adicionarPaciente, adicionarMedico e realizarAtendimento permitem adicionar pacientes
 e médicos ao sistema e realizar atendimentos, respectivamente. Durante um atendimento, verifica-se se o paciente tem prioridade com base na interface GrupoPrioritario,
 em seguida, inicia e encerra a videoconferência;
