public class Loja{

  private String nome;
  private int distancia;
  private String endereco;

  public Loja(String nome, int distancia, String endereco)
  {
    this.nome = nome;
    this.endereco = endereco;
    this.distancia = distancia;
  }

  //get e set nome
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  //get e set distancia;
  public void setDistancia(int distancia){
    this.distancia = distancia;
  }
  public int getDistancia(){
    return this.distancia;
  }

  //get e set endereco
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  public String getEndereco(){
    return this.endereco;
  }



  
}