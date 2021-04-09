public class Cobra extends Reptil {
  protected boolean veneno;

  public Cobra() {}

  public Cobra (String nome, String habitat, int patas, boolean rasteja, boolean veneno) {
    super(nome, habitat, patas, rasteja);
    this.veneno = veneno;
  }

  @Override
  public void infoAnimal() {
    System.out.println("Oi, eu sou uma " + this.nome + "! Eu vivo em/na " + this.habitat + " e tenho " + this.dentes + " Rastejo? " + this.rasteja + ". Sou um réptil. Mas saiba: eu sou especial! Pergunta se eu sou venenosa. \"Você é venenosa?\": " + this.veneno);
  }
}