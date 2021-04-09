public class Gato extends Mamifero {
  private static final boolean ronrona = true;

  public Gato() {}

  public Gato (String nome, String habitat, int patas, boolean rabo, int dentes, boolean anda) {
    super(nome, habitat, patas, rabo, dentes, anda);
  }

  @Override
  public void infoAnimal() {
    System.out.println("Oi, eu sou um " + this.nome + "! Eu vivo em/na " + this.habitat + " e tenho " + this.dentes + ". Tenho rabo? " + this.rabo + " Ando? " + this.anda + ". Sou mamífero, então, mamo de teve ser true. Mamo? " + Mamífero.mama + "Mas saiba: eu sou especial! Sou um gatinho muito fofinho. Pergunta se eu ronrono. \"Você ronrona?\": " + Gato.ronrona);
  }
}