public class Cachorro extends Mamifero {
  private static final boolean late = true;

  public Cachorro() {}

  public Cachorro (String nome, String habitat, int patas, boolean rabo, int dentes, boolean anda) {
    super(nome, habitat, patas, rabo, dentes, anda);
  }

  @Override
  public void infoAnimal() {
    System.out.println("Oi, eu sou um " + this.nome + "! Eu vivo em/na " + this.habitat + " e tenho " + this.dentes + ". Tenho rabo? " + this.rabo + " Ando? " + this.anda + ". Sou mamífero, então, mamo de teve ser true. Mamo? " + Mamífero.mama + "Mas saiba: eu sou especial! Pergunta se eu lato. É pouco provável que eu não lata, mas ok. \"Você late?\": " + Cachorro.late);
  }
}