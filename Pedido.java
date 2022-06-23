import java.util.List;

public class Pedido{
  private int id;
  private Entregador entregador;
  private List<Produto> produtos;

  public Pedido(int id, Entregador entregador, List<Produto> produtos){
    this.id = id;
    this.entregador = entregador;
    this.produtos = produtos;
  }

  //get e set id
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return this.id;
  }

  //get e set entregador
  public void setEntregador(Entregador entregador){
    this.entregador = entregador;
  }
  public Entregador getEntregador(){
    return this.entregador;
  }

  //get e set produtos
  public void setProdutos(List<Produto> produtos){
    this.produtos = produtos;
  }
  public List<Produto> getProdutos(){
    return this.produtos;
  }


  //Métodos

  public void exibirPedido(){
    System.out.println("Número do Pedido: " + this.id);
    System.out.println("\nNome do Entregador: " + this.entregador.getNome());
    System.out.println("\nPedidos: "); 
    int i = 0;
    for(i = 0; i<this.produtos.size(); i++){
      System.out.println(this.produtos.get(i).getNome());
    }
    System.out.println("\n------------------------------------------");
    Loja loja = this.produtos.get(0).getLoja();
    int dist = loja.getDistancia();
    System.out.println("Tempo de Entrega: " + this.entregador.tempoDeEntrega(dist) + " U.M");
    System.out.println("Total: "+ this.calcularTotal());
  }

  public double calcularTotal(){
    int i = 0;
    double total = 0.0;
    
    for(i=0; i<this.produtos.size(); i++)
    {
      total += this.produtos.get(i).getValor();  
    }
    
    return total;
  }
  
}