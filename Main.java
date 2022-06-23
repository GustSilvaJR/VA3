import java.util.ArrayList;
import java.util.List;
class Main {
  
  public static void main(String[] args) {
    
    Loja l1 = new Loja("PopeyeLanches", 10, "Três Coraões, Vila Jessé, Rua Manoel Naves, nº114");

    Produto produto1 = new Produto("X-Popeye", l1, 23.50);
    Produto produto2 = new Produto("X-Brutos", l1, 20.50);
    Produto produto3 = new Produto("X-Olivia", l1, 18.99);
    Produto produto4 = new Produto("X-Tudo", l1, 18.00);
    Produto produto5 = new Produto("X-Bacon", l1, 16.00);
    Produto produto6 = new Produto("X-Salada", l1, 15.00);

    EntregadorDeBike entregador1 = new EntregadorDeBike("Júlio", 22);

    
    List<Produto> produt;
    produt = new ArrayList<Produto>();
    produt.add(produto1);
    produt.add(produto2);
    produt.add(produto3);
    Pedido pedido1 = new Pedido(0, entregador1, produt);

    List<Produto> produt2;
    produt2 = new ArrayList<Produto>();
    produt2.add(produto4);
    produt2.add(produto5);
    produt2.add(produto6);
    Pedido pedido2 = new Pedido(1, entregador1, produt2);

    List<Produto> produt3;
    produt3 = new ArrayList<Produto>();
    produt3.add(produto3);
    produt3.add(produto4);
    produt3.add(produto5);
    Pedido pedido3 = new Pedido(2, entregador1, produt3);

    List<Pedido> pedidos;
    pedidos = new ArrayList<Pedido>();
    pedidos.add(pedido1);
    Cliente cliente1 = new Cliente("Gustavo", pedidos);

    cliente1.relatorio();
    cliente1.dinheiroGasto();

    System.out.println("--------------------------------------");
    
    pedido2.exibirPedido();
    pedido2.calcularTotal();

    
    
    
    
  }
}