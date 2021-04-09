public class RegistraAluno {
  private String nome;
  private String endereco;
  private int idade;
  private int matricula;
  private double notaMatematica;
  private double notaPortugues;
  private double ntoaGeografia;

  private boolean emAula;

  private static int contadorEstudante;

  public RegistraAluno() {
    this.nome = "";
    this.endereco = "";
    this.idade = -1;
    this.matricula = -1;
    this.emAula = false;
    contadorEstudante++;
  }

  public RegistraAluno(String nome, String endereco, int idade, int matricula) {
    this.nome = nome;
    this.endereco = endereco;
    this.idade = idade;
    this.matricula = matricula;
    this.emAula = false;
    contadorEstudante++;
  }

  public void imprimirInfo() {
    System.out.println("Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nIdade: " + this.idade);
  }

  public void imprimirInfo(double mNota, double pNota, double gNota) {
    System.out.println("Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nIdade: " + this.idade);
    this.setNotaMatematica(mNota);
    this.setNotaPortugues(pNota);
    this.setNotaGeografia(gNota);
    System.out.println("Nota atual de Matemática: " + this.notaMatematica + "\nNota atual de Português: "
        + this.notaPortugues + "\nNota atual de Geografia: " + this.ntoaGeografia + "\nMédia: " + this.getMedia());
    System.out.println("Status do aluno: Matrícula: " + this.matricula + "  Em aula: " + this.emAula + "\n\n");
  }

    public boolean emAula() {
        return this.emAula;
    }

    public void assistirAula() {
        if (!this.emAula) {
            this.emAula = true;
        }
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

  public String getNome() {
    return nome;
  }

  public void set(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setNotaMatematica(double nota) {
    this.notaMatematica = nota;
  }

  public void setNotaPortugues(double nota) {
    this.notaPortugues = nota;
  }

  public void setNotaGeografia(double nota) {
    this.ntoaGeografia = nota;
  }

  public double getMedia() {
    double media = 0;
    media = (this.notaMatematica + this.notaPortugues + this.ntoaGeografia) / 3;
    return media;
  }

  public static int getQuantidadeAlunos() {
    return contadorEstudante;
  }

}