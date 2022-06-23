public class EntregadorDeMoto extends Entregador{

  public EntregadorDeMoto(String nome, int idade){
    super(nome, idade);
  }
  
  @Override
  public int tempoDeEntrega(int tempo){
    return (2*tempo);
  }
}