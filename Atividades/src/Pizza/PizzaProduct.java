package Pizza;

public class PizzaProduct {
	
	private double preco;
	private String tamanhoPizza;
	private String ingrediente1;
	private String ingrediente2;
	private String ingrediente3;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTamanhoPizza() {
		return tamanhoPizza;
	}
	public void setTamanhoPizza(String tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}
	public String getIngrediente1() {
		return ingrediente1;
	}
	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = ingrediente1;
	}
	public String getIngrediente2() {
		return ingrediente2;
	}
	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}
	public String getIngrediente3() {
		return ingrediente3;
	}
	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PizzaProduct [preco=");
		builder.append(preco);
		builder.append(", tamanhoPizza=");
		builder.append(tamanhoPizza);
		builder.append(", ingrediente1=");
		builder.append(ingrediente1);
		builder.append(", ingrediente2=");
		builder.append(ingrediente2);
		builder.append(", ingrediente3=");
		builder.append(ingrediente3);
		builder.append("]");
		return builder.toString();
	}
}
