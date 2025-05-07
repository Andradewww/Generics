package Ex3;
import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {

    private List<T> Produtos = new ArrayList<>();

    public void adicionarProduto(T produto) {
    	Produtos.add(produto);
    }

    public void mostrarProdutos() {
	    for (T produto : Produtos) {
	        System.out.println(produto);
	    }
    }
}

