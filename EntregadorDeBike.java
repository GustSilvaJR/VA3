public class EntregadorDeBike extends Entregador{

  public EntregadorDeBike(String nome, int idade){
    super(nome, idade);
  }
  
  @Override
  public int tempoDeEntrega(int tempo){
    return 4*tempo;
  }
}