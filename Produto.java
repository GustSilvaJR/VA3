public class Produto{
  private String nome;
  private Loja loja;
  private double valor;

  public Produto(String nome, Loja loja, double valor){
    this.nome = nome;
    this.loja = loja;
    this.valor = valor;
  }

  //get e set nome
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }


  //get e set loja
  public void setLoja(Loja loja){
    this.loja = loja;
  }
  public Loja getLoja(){
    return this.loja;
  }

  //get e set valor
  public void setValor(double valor){
    this.valor = valor;
  }
  public double getValor(){
    return this.valor;
  }
  

}