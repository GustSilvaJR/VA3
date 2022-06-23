public abstract class Entregador{
  private String nome;
  private int id;

  public Entregador(String nome, int id){
    this.nome = nome;
    this.id = id;
  }

  //get e set nome
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  //get e set id
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return this.id;
  }


  
  //Métodos

  public abstract int tempoDeEntrega(int tempo);
}