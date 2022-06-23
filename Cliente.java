import java.util.ArrayList;
import java.util.List;

public class Cliente{
  private String nome;
  private List<Pedido> pedidos;

  public Cliente(String nome, List<Pedido> pedidos){
    this.nome = nome;
    this.pedidos = pedidos;
  }

  //get e set nome
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }

  //get e set pedidos
  public void setPedidos(List<Pedido> pedidos){
    this.pedidos = pedidos;
  }
  public List<Pedido> getPedidos(){
    return this.pedidos;
  }


  //Métodos

  public void relatorio(){
    int i = 0;

    for(i=0; i<this.pedidos.size(); i++){
      System.out.println("Pedido "+i+": \n");
      this.pedidos.get(i).exibirPedido();
      System.out.println("\n\n---------------------------------------------\n\n");
    }
  }

  public void dinheiroGasto(){
    double total = 0.0;
    int i = 0;

    for(i=0; i<this.pedidos.size(); i++){
      total += this.pedidos.get(i).calcularTotal();
    }

    System.out.println("Total Gasto: "+total);
  }
}