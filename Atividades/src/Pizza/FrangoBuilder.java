package Pizza;

public class FrangoBuilder extends PizzaBuilder {
	
	@Override
	public void buildPreco() {
		pizza.setPreco(50.00);
	}
	
	@Override
	public void buildTamanhoPizza() {
		pizza.setTamanhoPizza("Média");
	}
	
	@Override
	public void buildIngrediente1() {
		pizza.setIngrediente1("Frango");
	}
	
	@Override
	public void buildIngrediente2() {
		pizza.setIngrediente2("Tomate");
	}
	
	@Override
	public void buildIngrediente3() {
		pizza.setIngrediente3("Queijo");
	}

}
