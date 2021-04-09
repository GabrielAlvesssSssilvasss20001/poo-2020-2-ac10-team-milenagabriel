public class AppAluno2 {
  public static void main (String[] args) {
    RegistraAluno aluno1 = new RegistraAluno("Gabriel", "Uma rua de Cajazeiras", 20, 2010216);

    aluno1.imprimirInfo(10.0, 9.0, 6.0);

    System.out.println("Quantidade de Alunos: " + RegistraAluno.getQuantidadeAlunos() + "\n");

    aluno1.assistirAula();
    aluno1.imprimirInfo(10.0, 9.0, 6.0);

    RegistraAluno aluno2 = new RegistraAluno();
    aluno2.imprimirInfo(10.0, 8.0, 7.0);
    System.out.println("Quantidade de Alunos: " + RegistraAluno.getQuantidadeAlunos() + "\n");

  }
}