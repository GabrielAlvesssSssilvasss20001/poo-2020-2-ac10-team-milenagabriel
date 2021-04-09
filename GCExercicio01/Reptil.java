public class Reptil extends Animal {
  protected boolean rasteja;
  protected int patas;

  public Reptil() {}

  public Reptil (String nome, String habitat, int patas, boolean rasteja) {
    super(nome, habitat);
    this.patas = patas;
    this.rasteja = rasteja;
  }

  public setDentes(boolean dentes) {
    this.dentes = dentes;
  }

  public String getHabitat() {
    return this.habitat;
  }

  @Override
  public void infoAnimal() {
    System.out.println("Oi, eu sou um " + this.nome + "! Eu vivo em/na " + this.habitat + " e tenho " + this.dentes + " Ratejo? " + this.rasteja);
  }

  @Override
  public void andar() {
    if (this.rasteja) {
      System.out.println("Rastejando");
      System.out.println("Rastejando");
      System.out.println("Rastejando");
      System.out.println("\nCansei");
    } else if (!this.rasteja && this.patas > 0) {
      System.out.println("Andando");
      System.out.println("Andando");
      System.out.println("Andando");
      System.out.println("\nCansei");
    } else {
      System.out.pritln("Não vou me mexer por causa dos atributos que você definiu :(((((");
    }
  }
}