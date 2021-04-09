public class AppAluno {
  public static void main (String[] args) {
    RegistraAluno aluno1 = new RegistraAluno("Milena", "Uma rua de São José de Piranhas", 20, 2010228);
    
    aluno1.setNotaMatematica(10.0);
    aluno1.setNotaPortugues(10.0);
    aluno1.setNotaGeografia(7.0);

    aluno1.imprimirInfo();

    System.out.println("Quantidade de Alunos: " + RegistraAluno.getQuantidadeAlunos() + "\n");

    aluno1.assistirAula();

    aluno1.imprimirInfo();
  }
}