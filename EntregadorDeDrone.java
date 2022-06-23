public class EntregadorDeDrone extends Entregador{

  public EntregadorDeDrone(String nome, int idade){
    super(nome, idade);
  }
  
  @Override
  public int tempoDeEntrega(int tempo){
    return tempo;
  }
}