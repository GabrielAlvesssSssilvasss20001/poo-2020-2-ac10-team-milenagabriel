public class Animal {
  protected String nome;
  protected String habitat;

  public Animal() {}

  public Animal(String nome, String habitat) {
    this.nome = nome;
    this.habitat = habitat;
  }

  public void infoAnimal() {
    System.out.println("Oi, eu sou um " + this.nome + "!");
  }

  public void andar() {
    System.out.println("Eu ainda não sei andar pois não tenho patas");
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public String getHabitat() {
    return this.habitat;
  }
}