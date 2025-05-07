package Ex3;

public class Main {
    public static void main(String[] args) {
    	
        Pedido<ProdutoX> pedido = new Pedido<>();

        ProdutoX p1 = new ProdutoX("Caderno", 12.90);
        ProdutoX p2 = new ProdutoX("Caneta", 2.50);
        ProdutoX p3 = new ProdutoX("Lápis", 1.00);

        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);
        pedido.adicionarProduto(p3);
        
	    System.out.println("Produtos no pedido:");
        pedido.mostrarProdutos();
    }
}
