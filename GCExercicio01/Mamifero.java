public class Mamifero extends Animal {
  protected int patas;
  protected boolean rabo;
  protected int dentes;
  protected boolean anda;
  private static final boolean mama = true;

  public Mamifero() {}

  public Mamifero (String nome, String habitat, int patas, boolean rabo, int dentes, boolean anda) {
    super(nome, habitat);
    this.patas = patas;
    this.habitat = habitat;
    this.rabo = rabo;
    this.dentes = dentes;
    this.anda = anda;
  }

  @Override
  public void infoAnimal() {
    System.out.println("Oi, eu sou um " + this.nome + "! Eu vivo em/na " + this.habitat + " e tenho " + this.dentes + ". Tenho rabo? " + this.rabo + " Ando? " + this.anda + ". Sou mamífero, então, mamo de teve ser true. Mamo? " + Mamifero.mama);
  }

  @Override
  public void andar() {
    if (this.anda && this.patas>0) {
      System.out.println("Andando");
      System.out.println("Andando");
      System.out.println("Andando");
      System.out.println("\nCansei");
    } else {
      System.out.println("Eu ainda não sei andar pois não tenho patas");
    }
  }
}